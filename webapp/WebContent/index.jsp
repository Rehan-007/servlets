<%@page import="javax.sound.midi.SysexMessage"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%
    Date date = new Date();
  
%>
<%!
    public void jspInit(){
	  System.out.println("this is Init Phase");
   }
   public void jspDestroy(){
	   System.out.println("THis is Destroy phase");
   }
%>
<body>
    <h1 style="color:green;">Date And Time Is <%=date %></h1>
</body>
</html>