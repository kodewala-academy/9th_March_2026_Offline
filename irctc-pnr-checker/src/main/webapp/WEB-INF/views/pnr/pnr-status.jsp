<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PNR Status</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#eef3f8;
}

.header{
    background:#003b73;
    color:white;
    text-align:center;
    padding:18px;
    font-size:28px;
    font-weight:bold;
}

.sub-header{
    background:#ff6b00;
    color:white;
    text-align:center;
    padding:8px;
    font-size:15px;
}

.container{
    width:550px;
    margin:50px auto;
    background:white;
    border-radius:10px;
    box-shadow:0 5px 18px rgba(0,0,0,.2);
    overflow:hidden;
}

.title{
    background:#0059b3;
    color:white;
    text-align:center;
    padding:15px;
    font-size:22px;
    font-weight:bold;
}

.content{
    padding:35px;
}

table{
    width:100%;
    border-collapse:collapse;
}

td{
    padding:14px;
    border-bottom:1px solid #ddd;
    font-size:17px;
}

.label{
    font-weight:bold;
    color:#003b73;
    width:40%;
}

.status{
    color:#d32f2f;
    font-size:22px;
    font-weight:bold;
}

.btn{
    display:inline-block;
    margin-top:30px;
    background:#ff6b00;
    color:white;
    text-decoration:none;
    padding:12px 28px;
    border-radius:5px;
    font-weight:bold;
}

.btn:hover{
    background:#e65c00;
}

.footer{
    text-align:center;
    background:#f5f5f5;
    padding:12px;
    color:#555;
    font-size:13px;
}
</style>

</head>
<body>

<div class="header">
🚆 Indian Railways
</div>

<div class="sub-header">
IRCTC PNR Enquiry Result
</div>

<div class="container">

    <div class="title">
        PNR Status
    </div>

    <div class="content">

        <table>
            <tr>
                <td class="label">PNR Number</td>
                <td>1234567890</td>
            </tr>

            <tr>
                <td class="label">Train</td>
                <td>12627 Karnataka Express</td>
            </tr>

            <tr>
                <td class="label">Journey Date</td>
                <td>05-Aug-2026</td>
            </tr>

            <tr>
                <td class="label">Current Status</td>
                <td class="status">WL-49</td>
            </tr>
        </table>

        <center>
            <a href="index.jsp" class="btn">Check Another PNR</a>
        </center>

    </div>

    <div class="footer">
        © Indian Railways Passenger Reservation System
    </div>

</div>

</body>
</html>