<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ride Confirmed</title>

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
	width:450px;
	background:#fff;
	padding:35px;
	border-radius:20px;
	box-shadow:0 10px 25px rgba(0,0,0,0.25);
	text-align:center;
}

.success{
	font-size:65px;
}

h2{
	color:#111;
	margin:15px 0;
}

.message{
	color:#555;
	margin-bottom:25px;
}

.card{
	background:#f8f8f8;
	padding:18px;
	border-radius:12px;
	text-align:left;
	margin-bottom:20px;
}

.row{
	display:flex;
	justify-content:space-between;
	padding:10px 0;
	border-bottom:1px solid #ddd;
}

.row:last-child{
	border-bottom:none;
}

.label{
	font-weight:bold;
	color:#444;
}

.value{
	color:#111;
	font-weight:bold;
}

.otp{
	background:#111;
	color:#FFD400;
	padding:10px 18px;
	border-radius:8px;
	font-size:26px;
	font-weight:bold;
	letter-spacing:4px;
	display:inline-block;
	margin-top:8px;
}

.footer{
	margin-top:20px;
	color:#666;
	font-size:14px;
}

.home-btn{
	display:inline-block;
	margin-top:25px;
	text-decoration:none;
	background:#111;
	color:#FFD400;
	padding:12px 28px;
	border-radius:8px;
	font-weight:bold;
	transition:.3s;
}

.home-btn:hover{
	background:#333;
}
</style>

</head>
<body>

<div class="container">

	<div class="success">✅</div>

	<h2>Ride Confirmed!</h2>

	<p class="message">
		Your Rapido ride has been booked successfully.
	</p>

	<div class="card">

		<div class="row">
			<span class="label">👨 Rider</span>
			<span class="value">${riderName}</span>
		</div>

		<div class="row">
			<span class="label">🏍 Vehicle</span>
			<span class="value">${carNo}</span>
		</div>

		<div class="row">
			<span class="label">⏱ ETA</span>
			<span class="value">${eta}</span>
		</div>

	</div>

	<h3>Your Ride OTP</h3>

	<div class="otp">
		${otp}
	</div>

	<div class="footer">
		Show this OTP to your rider before starting the trip.
		<br><br>
		Thank you for choosing Rapido. ❤️
	</div>

	<a href="showBookingPage" class="home-btn">
		Book Another Ride
	</a>

</div>

</body>
</html>