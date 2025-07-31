<%@page import="java.io.IOException"%>
<%@ page language="java"    import="java.util.* , com.hexaware.springmvc.entity.*"   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> All Employee Details : </h1> <br>

${empList}  <br> <br>

	<%
	
	
	   List<Employee>  empList = (List<Employee>)    session.getAttribute("empList");
	
			
	   
		out.print(empList);
	
	%>



</body>
</html>