<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="건호" content="width=device-width, initial-scale=1.0">
    <title>Free_Board</title>
    <link rel="stylesheet" href="resources/css/Free_view.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Electrolize&display=swap" rel="stylesheet">
<script
     src="https://kit.fontawesome.com/af4e1eff79.js"
     crossorigin="anonymous"></script>

</head>
<script>
	function comment(){
		var comment = document.getElementById("comment-input").value;
		var freeBoardSeq = ${list.seq};
		var time= new Date();
		console.log(comment);
		console.log(freeBoardSeq);
		
		if(comment ==""){
			alert("댓글을 입력하세요");
		}
		
		location.href = "/free"+"?option=comment&comment="+comment+"&seq="+freeBoardSeq+"&time="+time;
	}
	
	function commentDelete(commentNum){
		var num = commentNum;
		console.log(num);
		var freeNum = ${list.seq}
		console.log(freeNum);
	
		location.href="/free"+"?option=commentDel&commentNum="+num+"&freeNum="+freeNum;
	}
</script>
<body>
      
        <ul class="bar_menu">
            <li class="bar_logo">
                <i class="fa-solid fa-car-crash"></i>
                <a href="index.html"><b>HansungProject</b></a>
            </li>
            <li><a href="CCTV.html">CCTV_analysis</a></li>
            <li><a href="Car_model.html">Car_model </a></li>
            <li><a href="">Streaming</a></li>
            <li><a href="QnA.html">QnA</a></li>
            <li><a href="Free.html">Free_Board</a></li>
    
        </ul>    
     


<div class="BackGround">
</div> <!-----BackGround-->
<div class="Main">
    <div class="title">
        <h2>1</h2>
        <h1>Free_View</h1>
    </div>
    
    <div class="bar2"><h1 class="write_title2">작성 제목</h1></div>
    <div class="search-input">${list.title}</div>

    <div class="bar3"> <h1 class="write_title2">작성 내용</h1></div>
    <div class="content_table">
	${list.content}
	</div>
<div class="wab">
    <div class="WriterAndbtn">
    <div id="revise">수정</div>
    <div id="delete">삭제</div>
    </div></div>
<div class="Writer">${list.userId}</div>

<div id="form-commentInfo"> 
<div id="comment-count">댓글 <span id="count">${size}</span></div>
<input id="comment-input" placeholder="댓글을 입력해 주세요."  > 
<button id="submit" onclick="comment()">등록</button>
<div id=comments> </div>


<c:forEach items="${rlist}" var="dataVO">
	<div class="coment_writer">
	    <div class="inline"><c:out value="${dataVO.userId}"/></div>
	    <div class="inline"><c:out value="${dataVO.time}"/></div>
	        
	    <div class="conment_box">
	        <c:out value="${dataVO.text}"/> 
	    </div>
	    <div class="pull-right">
	        <div id="revise">수정</div>
	        <div id="delete" onclick="commentDelete(${dataVO.commentNum})">삭제</div>
	        </div>
	</div>
</c:forEach>




<div class="paging">
    <a href="#" class="num ">1</a>
    <a href="#" class="num ">2</a>
    <a href="#" class="num ">3</a>
    <a href="#" class="num"> &gt; </a>
    <a href="#" class="bt">마지막</a>
</div>

</div> <!---------form-commentInfo-->
</div> <!-------con-->


</body>

<script>

</script>



</html>