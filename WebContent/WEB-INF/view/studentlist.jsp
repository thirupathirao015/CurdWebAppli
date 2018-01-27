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
<a href="addform">Student login form</a><br><br>

<c:if test="${!empty student}">
<table border="2">
     <tr>
            <th>Id</th>
            <th>first name</th>
            <th>last name</th>
            <th>year level</th>
            <th>Edit</th>
            <th>Delete</th>
            
    </tr>
  <c:forEach items="${student}" var="student">
      <tr> 
         <td>${student.studentid}</td>
         <td>${student.firstname}</td>
         <td>${student.lastname}</td>
         <td>${student.yearlevel}</td>
         <td><a href="Editform">Edit</a></td>
          <td><a href="deleteform">delete</a></td>
     </tr>
   </c:forEach>
</table>
</c:if>
</body>
</html>