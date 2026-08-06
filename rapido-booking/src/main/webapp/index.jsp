<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Ride Booking</title>

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
    background:#ffffff;
    width:420px;
    text-align:center;
    padding:40px;
    border-radius:20px;
    box-shadow:0 10px 25px rgba(0,0,0,0.25);
}

.logo{
    font-size:50px;
}

h1{
    color:#111;
    margin-top:15px;
    margin-bottom:10px;
}

p{
    color:#555;
    margin-bottom:35px;
    line-height:1.6;
}

.btn{
    display:inline-block;
    background:#111;
    color:#FFD400;
    text-decoration:none;
    padding:15px 35px;
    font-size:18px;
    font-weight:bold;
    border-radius:10px;
    transition:.3s;
}

.btn:hover{
    background:#333;
    transform:scale(1.05);
}

.footer{
    margin-top:30px;
    color:#888;
    font-size:14px;
}
</style>

</head>
<body>

<div class="container">

    <div class="logo">🏍️</div>

    <h1>Rapido Ride Booking</h1>

    <p>
        Book your bike, auto, or cab in just a few clicks.
        Fast pickups, affordable fares, and safe rides.
    </p>

    <a href="showBookingPage" class="btn">
        🚖 Book Your Ride
    </a>

    <div class="footer">
        Ride Smart • Ride Fast • Ride Rapido
    </div>

</div>

</body>
</html>