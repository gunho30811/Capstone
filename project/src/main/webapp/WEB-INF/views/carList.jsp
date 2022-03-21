<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="건호" content="width=device-width, initial-scale=1.0">
    <title>Car_model</title>
    <link rel="stylesheet" href="/resources/css/Car_model.css">
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
        <li><a href="CCTV.html">CCTV_analysis</a></li>
        <li><a href="Car_model.html">Car_model </a></li>
        <li><a href="">Streaming</a></li>
        <li><a href="QnA.html">QnA</a></li>
        <li><a href="Free.html">Free_Board</a></li>

    </ul>    
 
   
    </div>
    <div class="search-wrap">
    <select>
        <option>차종</option>
        <option>색</option>
        <option>차종+색</option>
    </select>  
    <input type="text" class="search-input" placeholder="Please Enter Text">

     <button type="submit" class="search-btn">검색</button>
    </div>

    <div class ="board_list_wrap">
        <table class="board_list">
        <caption>게시판 목록</caption>
            <thead>
                <tr>
                <th>인덱스</th>
                <th>차종</th>
                <th>색</th>
                <th>시간</th>                
                </tr>
         </thead>
         <tbody>
            <c:forEach items="${list}" var="dataVO"><!--   begin="${firstIndex}" end="${lastIndex}" step="1" varStatus="status">-->
                <tr>
                  <td><c:out value="${dataVO.seq}"/></td>
                  <td><c:out value="${dataVO.model}"/></td>
                  <td><c:out value="${dataVO.carColor}"/></td>
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