<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<h1>Student Table</h1>
<a href="listform">Student list</a><br><br>
<form:form  action="savestudent" modelAttribute="student"  method="POST">

	<form:label path="firstname">First Name:</form:label>
	<form:input path="firstname" />
	<br />
	<form:label path="lastname">Last Name:</form:label>
	<form:input path="lastname" />
	<br />
	<form:label path="yearlevel">YearLevel:</form:label>
	<form:input path="yearlevel" />
	<br />
	<input type="submit" value="Save " />
</form:form> 
</body>
</html>

<!-- http://localhost:8082/CurdWebAppli/addform -->
<%-- <form:form modelAttribute="student" action="savestudent" method="post">
<table>
     <tr>
          <td>Student Id</td>
          <td><form:input path="studentId"/></td>
     </tr>
      <tr>
          <td>First name</td>
          <td><form:input path="firstname"/></td>
     </tr>
      <tr>
          <td>Last name</td>
          <td><form:input path="lastname"/></td>
     </tr>
      <tr>
          <td>Year Level</td>
          <td><form:input path="yearLevel"/></td>
     </tr>
     <tr>
         <td colspan="2">
         <input type="submit" name="action" value="Add"/>
         <!-- <input type="submit" name="action" value="Edit"/>
          <input type="submit" name="action" value="Delete"/>
           <input type="submit" name="action" value="Search"/> -->
         </td>
     </tr>
</table>
</form:form> --%>
