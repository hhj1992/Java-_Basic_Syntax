import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : ServletTest.java
	ㅇ Servlet Life Cycle  이해 및 확인
*/
public class ServletTest extends HttpServlet{

	///Field
	// 각각의 method의 호출을 count 위한 변수 선언
	int initCount,serviceCount,destroyCount;
	
	///Method
	// Client 최초 request 시 1번 호출되는 init()  method
	public void init(){
		System.out.println("init() : "+ ++initCount);
	}
	
	//Client request 시 마다 호출되는 service() method
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("service() : "+ ++serviceCount);
	}
	
	// Web Application 이 shutdown 시 호출
	public void destroy(){
		System.out.println("destroy() : "+ ++destroyCount);
	}

}//end of class