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
.log img {
    width: 40px;
    height: 40px;
    border-radius: 100%;
    padding: 5%;
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
  height: 200px;
  width: 96%;
 
  box-shadow: 1px 10px 8px 1px aliceblue;
  margin-left:2%;
  display:grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  grid-gap: 1px;
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
  margin-top:175px;
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
            <i class="fa fa-vimeo-square"></i><a href="dashbord.jsp">dashbord</a>
            </div>
  
            <div class="cont">
              <i class="fa fa-stack-exchange" aria-hidden="true"></i><a href="stock.jsp"> Stock</a>
            </div>

            <div class="cont">
          <a href="user.jsp"><i class='fa fa-users'></i> User list</a>
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


<h1> Welcome to Stock Management System </h1>

<div class="mid">




<div class="men"><i class="fa fa-shopping-bag" aria-hidden="true" style="background-color:black;color:white"></i> <a href="#">Items</a><p>3</p></div>

<div class="men"><a href=""><i class='fa fa-users' style="background-color:green;"></i> Users</a></div>







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