<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>QnA Read</title>
</head>
<script type="text/javascript">
	//글쓰기
	
	function del(){
		var writer=document.getElementById("writer").value;
		var deleter="${QnAVO.seq}";  //QnA 번호
		console.log(writer);
		console.log(deleter);
		if(writer=="${id}"){
			console.log(writer);
			alert("삭제 되었습니다")
			location.href="/QnAList"+"?option=delete&index="+deleter;
		}
		else{
			alert("권한이 없습니다");
					
		}
	}
	
	function comment(){
		//댓글 달기
		var text=document.getElementById("text").value;
		var QnANum="${QnAVO.seq}";
		
		
		console.log(text);
		console.log(QnANum);
		
		location.href="/QnAList"+"?option=comment&text="+text+"&QnANum="+QnANum;
	}
	
	function delComment(commentNum,commentId){
		var userId="${id}";
		var commentNum=commentNum;
		var commentId=commentId;
		var QnANum="${QnAVO.seq}";
		
		if(userId==commentId){
			alert("삭제 되었습니다")
			location.href="/QnAList"+"?option=delComment&index="+commentNum+"&QnANum="+QnANum;
		}
		else{
			alert("권한이 없습니다");
					
		}
		
		
	}

</script>
<body>
	<div>
	    <form id="writeForm" name="writeForm" method="post">
	        <div>
	            <h2>글 읽기</h2>
	            <div>
	                <table>
	                    <tr>
	                        <th>제목</th>
	                        <td><input style="width: 500px" type="text" id="title" name="title" value="${QnAVO.title}" /></td>
	                    </tr>
	                    <tr>
	                        <th>내용</th>
	                        <td ><textarea style="width: 500px" rows="10" cols="10" id="content" name="content">${QnAVO.content}</textarea></td>
	                    </tr>
	                    <tr>
	                        <th>작성자</th>
	                        <td><input style="width: 500px" type="text" id="writer" name="writer" value="${QnAVO .userId}" placeholder="아이디를 입력해주세요"/></td>
	                    </tr>
	                </table>
	                <div>
	                    <a href='#' onClick='del()'>삭제하기</a>
	                   <a href='/QnAList' >목록</a>
	                </div>
	            </div>
	        </div>
	    </form>
	    
	    <!-- 댓글란 -->
	    <form>
	    	<div>
	    		<h4>댓글 쓰기</h4>
	    		<div>
	    			<table>
	    				<tr>
	    					<th>${id}<br> <a href='#' onClick='comment()'>등록하기</a></th>
	    					<td><textarea style="width: 500px" rows="10" cols="10" id="text" name="content"></textarea></td>
	    				</tr>
	    			</table>
	    		</div>
	    	</div>
	    </form>
	    
	    
	    <form>
	    	<div>
	    		<h4>댓글란</h4>
	    		<div>
	    			<table>
	    				<c:forEach items="${CommentVO}" var="dataVO">
	    					<tr>
		    				 
		    					<th>${dataVO.userId }</th>
		    					<td><input style="width: 500px" type="text" id="title" name="title" value="${dataVO.text}" /></td>
		    					<td><input type="button" value="삭제" onclick="delComment('${dataVO.commentNum}', '${dataVO.userId}')"></td>
		    				</tr>
	    				 </c:forEach>
	    			</table>
	    		</div>
	    	</div>
	    </form>
		<h2>댓글 기능 구현 예정</h2>
		<h2>삭제 및 수정 구현 예정</h2>
		<h2>서버에 띄우는거 예정</h2>
		<h2>qna 답글 예정</h2>
		<br>
		<h2>프론트엔드 페이지 필요한거 회의 예정</h2>
		<h2>디비 테이블 뭐 필요할지 회의 예정</h2>
		<h2>카메라 연동해서 웹에 띄우는거 예정</h2>
		
	</div>
</body>
</html>