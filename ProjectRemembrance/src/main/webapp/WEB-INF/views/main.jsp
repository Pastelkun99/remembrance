<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true" pageEncoding="UTF-8"%>


<html>
<head>
<%-- <jsp:include page="bootstrap.jsp"></jsp:include> --%>
<link
	href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resources/vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/sb-admin.css"
	rel="stylesheet" />


<title>Remembrance Project</title>
</head>


<body id="page-top">
	<%-- 	<jsp:include page="navigation.jsp"></jsp:include> --%>

	<nav class="navbar navbar-expand navbar-dark bg-dark static-top">
		<a class="navbar-brand mr-1"
			href="${pageContext.request.contextPath}/main.do">Word_Remembrance</a>

		<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>

		<!-- Navbar Search -->
		<form
			class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="Search for..."
					aria-label="Search" aria-describedby="basic-addon2">
				<div class="input-group-append">
					<button class="btn btn-primary" type="button">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>
		</form>

		<!-- Navbar -->
		<ul class="navbar-nav ml-auto ml-md-0">
			<li class="nav-item dropdown no-arrow mx-1"><a
				class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <span
					class="badge badge-danger">9+</span>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="alertsDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item dropdown no-arrow mx-1"><a
				class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i> <span
					class="badge badge-danger">7</span>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="messagesDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>

			<li class="nav-item dropdown no-arrow"><a
				class="nav-link dropdown-toggle" href="#" id="userDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-user-circle fa-fw"></i>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="userDropdown">
					<a class="dropdown-item" href="#">활동 내역</a> <a
						class="dropdown-item"
						href="${pageContext.request.contextPath}/main.do?menu=2">나의 계정
						수정</a>
					<div class="dropdown-divider"></div>
					<c:if test="${sessionScope.login_check eq null }">
						<a class="dropdown-item"
							href="${pageContext.request.contextPath}/login.do">로그인</a>
					</c:if>
					<c:if test="${sessionScope.login_check ne null }">
						<%String myid = (String)session.getAttribute("login_check");%>
						<a class="dropdown-item" > <FONT COLOR= "#FF0000"> <strong>  [<%=myid%>]님 로그인 </strong> </FONT> </a>
						<a class="dropdown-item" href="#" data-toggle="modal"
							data-target="#logoutModal">로그아웃</a>
					</c:if>
				</div></li>
		</ul>
	</nav>


	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="main.do">
					<i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
			</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle"
				href="${pageContext.request.contextPath}/main.do?menu=1"
				id="pagesDropdown" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> <i
					class="fas fa-fw fa-table"></i> <span>Word Start</span></a>
				<div class="dropdown-menu" aria-labelledby="pagesDropdown">
					<h6 class="dropdown-header">학습:</h6>
					<a class="dropdown-item"
						href="${pageContext.request.contextPath}/main.do?menu=1">학습 시작</a>
					<a class="dropdown-item"
						href="${pageContext.request.contextPath}/word/wordcard.do">단어장
						관리(x)</a>
					<div class="dropdown-divider"></div>
					<h6 class="dropdown-header">Other Pages:</h6>
					<%-- <a class="dropdown-item" href="${pageContext.request.contextPath}/main.do?menu=3">QnA</a> --%>
				</div></li>

			<li class="nav-item"><a class="nav-link" href="main.do"> <i
					class="fas fa-fw fa-chart-area"></i> <span>Activity Charts</span></a></li>

			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/main.do?menu=3"> <i
					class="fas fa-fw fa-chart-area"></i> <span>QnA Page</span></a></li>
		</ul>

		<div id="content-wrapper">

			<div class="container-fluid">

				<!-- <메뉴: 0번> 메인 (main.jsp 홈) -->
				<c:if test="${param.menu == 0 || param.menu == null}">
					<jsp:include page="menu_pages/00_home.jsp"></jsp:include>
				</c:if>

				<!-- <메뉴: 1번> 게임 시작 버튼 (word.jsp 홈 내부) -->
				<c:if test="${param.menu == 1}">
					<jsp:include page="menu_pages/01_word.jsp"></jsp:include>
				</c:if>

				<!-- <메뉴: 2번>"나의 계정 수정" 버튼 (userUpdate.jsp 홈 내부) -->
				<c:if test="${param.menu == 2}">
					<jsp:include page="menu_pages/02_userUpdate.jsp"></jsp:include>
				</c:if>

				<!-- <메뉴: 3번> QnA 게시판 (qboard.jsp 홈 내부) -->
				<c:if test="${param.menu == 3}">
					<jsp:include page="menu_pages/03_qboard.jsp"></jsp:include>
				</c:if>





			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>



	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">로그아웃</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">로그아웃 하시겠습니까?</div>
				<div class="modal-footer">
					<a class="btn btn-primary"
						href="${pageContext.request.contextPath}/logout.do">로그아웃</a>
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">취소</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script
		src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="${pageContext.request.contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Page level plugin JavaScript-->
	<script
		src="${pageContext.request.contextPath}/resources/vendor/chart.js/Chart.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendor/datatables/jquery.dataTables.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendor/datatables/dataTables.bootstrap4.js"></script>

	<!-- Custom scripts for all pages-->
	<script
		src="${pageContext.request.contextPath}/resources/js/sb-admin.min.js"></script>

	<!-- Demo scripts for this page-->
	<script
		src="${pageContext.request.contextPath}/resources/js/demo/datatables-demo.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/demo/chart-area-demo.js"></script>
</body>
</html>
