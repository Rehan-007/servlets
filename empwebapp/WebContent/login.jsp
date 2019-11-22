<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css'>
<link href='http://fonts.googleapis.com/icon?family=Material+Icons'
	rel='stylesheet'>
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css'>
</head>

<jsp:useBean id="msg" class = "java.lang.String" scope="request"/>
  
  <%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
  %>

<body>

    <h4><%=msg%></h4>

	<div class='row'>
		<form class='col s12' action='./login' method='post'>
			<div class='row'>
				<div class='input-field col s6'>
					<i class='material-icons prefix'>account_circle</i> <input
						id='icon_prefix' type='text' class='validate' name='id' value='<%=id%>'> <label
						for='icon_prefix'>Id</label>
				</div>
				<div class='input-field col s6'>
					<i class='material-icons prefix'>lock</i> <input id='password'
						type='password' class='validate' name='password'> <label
						for='icon_telephone'>Password</label>
				</div>
			</div>
			<p>
				<label> <input type='checkbox' class='filled-in'
					checked='checked' name='rememberme' value='checked' /> <span>Remmember
						Me</span>
				</label>
			</p>
			<div>
				<button class='btn waves-effect waves-light' type='submit'
					name='submit'>
					login <i class='material-icons right'>send</i>
				</button>
				<a href='./register.html'>Register</a>
			</div>

		</form>

	</div>

	<!-- Compiled and minified JavaScript -->
	<script
		src='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js'></script>
	<script type='text/javascript'
		src='https://code.jquery.com/jquery-2.1.1.min.js'></script>
	<script
		src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js'></script>
</body>
</html>