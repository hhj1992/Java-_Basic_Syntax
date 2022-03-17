package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import common.AbstractDao;
import vo.UserVO;


public class UserDAO extends AbstractDao {
	
	
	//method
	public void addUser(UserVO vo){
		//localVariable
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query = "";
		int check = 0;
		//try
		try {
			con = this.connect();
			
			query = "INSERT INTO work  VALUES (?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getSex());
			pstmt.setString(5, vo.getYear());
			pstmt.setString(6, vo.getMonth());
			pstmt.setString(7, vo.getDay());
			pstmt.setString(8, vo.getEducation());
			pstmt.setString(9, vo.getJob());
			
			check = pstmt.executeUpdate();
			if(check == 1) {
				vo.setActive(true);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
	}//end of addUser
	public UserVO findUser(String name) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null ;
		
		UserVO vo = new UserVO();
		
		if(!(name.equals("") || name== null)){
			try{
				String query = "select * from work where name = ? ";
				
				con = this.connect();
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, name);
							
				rs = pstmt.executeQuery();
				if(rs.next()) {
					System.out.println(rs.getString("name"));
					
					vo.setId(rs.getString("id"));
					vo.setPassword(rs.getString("password"));
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
				close(con, pstmt, rs);
			}
			return vo;
		}
		return null;
	}//end of findUser
	public void updateUser(UserVO vo) {
		//localVariable
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String query = "";
		int check = 0;
		//try
		try {
			con = this.connect();
			
			query = "UPDATE work "
					+ "set password = ? , sex= ? ,  year = ? , month = ? , day=?, education = ? , job = ? "
					+ "where id = ? ";
			pstmt = con.prepareStatement(query);
			
//			pstmt.setString(1, vo.getId());
			pstmt.setString(1, vo.getPassword());
//			pstmt.setString(3, vo.getName());
			pstmt.setString(2, vo.getSex());
			pstmt.setString(3, vo.getYear());
			pstmt.setString(4, vo.getMonth());
			pstmt.setString(5, vo.getDay());
			pstmt.setString(6, vo.getEducation());
			pstmt.setString(7, vo.getJob());
			pstmt.setString(8, vo.getId());
			
			check = pstmt.executeUpdate();
			if(check == 1) {
				vo.setActive(true);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
	}
	
	
}// end of userDAO
