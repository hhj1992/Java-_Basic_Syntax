package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DataBaseBean{
	//Field
	String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String dbuser= "scott";
	String dbpwd = "tiger";
	String id;
	String pwd;
	
	//constructor
	public DataBaseBean() {}
	
	//setMethod
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//method
	public boolean getUser() {
		
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pStmt= null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			pStmt = con.prepareStatement("SELECT id ,pwd FROM users WHERE id = ?");
			pStmt.setString(1, id);
			
			rs = pStmt.executeQuery();
			String str = "";
			
			if(rs.next()) {
				str = rs.getString("pwd");
				System.out.println("DB���� Ȯ���� id, pwd ==> " +id+" : "+pwd);
			}else {
				System.out.println("DB�� Client���� �Է��� < " +id+" >�� �ش��ϴ� �ڷᰡ �����ϴ�.");
			}
			if(str != null && str.equals(pwd)) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			System.out.println("====> JDBC ���� Exception�� �߻��� ��� <====");	
			e.printStackTrace();
			return false;
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
