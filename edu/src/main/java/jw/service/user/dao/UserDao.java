package jw.service.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jw.common.dao.AbstractDao;
import jw.service.user.vo.UserVO;

public class UserDao extends AbstractDao{
	//Field
	//String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//String dbuser= "scott";
	//String dbpwd = "tiger";
	
	//constructor
	public UserDao() {}
	
	//method
	public void getUser(UserVO userVO) {
		
		Connection con = null;
		PreparedStatement pStmt= null;
		ResultSet rs = null;
		
		try {
			con = this.connect();
			
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
			e.printStackTrace();
		}finally {
			this.close(con,pStmt,rs);
		}
		
	}// end of getUser()
	public boolean addUser(UserVO userVO){
		Connection con = null;
		PreparedStatement pStmt = null;
		boolean insertResult   = false;
		try{		
			//1�ܰ� connection
			con = this.connect();
			
			//2�ܰ� statement 
			pStmt = con.prepareStatement(	"INSERT " +
																		"INTO users ( no, id, pwd) " +
																		"VALUES( ? , ? , ? )" );
			pStmt.setInt(1,userVO.getNo());
			pStmt.setString(2,userVO.getId());
			pStmt.setString(3,userVO.getPwd());

			//3�ܰ� ����� Ȯ���ϱ�
			if( 1 == pStmt.executeUpdate()){    
				insertResult = true;
			}
		}catch(Exception e){		
			e.printStackTrace();
		}finally{
			this.close(con,pStmt);
		}
		return insertResult; 
	}//end of addUser()
	
	public List<UserVO> getUserList() {
		ArrayList<UserVO> arrayList = new ArrayList<UserVO>(); 
		Connection con = null;
		PreparedStatement pStmt= null;
		ResultSet rs = null;
		
		try {
			con = this.connect();
			
			pStmt = con.prepareStatement("SELECT no, id, pwd FROM users ORDER BY no ");
			
			rs = pStmt.executeQuery();
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setPwd(rs.getString("pwd"));
				vo.setId(rs.getString("id"));
				
				System.out.println(vo);
				
				arrayList.add(vo);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.close(con,pStmt,rs);
		}
		
		return arrayList;
	}
}// end of class
