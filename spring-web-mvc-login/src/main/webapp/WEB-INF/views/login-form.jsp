<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Login</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family: Arial, Helvetica, sans-serif;
}

body{
    background:#f3f3f3;
}

.logo{
    text-align:center;
    margin-top:30px;
}

.logo h1{
    font-size:40px;
    font-weight:bold;
}

.logo span{
    color:#ff9900;
}

.login-box{
    width:350px;
    background:#fff;
    margin:25px auto;
    padding:25px;
    border:1px solid #ddd;
    border-radius:8px;
    box-shadow:0 2px 5px rgba(0,0,0,0.1);
}

.login-box h2{
    margin-bottom:20px;
    font-weight:400;
}

label{
    display:block;
    margin-bottom:6px;
    font-weight:bold;
    font-size:14px;
}

input[type=text],
input[type=password]{
    width:100%;
    padding:10px;
    margin-bottom:18px;
    border:1px solid #aaa;
    border-radius:4px;
    font-size:15px;
}

input[type=text]:focus,
input[type=password]:focus{
    border-color:#ff9900;
    outline:none;
    box-shadow:0 0 5px rgba(255,153,0,0.5);
}

input[type=submit]{
    width:100%;
    padding:10px;
    background:#FFD814;
    border:1px solid #FCD200;
    border-radius:20px;
    font-size:15px;
    cursor:pointer;
    font-weight:bold;
}

input[type=submit]:hover{
    background:#F7CA00;
}

.footer{
    text-align:center;
    margin-top:20px;
    color:#555;
    font-size:13px;
}

.footer a{
    text-decoration:none;
    color:#0066c0;
}

.footer a:hover{
    text-decoration:underline;
}
</style>

</head>

<body>

<div class="logo">
    <h1>amazon<span>.in</span></h1>
</div>

<div class="login-box">

    <h2>Sign in</h2>

    <form action="">

        <label>Email or mobile phone number</label>
        <input type="text" name="username"
               placeholder="Enter email or mobile number">

        <label>Password</label>
        <input type="password" name="password"
               placeholder="Enter password">

        <input type="submit" value="Sign in">

    </form>

    <div class="footer">
        <br>
        By continuing, you agree to Amazon's Conditions of Use and Privacy Notice.
        <br><br>
        <a href="#">Forgot Password?</a>
    </div>

</div>

</body>
</html>