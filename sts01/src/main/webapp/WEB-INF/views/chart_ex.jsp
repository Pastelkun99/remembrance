<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>chart</title>
	<link href="${pageContext.request.contextPath}/resources/css/c3.min.css" rel="stylesheet" />
	
	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
	<script src="https://d3js.org/d3.v5.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/c3.min.js"></script>
</head>

<body>
	<div id="chart"></div>
	
	<script>
		$(function(){
			var chart = c3.generate({
				bindto : '#chart',
				data : {
					columns : [
						['data1',10, 20, 30],
						['data2',17, 45, 22],
						['data3',17, 34, 32]
					],
					type:'bar'
				}
			});
			
			setInterval(function(){
				$.get('http://127.0.0.1:3000/json/ex5.json', function(retdata){
					//console.log(retdata.data);
					//console.log(eval(retdata.data));
					//eval => string data를 object로 변환함.
					chart.load({
						columns : 
							eval(retdata.data)
					});
				},'json');
			},1000);
		});
	</script>
</body>
</html>