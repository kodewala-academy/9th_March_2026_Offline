<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Ride</title>

<style>
*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:Arial, Helvetica, sans-serif;
}

body{
	background:#FFD400;
	display:flex;
	justify-content:center;
	align-items:center;
	height:100vh;
}

.container{
	background:#fff;
	width:430px;
	padding:35px;
	border-radius:18px;
	box-shadow:0 10px 25px rgba(0,0,0,.25);
}

h2{
	text-align:center;
	color:#111;
	margin-bottom:25px;
}

.form-group{
	margin-bottom:18px;
}

label{
	display:block;
	font-weight:bold;
	margin-bottom:6px;
	color:#333;
}

input[type=text],
select{
	width:100%;
	padding:12px;
	border:2px solid #ddd;
	border-radius:8px;
	font-size:15px;
	outline:none;
	transition:.3s;
}

input[type=text]:focus,
select:focus{
	border-color:#FFD400;
	box-shadow:0 0 8px rgba(255,212,0,.7);
}

input[type=submit]{
	width:100%;
	background:#111;
	color:#FFD400;
	padding:14px;
	border:none;
	border-radius:8px;
	font-size:18px;
	font-weight:bold;
	cursor:pointer;
	transition:.3s;
}

input[type=submit]:hover{
	background:#333;
	transform:scale(1.02);
}

.logo{
	text-align:center;
	font-size:45px;
	margin-bottom:10px;
}

.tagline{
	text-align:center;
	color:#666;
	margin-bottom:25px;
	font-size:14px;
}
</style>

</head>
<body>

<div class="container">

	<div class="logo">🏍️</div>

	<h2>Rapido Ride Booking</h2>

	<div class="tagline">
		Book your ride in less than 30 seconds
	</div>

	<form action="bookRide" method="post">

		<div class="form-group">
			<label>📱 Mobile Number</label>
			<input type="text" name="mobile" placeholder="Enter Mobile Number" required>
		</div>

		<div class="form-group">
			<label>📍 Pickup Location</label>
			<input type="text" name="source" placeholder="Enter Pickup Location" required>
		</div>

		<div class="form-group">
			<label>📌 Destination</label>
			<input type="text" name="destination" placeholder="Enter Destination" required>
		</div>

		<div class="form-group">
			<label>🏍 Ride Type</label>
			<select name="ridetype">
				<option>Bike</option>
				<option>Auto</option>
				<option>Cab</option>
			</select>
		</div>

		<div class="form-group">
			<label>💰 Fare Amount (₹)</label>
			<input type="text" name="amount" placeholder="Enter Amount" required>
		</div>

		<input type="submit" value="Book Ride">

	</form>

</div>

</body>
</html>