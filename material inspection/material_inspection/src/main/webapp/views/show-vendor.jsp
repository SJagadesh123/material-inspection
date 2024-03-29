<jsp:include page="header.jsp"></jsp:include>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="com.zettamine.mi.entities.Vendor" %>

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
<title>Vendor List</title>
</head>
<body>
<h3>Vendor List</h3>
	<br>
    <input type="button" value="Back" onclick="window.location.href='/material-inspection/vendor'">
	 <table class="search-results">
    <thead>
      <tr>
        <th>Vendor Name</th>
        <th>Email</th>
        <th>City</th>
        <th>State</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
		
			<c:forEach var="vendor" items="${allVendors}">

			<tr>
				
				<td>${vendor.getVendorName()}</td>
				<td>${vendor.getEmail()}</td>
				<td>${vendor.getCity()}</td>
				<td>${vendor.getState()}</td>
				<td class="action-links">
				<a class="view-project" href="/material-inspection/vendor/edit/id=${vendor.getVendorId()}">Edit</a>
            <a class="add-project" href="/material-inspection/vendor/delete/id=${vendor.getVendorId()}">Delete</a>
            
			</tr>
			</c:forEach>	
		
    </tbody>
  </table>
  
  
</body>
</html>