package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AbstractDao{
	//Field
	//constructor
	public AbstractDao() {}
	//method
	public Connection connect() {
		Connection con = null ;
		try {
			con = DBUtil.getConnection();
		} catch (RuntimeException ex) {
			throw ex;
		}
		return con;
	}// end of connect
	
	public void close(Connection con, PreparedStatement pStmt, ResultSet rs ) {
		if(rs != null ) {
			try {
				rs.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		this.close(con,pStmt);
		
	}// end of close
	public void close(Connection con, PreparedStatement pStmt) {
		if(pStmt != null ) {
			try {
				pStmt.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if(con != null ) {
			try {
				con.close();
			} catch (Exception ex) {
				ex.printStackTrace();	
			}
		}
		
	}// end of close

}
