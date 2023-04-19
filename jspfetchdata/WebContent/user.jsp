<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
Name::<input type="text" name="uname"><br/><br/>
email_id::<input type="text" name="uemail"><br/><br/>
Password::<input type="password" name="upass"><br/><br/>
Date of birth::<input type="date" name="udob"><br/><br/>
Gender::<input type="radio" name="ugender" value="Male">Male
<input type="radio" name="ugender" value="Female">Female<br/><br/>
Country::<select name="ucountry">
<option>INDIA</option>
<option>FRANCE</option>
<option>CHINA</option>
<option>USA</option>
<option>AFRICA</option>
<option>UGANDA</option>
<option>OTHERS</option>
</select><br/><br/>
Hobbies::<input type="checkbox" name="uhob" name="music">Music
<input type="checkbox" name="uhob" value="fishing">Fishing
<input type="checkbox" name="uhob" value="sports">Sports
<input type="checkbox" name="uhob" value="adventure">Adventure
<input type="checkbox" name="uhob" value="study">Study
<input type="checkbox" name="uhob" value="dance">Dance
<input type="checkbox" name="uhob" value="others">Others<br/><br/>
<input type="submit" value="register">
</form>
</body>
</html>