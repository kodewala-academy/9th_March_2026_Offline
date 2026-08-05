<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Orders</title>

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
    width:900px;
    margin:40px auto;
}

/* Card */
.card{
    background:#fff;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,.15);
    padding:30px;
    margin-bottom:30px;
}

.card h2{
    color:#232f3e;
    margin-bottom:10px;
}

.card p{
    color:#555;
    margin-bottom:20px;
}

/* Amazon Button */
.btn{
    display:inline-block;
    text-decoration:none;
    background:#FFD814;
    color:#111;
    font-weight:bold;
    padding:12px 28px;
    border:1px solid #FCD200;
    border-radius:8px;
    transition:.3s;
}

.btn:hover{
    background:#F7CA00;
    transform:translateY(-2px);
}

/* Form */
.form-card{
    background:#fff;
    border-radius:10px;
    padding:30px;
    box-shadow:0 4px 12px rgba(0,0,0,.15);
}

.form-card h2{
    color:#232f3e;
    margin-bottom:25px;
    border-bottom:2px solid #ff9900;
    padding-bottom:10px;
}

.form-grid{
    display:grid;
    grid-template-columns:1fr 1fr;
    gap:20px;
}

.form-group{
    display:flex;
    flex-direction:column;
}

.form-group.full{
    grid-column:1 / 3;
}

label{
    margin-bottom:8px;
    font-weight:bold;
    color:#232f3e;
}

input{
    padding:12px;
    border:1px solid #ccc;
    border-radius:6px;
    font-size:15px;
}

input:focus{
    outline:none;
    border-color:#ff9900;
    box-shadow:0 0 5px rgba(255,153,0,.4);
}

.submit-btn{
    margin-top:30px;
    width:100%;
    background:#FFD814;
    border:1px solid #FCD200;
    padding:14px;
    font-size:17px;
    font-weight:bold;
    border-radius:8px;
    cursor:pointer;
}

.submit-btn:hover{
    background:#F7CA00;
}

.footer{
    text-align:center;
    margin:35px 0;
    color:#666;
}
</style>

</head>

<body>

<div class="header">
    amazon<span>.in</span>
</div>

<div class="container">

    <!-- View Order -->
    <div class="card">
        <h2>📦 Amazon Orders</h2>

        <p>View your existing order details quickly and securely.</p>

        <a href="orders/1001" class="btn">
            View Order #1001
        </a>
    </div>

    <!-- Place Order Form -->
    <div class="form-card">

        <h2>🛒 Place New Order</h2>

        <form action="placeOrder" method="post">

            <div class="form-grid">

                <div class="form-group">
                    <label>Item Name</label>
                    <input type="text" name="item" placeholder="Enter Item Name">
                </div>

                <div class="form-group">
                    <label>Price (₹)</label>
                    <input type="text" name="price" placeholder="Enter Price">
                </div>

                <div class="form-group">
                    <label>Quantity</label>
                    <input type="text" name="qty" placeholder="Enter Quantity">
                </div>

                <div class="form-group">
                    <label>User ID</label>
                    <input type="text" name="user" placeholder="Enter User ID">
                </div>

                <div class="form-group full">
                    <label>Description</label>
                    <input type="text" name="description" placeholder="Enter Product Description">
                </div>

                <div class="form-group full">
                    <label>Delivery Address</label>
                    <input type="text" name="address" placeholder="Enter Delivery Address">
                </div>

                <div class="form-group full">
                    <label>Mobile Number</label>
                    <input type="text" name="mobile" placeholder="Enter Mobile Number">
                </div>

            </div>

            <button type="submit" class="submit-btn">
                Place Order
            </button>

        </form>

    </div>

    <div class="footer">
        © 2026 Amazon Clone | Spring Boot Demo
    </div>

</div>

</body>
</html>