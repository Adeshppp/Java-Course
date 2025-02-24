<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome to Springboot world! by using tomcat jasper dependancy.
<br>
<br>
<br>
<br>
	<form action="addStudent" method="post">
	    Enter your ID : <input type="text" name="id"></input>
	    <br>
	    <br>
	    Enter your Name : <input type="text" name="name"></input>
	    <input type="submit">
	</form>
<br>
	  <hr>
	  <br>
        <h1>get student by using id </h1>
	<form action="getStudent" method="get">
	Enter your ID: <input type="text" name="id"></input>
	<input type="submit">
	</form>
	<br>
	<hr>
	  <br>
        <h1>get student by using name</h1>
	<form action="getStudentByName" method="get">
	Enter your Name: <input type="text" name="aname"></input>
	<input type="submit">
	</form>

</body>
</html>
