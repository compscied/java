<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Integer Increment </title>
</head>
<body>
<%
	String name = request.getParameter("integer");
	int v = 0;
	try {
		v = Integer.parseInt(request.getParameter("intval"))+1; 
	}
	catch (Exception e) { 
		v = 0; 
	}
%>

<form method="post" action="index.jsp">

<input type="hidden" name="name" value="<%=name%>">

Enter an integer: <input type="text" name="intval" value="<%=v%>"/>

<br/>
<input type="submit" value="Submit"/>
</body>
</html>
