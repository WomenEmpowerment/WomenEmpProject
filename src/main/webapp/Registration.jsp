<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="regi.css" >
</head>
<body>
	<h3>REGISTRATION FORM</h3>

	<form action="register.lti" method="post" enctype="multipart/form-data"  >   <!-- enctype="multipart/form-data"  -->
		<table align="center" cellpadding="10">

			<!----- First Name ---------------------------------------------------------->
			<tr>
				<td>FIRST NAME</td>
				<td><input type="text" name="name" maxlength="30" /> (max 30
					characters a-z and A-Z)</td>
			</tr>

			<!----- Email Id ---------------------------------------------------------->
			<tr>
				<td>EMAIL ID</td>
				<td><input type="text" name="email" maxlength="100" /></td>
			</tr>

			<tr>
				<td>AGE</td>
				<td><input type="number" name="age" /></td>
			</tr>

			<!----- City ---------------------------------------------------------->
			<tr>
				<td>CITY</td>
				<td><input type="text" name="city" maxlength="30" /> (max 30
					characters a-z and A-Z)</td>
			</tr>


			<!----- Mobile Number ---------------------------------------------------------->
			<tr>
				<td>MOBILE NUMBER</td>
				<td><input type="number" name="Phoneno" maxlength="10" /> (10
					digit number)</td>
			</tr>

			<!--username-->
			<tr>
				<td>USERNAME</td>
				<td><input type="text" name="username" maxlength="30" /> (max
					30 characters a-z and A-Z)</td>
			</tr>


			<!--password-->
			<tr>
				<td>PASSWORD</td>
				<td><input type="password" name="password" /></td>
			</tr>

			<!--  Document  --> 
			<tr>
				<td>Upload your Document:</td>
				<td><input type="file" name="docfile" /></td>
			</tr> 

			<!----- Submit and Reset ------------------------------------------------->
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit"> <input type="reset" value="Reset">
				</td>
			</tr>
		</table>

	</form>
</body>
</html>