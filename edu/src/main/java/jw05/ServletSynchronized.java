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
 * :: Servlet Life Cycle : ONE Request �� One Thread ����
 * :: Thread ����ȭ ���� : �����ڿ��� ���� �߻�
 * :: Servlet �� thread �� ���� :: Servlet ���� ����ȭ ������ �߻� �� �� �ִ�
*/
//@WebServlet("/ServletSynchronized")
public class ServletSynchronized extends HttpServlet{
	
	///Field
	//������ Thread ���� �����ϴ� Field
    private int fieldVariableCount;        

	///service()
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		//�������� �ʴ� localVariable 
		int localVariableCount=0;       
		
		//Client �� Request �� count ����
		fieldVariableCount++;
		localVariableCount++;

		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head><title> Servlet Life Cycle</title></head>");
		out.println("<body>");
		out.println("<li> �� page�� display �� ��(service() ȣ��� ��) :  "+fieldVariableCount);
		out.println("<li>localVariableCount : "+localVariableCount);
		out.println("</body>");
		out.println("</html>");
	}
	
}//end of class