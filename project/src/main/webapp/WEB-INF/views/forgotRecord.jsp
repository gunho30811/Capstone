<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="resources/css/forgot.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot</title>
    <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<script> 
       function gotoLogin(){
        	location.href="/login";		
       }	
</script>
<body>
    
    <section class="forgot-form">
        <h1></h1>
        <div class="bar_logo">
            <a href="login.html">Your PassWord</a>
        </div>
        
            <div class="forgot-area">
                <input type="text" name="forgot_id" id="forgot_id"
                autocomplete="off"  value="${userPw}" required >
               
            </div>
           
                        
           <div class="btn-area">
               <button  onclick="gotoLogin()">Sign in</button>
            
           </div>
        
    </section>




</body>
</html>