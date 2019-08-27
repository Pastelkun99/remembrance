<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h3>게시판 내용</h3>
	<table border="1">
		<tr>
			<th>글번호</th>
			<td>${map.Q_NO}</td>
		</tr>
		<tr>	
			<th>제목</th>
			<td>${map.Q_TITLE}</td>
		</tr>		
		<tr>	
			<th>내용</th>
			<td>${map.Q_CONTENT}</td>
		</tr>
		<tr>	
			<th>작성자</th>
			<td>${map.Q_WRITER}</td>
		</tr>
		<tr>	
			<th>조회수</th>
			<td>${map.Q_HIT}</td>
		</tr>
		<tr>	
			<th>날짜</th>
			<td>${map.Q_DATE}</td>
		</tr>	
	</table>
	<a href="qboard.do">글목록</a>
	<c:if test="${prev != 0 }">
		<a href="qboardc.do?no=${prev}">이전글</a>
	</c:if>
	<c:if test="${next != 0 }">
		<a href="qboardc.do?no=${next}">다음글</a>
	</c:if>
	<a href="qboarde.do?no=${map.Q_NO}">글수정</a>
</body>
</html>