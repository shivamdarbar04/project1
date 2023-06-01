package com.currencyconvertordemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pound")
public class PoundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		PrintWriter pw = response.getWriter();
		int amount = Integer.parseInt(request.getParameter("amt"));
		int ans = amount/99;
		
		pw.println("<h1 style=\"color:green;text-align:center\">Your amount in pounds : "+ ans +"</h1>");
	
	}

}
