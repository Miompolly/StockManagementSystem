<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>jsp</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
   
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>


 .adminn img{
    width: 40px;
    height: 40px;
    border-radius: 100%;
   
    
  
}
.sta{
  padding-left: 30px;
}
.log img{
  width: 50px;
    height: 50px;
    border-radius: 100%;
    padding:20px;
}
.log{
  background-color: rgb(12, 102, 72);
}

#lang{
  border:none;
  background:white;
  align-items:up;
 
}
.adminp{
  flex:3;
 
 
  margin-top:20px;
  height:40px;

}
.adminn{
  background:white;
  /* margin-top:20px; */
  width:240px;
  height:40px;
  border-radius:20px;
  margin-left:50%;
  display:flex;

  
  


}
.classi select{
  padding:10px;
}
.classi label{
  font-size:20px;
  color:black;
 padding:20px 20px;
 align-items:center;
 
}
.down{
 
  height: 85%;
  width:100%;
  background-color: aliceblue;


}
.down h1{
  padding-left:2%;
}
.mid{
  height: 400px;
  width: 96%;
 background-color: white;
  box-shadow: 1px 10px 8px 1px white;
  margin-left:2%;
  margin-top: 2%;
 display: flex;
 flex-direction: column;

  grid-gap: 1px;
  border-top:5px solid blue ;
  text-align: center;
  /* border: 1px solid ; */
  border-radius: 10px;
}
.prin{
  background-color: rgba(228, 224, 224, 0.863);
  height: 50px;
 text-align: center;
  gap: 5px;
  display: flex;
  margin-top: 10px;
}
.print{
  background-color: green;
  color: white;
  height: 30px;
  width: 80px;

 
}
a{
  font-size: 20px;
  color: white;
  text-decoration: none;
  
}
.edt{
  background-color: blue;
  color: white;
  height: 30px;
  width: 130px;
  margin-left: 35%;
  padding-top: 10px;
  margin-top: 4px;
}
.itemm{
  background-color: black;
  color: white;
  height: 30px;
  width: 150px;
}
.hed{
  height: 30px;
  border-bottom: 2px solid black;
  text-align: left;
  padding: 10px;
}
.itemss{
  color: rgb(72, 177, 226);
  text-align: left;
  padding: 15px;
  padding-bottom: 20px;
  font-size: 30px;
  font-family: bold;
}
.men{
  background-color:white;
  height: 100px;
  margin:5px;
  padding:5px;
 
  box-shadow: 1px 10px 8px 1px aliceblue;
  
}
.men a{
  text-decoration: none;
  font-size: 20px;
  color: black;
}
.men i{
  height: 30px;
  width: 30px;
  font-size:30px
}

.fot{
  margin-top:60px;
  height: 15%;
  width: 100%;
  background-color:white;
  box-shadow: 1px 10px 8px 1px white;
  display: flex;
 
}
.rightbar{
  flex:2;
}
   i{
   color:white;
   background: #000;
    font-size: 20px;
    padding: 5px;
}
.cont a{
text-decoration: none;
font-size: 20px;
color: white;
}

label{
    color: white;
    font-size: 25px;
    padding-top: 25px;
}
.up{
    height: 15%;
    background-color:  rgb(32, 138, 138);
    display:flex;
    
}
.up .rightbar{
 padding:15px;
}
.nav {
    width: 25%;
    background: #000;
}

.nav2 {
    width: 75%;
}
.lft{
  width: 50%;
  padding: 10px;
}
.rgt{
  width: 50%;
  text-align: right;
  padding: 10px;
}
.table{
    width: 95%;
    height: 200px;
    border: 300px;
    margin-left: 20px;
    background-color: whitesmoke;
}
button{
    border: none;
    color: white;
    font-size: 20px;
}
form{
    display: flex;
    flex-direction: column;
    margin-left: 10%;
    
}
input{
    background-color: rgb(212, 212, 207);
    margin-top:10px ;
    height: 30px;
    width: 80%;
}

</style>


  </head>
<body>
  <div class="main">





        <div class="nav">
            <div class="log">
         <img src="p4.PNG" alt="">
          
      
  
            </div>

            <div class="important">
            <div class="cont">
            <a href="dashbord.jsp">dashbord</a>
            </div>
  
            <div class="cont">
           <a href="stock.jsp"> Stock</a>
            </div>

            <div class="cont">
          <a href="user.jsp"> User list</a>
            </div>
         
            <div class="cont">
           <a href="index.jsp">Logout</a>
            </div>
            </div>
       </div>

       
       <div class="nav2">
        <div class="up"> 
        <div class="rightbar"><i class="fa fa-bars" aria-hidden="true"></i> <label for="">Stock Management System</label></div> 
       <div class="adminp">
         <div class="adminn">
        <div class="classi"><img src="p4.PNG" alt=""></div>
        <div class="classi">
       
       <select name="languages" id="lang">
        <option value="admin">Administrator Admin</option>

</select>

</div>
      </div>
</div>



        </div>
<div class="down">
<div class="mid">
<div class="rtn">
 <div class="hed">Add New User</div>
</div>

<div class="tb">

<form action="userServletAd" method="POST">

    <input type="text" placeholder="Full Name" name="fullname" required>
    <input type="email" placeholder="Email" name="email" required>
    <input type="password" placeholder="Password" name="password" required>
    <input type="text" placeholder="Role" name="role">


</div>

<div class="prin">

<div class="edt">
<button type="submit" style="background-color:blue;">Add user</button>

</form>

</div>



</div>



</div>
<div class="fot">

<div class="lft"><p>Copyright &#169 2023 All right reserved</p>  </div>
 <div class="rgt"><p>Designed by Scot</p></div>
 
</div>



</div>



       </div>
    </div>


  
</body>
</html>