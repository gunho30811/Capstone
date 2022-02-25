<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>QnA 페이지</title>

    <!-- 기본 css -->
    <link rel="stylesheet" href="resources/css/common.css">
    <link rel="stylesheet" href="resources/css/layout.css">
    <link rel="stylesheet" href="resources/css/contents.css">

    <!-- 아코디언 메뉴 -->
    <link href="resources/accordion-menu/style.css" rel="stylesheet" type="text/css">


<title>QnA</title>
</head>
<script type="text/javascript">
		function search(){
			console.log("hihi")
					
			var name=document.getElementById("search").value;
					
			console.log((name));		
			location.href = "/QnAList"+"?option=search&name="+name;
		}
		
		function paging(Num){
			//var index=Num;
			//console.log(index);
			var pageNum=document.getElementById(Num).innerHTML;
			
			console.log((pageNum));
			location.href ="/QnAList"+"?option=page&pageNum="+pageNum;
		}
		
	
		function before(){
			var arr=[];
			
			for(var i=1;i<6;i++){
				arr[i]=document.getElementsByTagName("a")[i].innerHTML;
			}
			console.log("dsfds");
			if((parseInt(arr[1])!=1)){
				
				for(var i=1;i<6;i++){
					arr[i]=String(parseInt(arr[i])-1);
					console.log(parseInt(arr[i]));
				}
			}
			for(var i=0;i<5;i++){
				document.getElementsByTagName("a")[i+1].innerHTML=arr[i+1];
			}
			
			
		}
		
		function after(){
			var arr=[];
			
			for(var i=0;i<6;i++){
				arr[i]=document.getElementsByTagName("a")[i].innerHTML;
			}
			
			for(var i=1;i<6;i++){
				arr[i]=String(parseInt(arr[i])+1);
				console.log(arr[i]);
				
			}
			for(var i=0;i<5;i++){
				document.getElementsByTagName("a")[i+1].innerHTML=arr[i+1];
			}
			
		}
		function gotoEnroll(){
			location.href="/QnAList"+"?option=gotoEnroll";
		}
		function read(Num){
			var keyword=Num;
			console.log(keyword);
			
			location.href="/QnAList"+"?option=read&keyword="+keyword;
		}
</script>
<body>

	<header class="nav-left" role="banner">
        <div class="nav-head">
           
            <h1>QnA 게시판</h1>
        </div>
        </header>
 	<div class="contents">
		<div class="header">
            <p>게시판</p>
        </div>
        
        <!-- 컨텐츠 내용 -->
        <div class="contents-body">
            <div class="body-board">

                <div class="filter">
                    <p>검색하기</p>
                    <input type="text" class="inp_long" id="search" placeholder="제목 또는 작성자를 검색하세요">
                </div>
                <button class="btn filter_search_btn" onclick="search()">검색</button>
            </div>
            <div class="board_head_right">
                        
                 <button class="btn filter_search_btn" onclick="gotoEnroll()">등록하기</button>
            </div>
              <div class="tab_div">
                    <table class="list_tab">
                        <thead>
                                <tr>
                                    <th>No</th> 
                                    <th>제목</th>
                                    <th>작성자</th>
                                    <th>작성 시간</th>
                                    
                                    
                                </tr>
                            </thead>
                            <tbody  id="my-tbody">
                            
                            <c:forEach items="${list}" var="QnAVO" begin="${firstIndex}" end="${lastIndex}" step="1" varStatus="status">
                                <tr>
                                
                                <td><c:out value="${status.count}"/></td>
                                <td onclick="read(${QnAVO.seq})"><c:out value="${QnAVO.title}"/></td>
                                <td><c:out value="${QnAVO.userId}"/></td>
                                <td><c:out value="${QnAVO.time}"/></td>
                                
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="paging">
	                    <a class=“first” onclick="before()"> < </a>
	                    <a class=”ac” onclick="paging(1)" id="1">1 </a>
	                    <a onclick="paging(2)" id="2">2</a>
	                    <a onclick="paging(3)" id="3">3 </a>
	                    <a onclick="paging(4)" id="4">4</a>
	                    <a onclick="paging(5)" id="5">5 </a>
	                    <a class=“last” onclick="after()"> > </a>
         			</div>
                </div>
                
        </div>
        
       

</body>
</html>