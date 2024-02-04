<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page import="com.zettamine.mi.entities.Users" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/home-style.css">
<link rel="stylesheet" href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css">
<title>Home Page</title>
</head>
	
<body>

 <% Users users = (Users)session.getAttribute("user"); %>
<h3>Hello <%=users.getUserName().toUpperCase() %></h3>

<br>
<br>
<br>
<br>
	<ul>
		<li><a href="/material-inspection/vendor">Vendor</a></li>
		<li><a href="/material-inspection/plant">Plant</a></li>
		<li><a href="/material-inspection/material">Material</a></li>
		<li><a href="/material-inspection/inspection">Material Inspection</a></li>
	</ul>

</body>
</html>