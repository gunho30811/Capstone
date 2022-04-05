<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>졸프 첫 페이지</title>
    <style>
        #header{
            height: 100px;
        }
        #nav{
            width:300px;
            height: 300px;
            float :left;
            padding : 10px
        }
        #section{
            width: 200px;
            
        }
    </style>
</head>
<script type="text/javascript">
	function logIn(){
		console.log("log in");
		var userID = document.getElementById("userID").value;
		var userPw = document.getElementById("userPw").value;
		
		console.log(userID);
		console.log(userPw);
		
		location.href="/"+"?option=login&userId="+userID+"&userPw="+userPw;
	}
	var a = "${failFlag}";
	console.log(a);
	if ( a=="no") {
		alert("로그인거부 : 아이디와 비밀번호를 확인하세요");
	}
	function SignUp(){
		console.log("sign up!");
		location.href="/SignUp"+"?option=option";
	}
	
</script>
<body>
    <div id="nav">
        <h1>  졸업프로젝트</h1>
        <form method="post" id="authForm" action="javascript:logIn()">
			  <div>
			    <label for="loginId">아이디</label>
			    <input type="text" id="userID" name="loginId"  value=""><br>
			    <label for="loginPw">비밀번호</label>
			    <input type="text" id="userPw" name="password"  value="" >
			 
			  <input id="button" type="button" onclick="logIn()" value="로그인">
			   <input id="button" type="button" onclick="SignUp()" value="회원가입">
			   </div>
			  <!--  <div>
			    <input type="checkbox" id="keepLogin" name="keepLogin">
			    <label for="keepLogin"><span>로그인 상태 유지</span></label>
			  </div>-->
		</form>
    </div>

    <img class="image1" src="resources/img/image1.jpg" alt="My Image">
	

</body>
</html>