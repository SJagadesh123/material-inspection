<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.zettamine.mi.entities.States"%>
<html>
<head>
<link rel="stylesheet" href="/css/add.css">
<title>Add Characteristic</title>
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

	<form:form action="add-Characteristic" method="post" class="form"
		modelAttribute="material">
		<h3>Add Characteristic</h3>

		<table>
			<tr>
				<td><form:input type="hidden" path="materialId"
						required="required" value="${material.getMaterialId()}" /></td>

			</tr>
			<tr>
				<td><form:input type="hidden" path="description"
						required="required" value="${material.getDescription()}" /></td>
			</tr>

			<tr>
				<td><form:input type="hidden" required="required"
						path="materialType" value="${material.getMaterialType()}" /></td>

			</tr>

			<tr>
				<td><form:input type="hidden" required="required"
						path="noOfChar" value="${material.getNoOfChar()}" /></td>

			</tr>

			<c:forEach var="i" begin="0" end="${material.noOfChar - 1}">
				<tr>
					<td><label>Characteristic No : ${i+1}</label></td>
				</tr>
			
				<tr>
					<td><label>Characteristic Description:</label></td>
					<td><form:input type="text"
							path="characteristics[${i}].chDesc" /></td>
				</tr>
				<tr>
				<td><label>Unit of Measurement:</label></td>
				<td><form:input type="text" path="characteristics[${i}].uom" /></td>
				</tr>
				<tr>			
				<td><label>Tolerance Upper Limit:</label></td>
				<td><form:input type="text" path="characteristics[${i}].upperLimit" /></td>
				</tr>
				<tr>
				<td><label>Tolerance Lower Limit:</label></td>
				<td><form:input type="text" path="characteristics[${i}].lowerLimit" /></td>
				</tr>
				
			</c:forEach>

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