package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDao{
	//Field
	String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String dbuser= "scott";
	String dbpwd = "tiger";
	
	//constructor
	public UserDao() {}
	
	//method
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pStmt= null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
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
