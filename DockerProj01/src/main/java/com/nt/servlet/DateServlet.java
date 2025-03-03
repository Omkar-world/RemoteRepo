package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//get PrintWriter
		PrintWriter pw = resp.getWriter();
		
		//set content type
			resp.setContentType("text/html");
			//write blogic
			
			Date d=new Date();
			//write repsonse 
			pw.print("<h1 style='color:red;text-align=center'>Date And Time is::"+d+"</h1>");
			//add home hyper link
			
			pw.print("<br><a href='index.jsp'>Home</a>");
			
			//close  the strem
			pw.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
