<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="건호" content="width=device-width, initial-scale=1.0">
    <title>QnA</title>
    <link rel="stylesheet" href="/resources/css/QnA.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Electrolize&display=swap" rel="stylesheet">


</head>
<body>
    

<div class="all">

    <div class="title">
        <h1>title</h1>
    </div>

    <div class="prontbar">
  

    <ul class="bar_menu">
        <li><a href="/carList">CCTV_analysis</a></li>
        <li><a href="">Car_model </a></li>
        <li><a href="">Streaming</a></li>
        <li><a href="/QnA">QnA</a></li>
        <li><a href="freeBoard">Free_Board</a></li>

    </ul>    
 
   
    </div>
    <div class="search-wrap">
    <select>
        <option>제목</option>
        <option>작성자</option>
        <option>제목+작성자</option>
    </select>  
    <input type="text" class="search-input" placeholder="Please Enter Text">

     <button type="submit" class="search-btn">검색</button>
    </div>

    <div class ="board_list_wrap">
        <table class="board_list">
        <caption>게시판 목록</caption>
            <thead>
                <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>시간</th>                
                </tr>
         </thead>
            <tbody>
                <c:forEach items="${list}" var="dataVO"><!--  begin="${firstIndex}" end="${lastIndex}" step="1" varStatus="status"> -->
                      <tr>
                      <td><c:out value="${dataVO.seq}"/></td> 
                      <td><c:out value="${dataVO.title}"/></td>
                      <td><c:out value="${dataVO.userId}"/></td>
                      <td><c:out value="${dataVO.time}"/></td>
         
                       </tr>
                    </c:forEach>
            </tbody>
        </table>
        <div class="paging">
            <a href="#" class="bt">처음</a>
            <a href="#" class="num"> &lt; </a>
            <a href="#" class="num ">1</a>
            <a href="#" class="num ">2</a>
            <a href="#" class="num ">3</a>
            <a href="#" class="num"> &gt; </a>
            <a href="#" class="bt">마지막</a>
        </div>


    </div>
    
</div>

</body>

<script>

</script>



</html>