<%@page import="java.util.Base64"%>
<%@page import="dto.Movie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Movie m = (Movie)request.getAttribute("movie") ;%>


<form action="edit" method="post" enctype="multipart/form-data">
	
	<label>Movie Id :</label>
	<input type="number" name="movieid" value="<%= m.getMovieid()%>" readonly>
	<br>
	<br>
	<label>Movie Name :</label>
	<input type="text" name="moviename" value="<%= m.getMoviename()%>">
	<br>
	<br>
	<label>Movie Price :</label>
	<input type="number" name="movieprice"  value="<%= m.getMovieprice()%>">
	<br>
	<br>
	<label>Movie Rating</label>
	<input type="number" name="movierating" value="<%= m.getMovierating()%>">
	<br>
	<br>
	<label>Movie Genre :</label>
	<input type="text" name="moviegenre" value="<%= m.getMoviegenre()%>">
	<br>
	<br>
	<label>Movie Language :</label>
	<input type="text" name="movielanguage" value="<%= m.getMovielanguage()%>">
	<br>
	<br>
	<label>Movie Image :</label>
	<input type="file" name="movieimage">
	<br>
	<br>
	<button>Submit</button>
	
		<% String base64image = new String(Base64.getEncoder().encode(m.getMovieimage())); %>
	
	
	<%if(base64image.length()>0){ %>
		
	<img src="data:image/jpeg;base64, <%= base64image%>" height = "100px"  width = "100px" >
	
	<%} %>
			

</form>


</body>
</html>