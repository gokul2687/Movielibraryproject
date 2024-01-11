<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add Movie</h1>

<form action="addmovie" method="post" enctype="multipart/form-data">
	
	<label>Movie Id :</label>
	<input type="number" name="movieid">
	<br>
	<br>
	<label>Movie Name :</label>
	<input type="text" name="moviename">
	<br>
	<br>
	<label>Movie Price :</label>
	<input type="number" name="movieprice">
	<br>
	<br>
	<label>Movie Rating</label>
	<input type="number" name="movierating">
	<br>
	<br>
	<label>Movie Genre :</label>
	<input type="text" name="moviegenre">
	<br>
	<br>
	<label>Movie Language :</label>
	<input type="text" name="movielanguage">
	<br>
	<br>
	<label>Movie Image :</label>
	<input type="file" name="movieimage">
	<br>
	<br>
	<button>Submit</button>

</form>
</body>
</html>