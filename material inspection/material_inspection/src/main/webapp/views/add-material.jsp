<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.zettamine.mi.entities.States"%>
<html>
<head>
<link rel="stylesheet" href="/css/add.css">
<title>Add Material</title>
<style>
h3 {
	text-align: center;
}

.form {
	max-width: 600px;
	margin: 20px auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
</style>
</head>


<body>

			<form:form action="add-material" method="post" class="form"
				modelAttribute="material">
				<h3>Add Material</h3>

				<table>
					<tr>
						<td><label>Material Id *</label></td>
						<td><form:input type="text" path="materialId"
								required="required" /></td>

					</tr>
					<tr>
						<td><label>Description *</label></td>
						<td><form:input type="text" path="description"
								required="required" /></td>
					</tr>

					<tr>
						<td><label>Material Type *</label></td>
						<td><form:input type="text" required="required" path="materialType" /></td>

					</tr>
					
					<tr>
						<td><label>No of Characteristics *</label></td>
						<td><form:input type="text" required="required" path="noOfChar" /></td>

					</tr>

					<tr>
						<td><button type="submit">Add</button></td>
						<td><button type="reset">Reset</button></td>
						<td><button type="button"
								onclick="window.location.href='/material-inspection/material'">Cancel</button></td>
					</tr>

				</table>


			</form:form>
		

</body>
</html>