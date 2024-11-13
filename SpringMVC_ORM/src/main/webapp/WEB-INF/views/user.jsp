<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Create User</title>
  </head>
  <body>
  
  <div class="container mt-5">
  
    	<h1 class="text-center">Create user</h1>
    	
    	<form action="processUserForm" method="post">
    		<div class="form-group">
			    <label for="userName">Username</label>
			    <input name="name" type="text" class="form-control" id="userName" placeholder="Enter username">
		 	</div>
    	
    		<div class="form-group">
			    <label for="userEmail">Email address</label>
			    <input name="email" type="email" class="form-control" id="userEmail" aria-describedby="emailHelp" placeholder="Enter email">
		 	</div>
		 	
		 	<div class="form-group">
			    <label for="userPassword">Password</label>
			    <input name="password" type="password" class="form-control" id="userPassword" placeholder="Enter password">		    
		 	</div>
		 	
		 	<div class="text-center">
		 		<button type="submit" class="btn btn-primary">Submit</button>
		 	</div>
    	</form>
   </div>

    </body>
</html>