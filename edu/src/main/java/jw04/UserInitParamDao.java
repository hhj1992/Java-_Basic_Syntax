package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserInitParamDao{
	//Field
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;
	
	//constructor
	public UserInitParamDao() {}
	
	//method
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}
	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}
	public void setJdbcPasswd(String jdbcPasswd) {
		this.jdbcPasswd = jdbcPasswd;
	}
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pStmt= null;
		ResultSet rs = null;
		
		try {
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPasswd);
			
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
