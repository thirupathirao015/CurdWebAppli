<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Enter Student Id</h3><br>
<a href="listform">Student list</a><br>
<form:form  action="delete" modelAttribute="student"  method="POST">

	<form:label path="studentid">Student id:</form:label>
	<form:input path="studentid" />
	<br />
	<input type="submit" value="delete " />
</form:form>

</body>
</html>