<html>
<body>
	<h1>Enter Your Details</h1>
	<form:errors path = "user1.*/" />
	<form action = "/mvc/submit" method = "post">
		<p> Username: <input type="text" name="username"/></p>
		<p> Password: <input type="password" name="password"/></p>
		<p> Email_Id: <input type="email" name="email"/></p>
		
		<input type = "submit" value="SUBMIT"/>
	
	
	
	</form>
</body>
</html>

