<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="alogin" method="post">
	<label>E-mail : </label>
	<input type="email" name="email" required="please enter your email">
	<br>
	<br>
	<label>Password :</label>
	<input type="password" name="password" required="please enter your password">
	<br>
	<br>
	<button>Submit</button>
	<br>
	<br>
	<%String message =(String) request.getAttribute("message") ;%>
	<%if(message != null) {%>
	<%= message %>
	<%} %>
	
	

</form>



</body>
</html>