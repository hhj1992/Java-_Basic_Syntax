package jw.common.pool;

import java.sql.Connection;

import oracle.jdbc.pool.OracleConnectionCacheImpl;

/*
* Oracle API���� �����ϴ� connectionPool��� �̿� ���� 
* OracleConnectionCacheImpl.class�� �̿��Ͽ� ConnectionPool ����
* << Singleton pattern �̿� >>
*/
public class OracleConnectionPool {
	/// Field
	//==>singleTon pattern ��Ģ 1 : �ڽ��� ��ü�� static ���� ����
	private static OracleConnectionPool instance;
	private OracleConnectionCacheImpl occi;
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String password = "tiger";
	private int minConn = 5;				//������ connnection�� �ּҼ�
	private int maxConn = 10;			//������ connnection�� �ִ��
	
	/// Constructor
	//==>singleTon pattern ��Ģ 2 : �����ڴ� private ���� ::�ܺο��� �����Ұ�
	private OracleConnectionPool() {
		try {
			occi = new OracleConnectionCacheImpl();
			occi.setURL(url);
			occi.setUser(user);
			occi.setPassword(password);
			occi.setMinLimit(minConn);
			occi.setMaxLimit(maxConn);
		} catch(Exception e) {			e.printStackTrace();			}	
	}
	
	/// Method  For only one instance ����
	//==>singleTon pattern ��Ģ 3 : �ڽ��� �ν��Ͻ� return �ϴ� static metod
	public static synchronized OracleConnectionPool getInstance() {		
		if(instance==null) instance = new OracleConnectionPool();		
		return instance;
	}
	
	// occi�� ������ �ִ� con�� �ѱ��(5 ~ 10)
	public synchronized Connection getConnection() {
		Connection conn = null;
		try{	conn = occi.getConnection();	}
		catch(Exception e) {	e.printStackTrace();	}
		return conn;
	}
	
	// occi�� ������ �ִ� con�� �ݴ´�.(5 ~ 10)
	public synchronized void close() {
		try {	occi.close();		}
		catch(Exception e) {	e.printStackTrace();	}
	}
	
	//////////////////////////// �Ʒ��� �� method�� test���̴�. //////////////////
	//������� ��� connection��
	public int getCacheSize()		{		return occi.getCacheSize();	 	}
	//������ Client���� ������(�������) Connection ��	
	public int getActiveSize()		{		return occi.getActiveSize();		}
	
}//end of class