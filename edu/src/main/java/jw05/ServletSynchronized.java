package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : ServletSynhronized.java
 * :: Servlet Life Cycle : ONE Request 에 One Thread 동작
 * :: Thread 동기화 문제 : 공유자원에 문제 발생
 * :: Servlet 은 thread 로 동작 :: Servlet 또한 동기화 문제가 발생 할 수 있다
*/
//@WebServlet("/ServletSynchronized")
public class ServletSynchronized extends HttpServlet{
	
	///Field
	//각각의 Thread 에서 공유하는 Field
    private int fieldVariableCount;        

	///service()
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		//공유되지 않는 localVariable 
		int localVariableCount=0;       
		
		//Client 가 Request 시 count 증가
		fieldVariableCount++;
		localVariableCount++;

		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head><title> Servlet Life Cycle</title></head>");
		out.println("<body>");
		out.println("<li> 이 page가 display 된 수(service() 호출된 수) :  "+fieldVariableCount);
		out.println("<li>localVariableCount : "+localVariableCount);
		out.println("</body>");
		out.println("</html>");
	}
	
}//end of class