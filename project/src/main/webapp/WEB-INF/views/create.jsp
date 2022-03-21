<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="/resources/css/create.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Account</title>
    <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>    
    <section class="forgot-form">
        <h1></h1>
        <div class="bar_logo">
            <a href="">Create Account</a>
        </div>
        <!-- <form> 여기 수정-->
            <div class="forgot-area">
                <input type="text" name="userId" id="userId" value=""
                autocomplete="off" required>
                <label for="forgot_id">ID</label>
            </div>
    
            <div class="forgot-area">
                <input type="password" name="userPw" id="userPw" value=""
                autocomplete="off" required>
                <label for="forgot_pw">PASSWORD</label>
            </div>


            <div class="forgot-area">
                <input type="text" name="userName" id="userName" value=""
                autocomplete="off" required>
                <label for="forgot_id">NAME</label>
            </div>


            <div class="forgot-area">
                <input type="text" name="userEmail" id="userEmail" value=""
                autocomplete="off" required>
                <label for="forgot_pw">Email</label>
            </div>


            <div class="forgot-area">
                <input type="text" name="userQuestion" id="userQuestion" value=""
                autocomplete="off" required>
                <label id="creat_answer" type="text" onclick='change()'>ANSWER</label>
            </div>

            
           <div class="btn-area">
               <button onclick="signup()">Sign in</button>
            
           </div>
        <!--  </form>-->
    </section>

        <script> 
          function change() {
              const ans= document.getElementById('creat_answer');
              ans.innerText = '당신이 가장 좋아하는 차량은?'
          }
        </script>
		<script>
		function signup(){
			var userId = document.getElementById("userId").value;
			var userPw = document.getElementById("userPw").value;
			var userName = document.getElementById("userName").value;
			var userEmail = document.getElementById("userEmail").value;
			var userQuestion = document.getElementById("userQuestion").value;
			
			console.log(userId);
			console.log(userPw);
			console.log(userName);
			console.log(userEmail);
			console.log(userQuestion);
			
			if(userId !="" || userPw !="" || userName !="" || userEmail !="" || userQuestion !="" ){
				location.href="/create"+"?option=signup&userId="+userId+"&userPw="+userPw
				+"&userName="+userName+"&userEmail="+userEmail+"&userQuestion="+userQuestion;
			}
			
		}
		var r = "${redundancy}";
		console.log(r);
		if (r == "redundancy"){
			alert("ID 중복입니다. 다시 입력해주세요.");
		}

		</script>



</body>
</html>