<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Stock Management</title>
    <link rel="stylesheet" href="style.css">
    <style>

.container {
    background-color: rgb(116, 93, 93);
    height: 400px;
      padding-left:50px;
    width: 400px;
    position: relative;
    left: 25%;
    margin-top:5% ;
}
h2{
    font-size: 30px;
    padding-top: 20px;
}
button{
    color: white;
    border: none;
    height: 40px;
    width: 120px;
    font-size: 20px;
}
a{
    text-decoration: none;
    color:  rgb(41, 145, 230);
    font-size: 20px;


}
    </style>
</head>
<body>
    <div class ="container">
 <h2>
  Please fill this form to register   
 </h2>
 <form action="connect.php" method="POST">
<input type="text" name="fname" placeholder="Full name" required>
<br><br>
<input type="email" name="email" placeholder="Write your email" required><br><br>
<input type="password" name="password" placeholder="Create password" required><br><br>
<input type="passward" name="cpassword" placeholder="Confirm your password" required><br><br>
<button type="submit" name="register">Register</button>
 </form>
 <p>Already have account</p> <a href="index.jsp">Login here</a>
</div>
</body>
</html>