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
public class DateServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set response contentType
		resp.setContentType("text/html");
		//get PrintWriter
		PrintWriter pw=resp.getWriter();
		//b logic
		Date d=new Date();
		pw.println("<h1>Date and time is::"+d+"</h1>");
		//add home hyperlink
		
		
		pw.println("<br><a href='index.jsp'>home</a>");
		//cl0se the stream
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
