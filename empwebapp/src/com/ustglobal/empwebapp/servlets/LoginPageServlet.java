package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();


		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='ISO-8859-1'>\r\n" + 
				"<title>Login</title>\r\n" + 
				"<!-- Compiled and minified CSS -->\r\n" + 
				"<link rel='stylesheet'\r\n" + 
				"	href='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css'>\r\n" + 
				"<link href='http://fonts.googleapis.com/icon?family=Material+Icons'\r\n" + 
				"	rel='stylesheet'>\r\n" + 
				"<link rel='stylesheet'\r\n" + 
				"	href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css'>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<div class='row'>\r\n" + 
				"		<form class='col s12' action='./login' method='post'>\r\n" + 
				"			<div class='row'>\r\n" + 
				"				<div class='input-field col s6'>\r\n" + 
				"					<i class='material-icons prefix'>account_circle</i> <input\r\n" + 
				"						id='icon_prefix' type='text' class='validate' name='id' value ='"+id+"'> <label\r\n" + 
				"						for='icon_prefix'>Id</label>\r\n" + 
				"				</div>\r\n" + 
				"				<div class='input-field col s6'>\r\n" + 
				"					<i class='material-icons prefix'>lock</i> <input id='password'\r\n" + 
				"						type='password' class='validate' name='password'> <label\r\n" + 
				"						for='icon_telephone'>Password</label>\r\n" + 
				"				</div>\r\n" + 
				"			</div>\r\n" + 
				"			<p>\r\n" + 
				"				<label> <input type='checkbox' class='filled-in'\r\n" + 
				"					checked='checked' name='rememberme' value='checked' /> <span>Remmember Me</span>\r\n" + 
				"				</label>\r\n" + 
				"			</p>\r\n" + 
				"			<div>\r\n" + 
				"				<button class='btn waves-effect waves-light' type='submit'\r\n" + 
				"					name='submit'>\r\n" + 
				"					login <i class='material-icons right'>send</i>\r\n" + 
				"				</button>\r\n" + 
				"				<a  href='./register.html'>Register</a>\r\n" + 
				"			</div>\r\n" + 
				"\r\n" + 
				"		</form>\r\n" + 
				"\r\n" + 
				"	</div>\r\n" + 
				"\r\n" + 
				"	<!-- Compiled and minified JavaScript -->\r\n" + 
				"	<script\r\n" + 
				"		src='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js'></script>\r\n" + 
				"	<script type='text/javascript'\r\n" + 
				"		src='https://code.jquery.com/jquery-2.1.1.min.js'></script>\r\n" + 
				"	<script\r\n" + 
				"		src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js'></script>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	} // End Of doPost()

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}// End Of doPost()
	
}//End Of LoginPageServlet
