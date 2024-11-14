<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "False" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h1>User Created Successfully</h1>
	<table class="table-info">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">User Name</th>
	      <th scope="col">Email</th>
	      <th scope="col">password</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th scope="row">${user.id}</th>
	      <td>${user.name}</td>
	      <td>${user.email}</td>
	      <td>${user.password}</td>
	    </tr>
	  </tbody>
	</table>
</body>
</html>