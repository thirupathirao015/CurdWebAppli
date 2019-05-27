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
  <h3>Student Edit form</h3>
    <form:form  action="Editsave" modelAttribute="student"  method="GET">
   
    <%-- <c:forEach items="${student}" var="student"> --%>
    
     <form:label path="studentid">Student Id:</form:label>
	<form:input path="studentid" value="${student.studentid}"/>
	 <br />
	<form:label path="firstname">First Name:</form:label>
	<form:input path="firstname" value="${student.firstname}"/>
	<br />
	<form:label path="lastname">Last Name:</form:label>
	<form:input path="lastname" value="${student.lastname}"/>
	<br />
	<form:label path="yearlevel">YearLevel:</form:label>
	<form:input path="yearlevel" value="${student.yearlevel}" />	
	<br /> 
	<input type="submit" value="Edit " />
	<%-- </c:forEach> --%>
</form:form> 
</body>
</html>