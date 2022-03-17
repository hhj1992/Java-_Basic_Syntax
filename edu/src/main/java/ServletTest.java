import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	�� Servlet Life Cycle  ���� �� Ȯ��
*/
public class ServletTest extends HttpServlet{

	///Field
	// ������ method�� ȣ���� count ���� ���� ����
	int initCount,serviceCount,destroyCount;
	
	///Method
	// Client ���� request �� 1�� ȣ��Ǵ� init()  method
	public void init(){
		System.out.println("init() : "+ ++initCount);
	}
	
	//Client request �� ���� ȣ��Ǵ� service() method
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("service() : "+ ++serviceCount);
	}
	
	// Web Application �� shutdown �� ȣ��
	public void destroy(){
		System.out.println("destroy() : "+ ++destroyCount);
	}

}//end of class