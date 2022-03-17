<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>QnA 등록</title>
</head>
<script type="text/javascript">
	//글쓰기kjhjhkjk
	function enroll(){
		var title=document.getElementById("title").value;
		var content=document.getElementById("content").value;
		var writer=document.getElementById("writer").value;
		var time= new Date();
		var timeString = time.toString();
		
		if(title==""){
			alert("제목을 입력하세요");
			return false;
		}
		if(content==""){
			alert("내용을 입력하세요");
			return false;
		}
		if(writer==""){
			alert("아이디를 입력하세요");
			return false;
		}
		console.log(title);
		console.log(content);
		console.log(writer);
		console.log(timeString);
		
		alert("등록이 완료되었습니다!");
		location.href="/QnAList"+"?option=enroll&title="+title+"&content="+content+"&writer="+writer+"&time="+timeString;
	}
	
	    

</script>
<body>
	<div>
	    <form id="writeForm" name="writeForm" method="post">
	        <div>
	            <h2>글쓰기</h2>
	            <div>
	                <table>
	                    <tr>
	                        <th>제목</th>
	                        <td><input style="width: 500px" type="text" id="title" name="title" value="" /></td>
	                    </tr>
	                    <tr>
	                        <th>내용</th>
	                        <td ><textarea style="width: 500px" rows="10" cols="10" id="content" name="content"></textarea></td>
	                    </tr>
	                    <tr>
	                        <th>작성자</th>
	                        <td><input style="width: 500px" type="text" id="writer" name="writer" value="${id}" /></td>
	                    </tr>
	                </table>
	                <div>
	                    <a href='#' onClick='enroll()'>글 등록</a>
	                    <a href='/QnAList' >목록</a>
	                </div>
	            </div>
	        </div>
	    </form>

	</div>
</body>
</html>