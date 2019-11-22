package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empname = req.getParameter("empname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		ServletContext context = getServletContext();
		String companyname = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchname = config.getInitParameter("batch-name");
		
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1>");
		out.println(empname);
		out.println("</h1>");
		
		out.println("<h1>");
		out.println(email);
		out.println("</h1>");
		
		out.println("<h1>");
		out.println(password);
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyname);
		out.println("<h2>");
		
		out.println("<h2>");
		out.println(batchname);
		out.println("<h2>");
		
		out.println("</body>");
		
	}//End of doGet()

}//End of Class Body
