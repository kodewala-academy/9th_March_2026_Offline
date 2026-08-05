<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Order Details</title>

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
    color:white;
    padding:18px 40px;
    font-size:28px;
    font-weight:bold;
}

.header span{
    color:#ff9900;
}

/* Main Container */
.container{
    width:700px;
    margin:50px auto;
}

/* Card */
.card{
    background:#fff;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
    padding:30px;
}

.card h2{
    color:#232f3e;
    margin-bottom:25px;
    text-align:center;
    border-bottom:2px solid #ff9900;
    padding-bottom:10px;
}

/* Table */
table{
    width:100%;
    border-collapse:collapse;
}

table td{
    padding:14px;
    border-bottom:1px solid #ddd;
}

.label{
    font-weight:bold;
    color:#232f3e;
    width:35%;
    background:#f8f8f8;
}

.value{
    color:#444;
}

/* Status */
.status{
    color:green;
    font-weight:bold;
}

/* Button */
.btn{
    display:inline-block;
    margin-top:25px;
    text-decoration:none;
    background:#ffd814;
    color:#111;
    padding:12px 25px;
    border-radius:8px;
    border:1px solid #fcd200;
    font-weight:bold;
}

.btn:hover{
    background:#f7ca00;
}

/* Footer */
.footer{
    text-align:center;
    margin-top:30px;
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

        <h2>📦 Order Details</h2>

        <table>
            <tr>
                <td class="label">Order ID</td>
                <td class="value">1001</td>
            </tr>

            <tr>
                <td class="label">Product</td>
                <td class="value">Apple iPhone 16 Pro</td>
            </tr>

            <tr>
                <td class="label">Price</td>
                <td class="value">₹1,29,900</td>
            </tr>

            <tr>
                <td class="label">Quantity</td>
                <td class="value">1</td>
            </tr>

            <tr>
                <td class="label">Delivery Address</td>
                <td class="value">Bangalore, Karnataka</td>
            </tr>

            <tr>
                <td class="label">Payment Mode</td>
                <td class="value">Credit Card</td>
            </tr>

            <tr>
                <td class="label">Order Status</td>
                <td class="value status">Delivered ✅</td>
            </tr>
        </table>

        <center>
            <a href="/" class="btn">⬅ Back to Home</a>
        </center>

    </div>

    <div class="footer">
        © 2026 Amazon Clone | Spring MVC Demo
    </div>

</div>

</body>
</html>