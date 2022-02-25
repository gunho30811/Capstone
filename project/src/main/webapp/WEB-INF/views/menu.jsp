<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>여기는 메뉴 게시판</title>
</head>
<body>
	<div class="contents">
			<div class="header">
	            <h1>menu</h1>
	        </div>
	        
	        <!-- 컨텐츠 내용 -->
	        <div class="contents-body">
	            <div class="body-board">
	
	                <div class="filter">
	                	 <h2>${id}님 안녕하세요</h2>
	                     
	                </div>
	                
	                <table border="1">
	                	<th>서비스</th>
	                	<tr>
	                		<td><a href="">실시간 영상 스트리밍</a></td>
	                	</tr>
	                	<tr>
	                		<td><a href="/list">차량 입출입 목록</a></td>
	                	</tr>
	                	<tr>
	                		<td><a href="/QnAList">QnA</a></td>
	                	</tr>
	                </table>
	         	</div>
            </div>
    </div>
</body>
</html>