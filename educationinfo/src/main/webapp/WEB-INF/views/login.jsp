<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

	<head>
		<title>Education INFO...</title>
	</head>

	<body>
		<h1>Login Page</h1>
		<h2 style="color: red;">${message}</h2>
		<form:form action="login.htm" method="post" commandName="user">
		<table>
		 <tr>
		  <td>UserName : </td>
		  <td><input type="text" name="userName"> </td>
		 </tr>
		 
		 <tr>
		  <td>Password : </td>
		  <td><input type="password" name="password"> </td>
		 </tr>
		 
		 <tr>
		  <td><input type="submit" value="Submit"> </td>
		  <td><input type="reset" value="Cancel"> </td>
		 </tr>
		</table>
		</form:form>
		<br>
		New USer?<a href="register.htm">Register</a>
	</body>
</html>
