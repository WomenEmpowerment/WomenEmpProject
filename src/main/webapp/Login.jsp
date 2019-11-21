<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-type" content="text/html" />
<style>
  h2{ text-shadow: 2px 2px violet;}
body{font-family:Bold, Arial, sans-serif;}
form{border: 1px rgb(170, 181, 202)}
input[type=text], input[type=password]{
    width: 20% ;
    padding: 2px 2px;
    margin: 5px 0;
    display:inline-block;
    border: 1px teal;
    box-sizing:border-box;
}
button {
  background-color:green;
  color: rgb(251, 224, 248);
  padding: 10px 20px;
  margin: 5px 0;
  border: 5px;
  cursor: pointer;
  width: 20%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: 5px 5px;
  padding: 10px 10px;
  background-color: #f44336;
}

.imgcontainer {
  position: relative;
    left:42%;
  margin: 20px 0 10px 0;
}

img.avatar {
  width: 15%;
  border-radius: 25%;
}

.container {
    position: relative;
    left:38%;
    border: solid  black 3px;
    padding: 10px;
    height:250px;
    width:300px;
}

span.psw {
  float: right;
  padding-top: 10px;
}
span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 20%;
  }

  .float{
   
      height:30px;
      width:510px;
  }
  .avatar-divider{
    position: relative;
    left:38%;
   height:30px;
   width:510px;
}
 
  span.email{
    position: relative;
    left:38%;
    display: block;
    float:none;
  }

</style>
</head>
<body>
    <form action="log.lti" method="post">
<h2><center><font color="Black" style:"Arial"><u>WOMEN EMPOWERMENT</u></font></center></h2> 

    <div class="imgcontainer">
      <img src="logo.jpg" alt="Avatar" class="avatar">
    </div>

    <div class="container">
           
                  
        <p class="float">     
        <label for="uname"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="uname" required>
</p>
                

    <p class="float">
        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>
    </p>  


    <p class="float">
        <button type="submit">Login</button>
        <button type="button" class="cancelbtn">Cancel</button>
    </p>
    <div>
        <label>
          <input type="checkbox" checked="checked" name="remember"> Remember me
        </label>
    </div>
       <br><br>
        <span class="psw">Forgot <a href="#">password?</a></span>
      
 
    </div>
     <div class="avatar-divider">
       <h5>Doesn't have an account</h5>
     </div>
     <span class="email">Create your account | <a href="Registration.jsp">Register?</a></span>
    </form>
    
    </body>
    </html>