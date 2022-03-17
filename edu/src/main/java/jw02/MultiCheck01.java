package jw02;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : MultiCheck01.java
 */
//@WebServlet("/MultiCheck01")
public class MultiCheck01 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<boby><center><h2>Client���� ���۵� ����</h2></center><p>");

		String name = convertKo(req.getParameter("name"));
		String addr = this.convertKo(req.getParameter("addr"));
	
		out.println("<li>�̸� : "+ name);
		out.println("<li>�ּ� : "+ addr);
		
		/*//[ó����� 1]  sw �� checkbox  ���� ������ ����, getParameter()�� ó���� ���
         String sw = req.getParameter("sw");
         out.println("<li>�������  SW : "+ sw);
        */
         //[ó����� 2]  1. sw �� checkbox  �������� value ������ �ִ�.
        //                         2. ���� ������ ��� array �� return �ϴ� getParameterValues() ���.
          	out.println("<br>�����Ͻ� sw�Ʒ��� �����ϴ�.<br>");
            String[] sw = req.getParameterValues("sw");

            for(int i=0;i<sw.length;i++){
                out.println("<li>"+sw[i]);
            }
        
		out.println("<li>������� OS : "+  req.getParameter("os"));
		out.println("<li>������� cpu : "+ req.getParameter("cpu"));
		out.println("</body></html>");
	}
	
	///Method
	private String convertKo(String paramValue){
		String convertParamValue = null;
		try{
			byte[] b = paramValue.getBytes("8859_1");
			convertParamValue = new String(b,"EUC_KR");
		}catch(UnsupportedEncodingException uee){
			System.out.println("�ѱ� ��ȯ�� Exception �߻�");
			uee.printStackTrace();
		}
		return convertParamValue;
	}
	
}//end of class