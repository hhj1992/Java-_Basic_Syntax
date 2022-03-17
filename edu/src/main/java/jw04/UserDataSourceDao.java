package jw04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDataSourceDao{
	//Field
	//String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//String dbuser= "scott";
	//String dbpwd = "tiger";
	
	//constructor
	public UserDataSourceDao() {}
	
	//method
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pStmt= null;
		ResultSet rs = null;
		
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			//con = OracleConnectionPool.getInstance().getConnection();
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
											// java:comp : naming service root
											// env : enviroment
											// jdbc : server.xml�� ��ϵ� name
			con = ds.getConnection();
			
			pStmt = con.prepareStatement("SELECT id ,pwd FROM users WHERE id = ? AND pwd = ?");
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());
			
			rs = pStmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("DB���� Ȯ���� id , pwd ==> " +userVO.getId()+" : "+userVO.getPwd());
				userVO.setActive(true);
			}else {
				System.out.println("DB�� Client���� �Է��� < " +userVO.getId()+" >�� �ش��ϴ� �ڷᰡ �����ϴ�.");
			}
			
		} catch (Exception e) {
			System.out.println("====> JDBC ���� Exception�� �߻��� ��� <====");	
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {rs.close();} catch (Exception e1) {}
			}
			if(con != null) {
				try {con.close();} catch (Exception e2) {}
			}
			if(pStmt != null) {
				try {pStmt.close();} catch (Exception e3) {}
			}
		}
		
	}

	
		
		
		

}
