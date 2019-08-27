<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ajax_ex1</title>
	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
</head>

<body>
	<input type="text" id="id" value="기본값" />
	<input type="text" id="age" value="기본값" />
	
	<script>
		$(function(){
			$.get('http://127.0.0.1:3000/json/ex1.json', function(retdata){
				$('#id').val( retdata.id );
				$('#age').val( retdata.age );
			},'json');	
		});
	</script>
</body>
</html>