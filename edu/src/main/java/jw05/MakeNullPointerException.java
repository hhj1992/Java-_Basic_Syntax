package jw05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : MakeNullPointerException.java
 * 	:: java.lang.NullPointerException 발생시킨다.
*/
//@WebServlet("/MakeNullPointerException")
public class MakeNullPointerException extends HttpServlet{
	///init()
	///service()
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String str = null;
		System.out.println(str.toString()) ;
	}
	///destroy()
}//end of class