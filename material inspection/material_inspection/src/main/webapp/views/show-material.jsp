<jsp:include page="header.jsp"></jsp:include>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="com.zettamine.mi.entities.Plant" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/search-list.css"/>
<style type="text/css">
	h3{
		text-align: center;
	}
</style>
<title>Material List</title>
</head>
<body>
<h3>Material List</h3>
	<br>
    <input type="button" value="Back" onclick="window.location.href='/material-inspection/material'">
	 <table class="search-results">
    <thead>
      <tr>
        <th>Material Id</th>
        <th>Material Name</th>
        <th>Material Type</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
		
			<c:forEach var="material" items="${allMaterial}">

			<tr>	
				<td>${material.getMaterialId()}</td>		
				<td>${material.getDescription()}</td>
				<td>${material.getMaterialType()}</td>
				
				<td class="action-links">
				<a class="view-project" href="/material-inspection/material/edit/id=${material.getMaterialId()}">Edit</a>
            <a class="add-project" href="/material-inspection/material/delete/id=${material.getMaterialId()}">Delete</a>
            
			</tr>
			</c:forEach>	
		
    </tbody>
  </table>
  
  
</body>
</html>