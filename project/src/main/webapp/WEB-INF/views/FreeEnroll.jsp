<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="건호" content="width=device-width, initial-scale=1.0">
    <title>Free_read</title>
    <link rel="stylesheet" href="/resources/css/Free_read.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Electrolize&display=swap" rel="stylesheet">


</head>
<script>
	function enroll(){
		var userId="${id}";
		var title=document.getElementById("title").value;
		var content=document.getElementById("content").value;
		var time = new Date();
		var timeString = time.toString();
		console.log(userId);
		console.log(title);
		console.log(content);
		console.log(time);
		
		
		if(title==""){
			alert("제목을 입력하세요");
			return false;
		}
		if(content==""){
			alert("내용을 입력하세요");
			return false;
		}
		
		location.href="/freeBoard"+"?option=enroll&title="+title+"&content="+content+"&userId="+userId+"&timeString="+timeString;
	}
</script>
<body>
    

<div class="all">

    <div class="title">
        <h1>Free_read</h1>
    </div>

    <div class="prontbar">
    <ul class="bar_menu">
         <li><a href="/carList">CCTV_analysis</a></li>
        <li><a href="">Car_model </a></li>
        <li><a href="">Streaming</a></li>
        <li><a href="/QnA">QnA</a></li>
        <li><a href="/freeBoard">Free_Board</a></li>

    </ul>    

    
    </div>

    <div class="con">
        <div class="bar">
        <h1 class="write_title">작성 내용</h1>
        </div>

        <div class="bar1"><h5 class="write_title1">*표는 필수 입력사항입니다.</h5></div>
        
        <div class="bar2"><h1 class="write_title2">작성 제목*</h1></div>
        <input type="text" class="search-input" id="title" value="" >
    
        <div class="bar3"> <h1 class="write_title2">작성 내용*</h1></div>
        <table class="content_table">
        <tr>
        <td><textarea class="content" id="content">
		</textarea></td>
        </tr>
        </table>
        <form class="data" action="서버" method="post" enctype="multipart/form-data">
            <input type='file' name='' multiple/>
        </form>
        <button class="d-btn"onclick="enroll()">등록</button >    
    </div>
    
</div>
</body>

<script>

</script>



</html>