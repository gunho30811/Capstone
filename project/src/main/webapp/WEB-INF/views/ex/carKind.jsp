<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여기는 메뉴 게시판</title>
</head>

<body>
	<div class="contents">
			<div class="header">
	            <h1>${id}</h1>
	        </div>
	        
	        <!-- 컨텐츠 내용 -->
	        <div class="contents-body">
	            <div class="body-board">
	
	                <div class="filter">
	                
	                     
	                </div>
	                
	                <table border="1">
	                 <thead>
                        <tr>
		                	<th>가격</th>
		                	<th>제조사</th>
		                	<th>연비</th>
		                	<th>적재용량</th>
		                	<th>엔진</th>
	                	</tr>
	                </thead>
	                 <c:forEach items="${list}" var="dataVO"  >
                                <tr>
                                <td><c:out value="${dataVO.carPrice}"/></td> 
                                <td><c:out value="${dataVO.carMaker}"/></td>
                                <td><c:out value="${dataVO.carFuel}"/></td>
                                <td><c:out value="${dataVO.carRoad}"/></td>
                                <td><c:out value="${dataVO.carEngine}"/></td>
                                
                                </tr>
                            </c:forEach>
	                </table>
	         	</div>
            </div>
    </div>
</body>
</html>