<%@page isELIgnored="false"  %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>User Sign up</title>
  </head>
  <body>
		<h2>Submitted User Details</h2>
	      <table class="table-info">
	         <tr>
	            <td><strong>Username:</strong></td>
	            <td>${user.name}</td>
	         </tr>
	         <tr>
	            <td><strong>Email:</strong></td>
	            <td>${user.email}</td>
	         </tr>
	         <tr>
	            <td><strong>Password:</strong></td>
	            <td>${user.password}</td>
	         </tr>
	      </table> 
</body>
</html>