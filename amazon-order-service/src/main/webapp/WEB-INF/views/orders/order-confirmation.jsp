<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon - Order Confirmation</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#eaeded;
}

/* Header */
.header{
    background:#131921;
    color:#fff;
    padding:18px 40px;
    font-size:30px;
    font-weight:bold;
}

.header span{
    color:#ff9900;
}

/* Main Container */
.container{
    width:650px;
    margin:60px auto;
}

/* Confirmation Card */
.card{
    background:#fff;
    padding:40px;
    border-radius:10px;
    text-align:center;
    box-shadow:0 5px 15px rgba(0,0,0,0.15);
}

/* Success Icon */
.success-icon{
    width:90px;
    height:90px;
    margin:0 auto 20px;
    border-radius:50%;
    background:#28a745;
    color:#fff;
    font-size:50px;
    line-height:90px;
}

.card h2{
    color:#232f3e;
    margin-bottom:15px;
}

.card p{
    color:#555;
    font-size:16px;
    line-height:1.6;
    margin-bottom:15px;
}

.order-id{
    display:inline-block;
    margin:20px 0;
    padding:12px 20px;
    background:#f3f3f3;
    border-radius:6px;
    font-size:18px;
    font-weight:bold;
    color:#232f3e;
}

/* Buttons */
.buttons{
    margin-top:30px;
}

.btn{
    display:inline-block;
    text-decoration:none;
    margin:8px;
    padding:13px 28px;
    border-radius:8px;
    font-weight:bold;
    transition:.3s;
}

/* Amazon Button */
.primary{
    background:#FFD814;
    color:#111;
    border:1px solid #FCD200;
}

.primary:hover{
    background:#F7CA00;
}

/* Secondary Button */
.secondary{
    background:#232f3e;
    color:#fff;
}

.secondary:hover{
    background:#37475a;
}

/* Footer */
.footer{
    text-align:center;
    margin:40px;
    color:#666;
    font-size:14px;
}

</style>

</head>
<body>

<div class="header">
    amazon<span>.in</span>
</div>

<div class="container">

    <div class="card">

        <div class="success-icon">✓</div>

        <h2>Order Placed Successfully!</h2>

        <p>
            Thank you for shopping with Amazon.
            Your order has been placed successfully and is being processed.
        </p>

        <div class="order-id">
            Order ID : <strong>#1001</strong>
        </div>

        <p>
            You will receive an email and SMS confirmation shortly.
        </p>

        <div class="buttons">
            <a href="/" class="btn primary">
                🏠 Continue Shopping
            </a>

            <a href="orders/1001" class="btn secondary">
                📦 View Order
            </a>
        </div>

    </div>

</div>

<div class="footer">
    © 2026 Amazon Clone | Spring Boot Demo
</div>

</body>
</html>