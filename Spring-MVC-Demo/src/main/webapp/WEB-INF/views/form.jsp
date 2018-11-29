<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Fields</title>
</head>
<body>

<form:form modelAttribute="abdul"
action="${pageContext.request.contextPath}/home"
method="POST">
<table>
<tr>
<td>Emp Id</td>
<td><form:input path="empid"/></td>
</tr>

<tr>
<td>Emp Name</td>
<td><form:input path="empname"/></td>
</tr>

<tr>
<td>Emp Salary</td>
<td><form:input path="empsalary"/></td>
</tr>

<tr>
<td>Emp Location</td>
<td><form:input path="emplocation"/></td>
</tr>

<tr>
<td colspan="3"><input type="submit" value="Save Changes" /></td>
</tr>
</table>
</form:form>
</body>
</html>