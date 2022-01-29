<html>
<body>
	<h1>Enter Your Details</h1>
	<form:errors path = "user1.*/" />
	<form action = "/mvc/Authdetails" method = "post">
		<p> Username: <input type="text" name="usname"/></p>
		<p> Password: <input type="password" name="uspwd"/></p>
		<p> Email_Id: <input type="email" name="usmail"/></p>
		
		<input type = "submit" value="SUBMIT"/>
	
	
	
	</form>
</body>
</html>

