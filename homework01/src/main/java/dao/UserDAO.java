package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import vo.UserVO;


public class UserDAO {
	
	
	//method
	public void addUser(UserVO vo){
		//localVariable
		InitialContext ic = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query = "";
		int check = 0;
		//try
		try {
			ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			
			con = ds.getConnection();
			
			query = "INSERT INTO work  VALUES (?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getSex());
			pstmt.setString(3, vo.getYear());
			pstmt.setString(4, vo.getMonth());
			pstmt.setString(5, vo.getDay());
			pstmt.setString(6, vo.getEducation());
			pstmt.setString(7, vo.getJob());
			
			check = pstmt.executeUpdate();
			if(check == 1) {
				vo.setActive(true);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) try {con.close();}catch (SQLException e1) {}
			if(pstmt != null) try {pstmt.close();}catch (SQLException e2) {}
		}
	}//end of addUser
	public UserVO findUser(String name) {
		Connection con = null;
		InitialContext ic = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null ;
		
		UserVO vo = new UserVO();
		
		if(!(name.equals("") || name== null)){
			try{
				ic = new InitialContext();
				DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
				String query = "select * from work where name = ? ";
				
				con = ds.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, name);
							
				rs = pstmt.executeQuery();
				if(rs.next()) {
					System.out.println(rs.getString("name"));
					vo.setName(rs.getString("name"));
					vo.setSex(rs.getString("sex"));
					vo.setYear(rs.getString("year"));
					vo.setMonth(rs.getString("month"));
					vo.setDay(rs.getString("day"));
					vo.setEducation(rs.getString("education"));
					vo.setJob(rs.getString("job"));
				}else {
					return null;
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(con != null) try {con.close();}catch (SQLException e1) {}
				if(pstmt != null) try {pstmt.close();}catch (SQLException e2) {}
				if(rs != null) try {rs.close();}catch (SQLException e3) {}
			}
			return vo;
		}
		return null;
	}//end of findUser

}// end of userDAO
