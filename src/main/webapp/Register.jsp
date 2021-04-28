<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
header {
	text-align: center;
	background-color: lime;
	color: blue;
	height: 10%;
	font-size: 40px;
	background-color: lime;
}

body {
	background-color: aqua;
}

.center-screen {
	align-items: center;
	width: 300px;
	padding: 20px;
	background-color: pink;
	background-origin: 2px solid purple;
	position: absolute;
	left: 40%;
	top: 20%;
	height :100%;
	border: 5px solid solid;
	box-shadow: 1px 7px 6px 5px rgb(255, 0, 76);
}

.center-screen>div {
	padding: 20px;
}

input {
	height: 30px;
	width: 200px;
	border-radius: 5px;
	text-align: center;
	font-size: 15px;
}

input::placeholder {
	text-align: center;
}

.submit {
	background-color: rgb(43, 176, 228);
	height: 39px;
	width: 209px;
	border-radius: 5px;
	font-size: 20px;
	color: maroon;
}

form {
	display: inline;
}

footer {
	margin-top: 50%;
	text-align: justify;
	background-color: lime;
	color: blue;
	background-color: lime;
	height: 10%;
	font-size: 20px;
}
</style>
</head>
<body>
	<header>Newspaper Application</header>
	<form action="newspaper.do" method="get">

		<div class="center-screen">

			<h1 style="font-size: 40px; color: purple; text-align: center;">Register
				Here</h1>

			<div>
				<input type="text" name="name" placeholder="Enter first name"
					autocomplete="off">
				<h2>${ErrorInTheFieldName}</h2>
			</div>
			<div>
				<input type="text" name="cost" placeholder="Enter amount"
					autocomplete="off">
				<h2>${ErrorInTheFieldCost}</h2>
			</div>
			<div>
				<input type="text" name="noOfPages" placeholder="Enter no of pages"
					autocomplete="off">
				<h2>${ErrorInTheFieldNoOfPages}</h2>
			</div>

			<div>
				<input type="text" name="language" placeholder="Enter language"
					autocomplete="off">
				<h2>${ErrorInTheFieldLanguage}</h2>
			</div>
			<div>
				<input type="text" name="magazine" placeholder="Enter magazine"
					autocomplete="off">
				<h2>${ErrorInTheFieldMagazine}</h2>
			</div>


			<div>
				<button class="submit">Register</button>
				<button class="submit">Reset</button>
			</div>
		</div>
	
		<div>
			<footer>All Right Reserved&copy:2021</footer>
		</div>
	</form>
	<div>
		<h2>${message}</h2>
	</div>
</body>
</html>