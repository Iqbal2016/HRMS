<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Human Resource Management</title>
<%@ include file="css.jsp"%>
</head>
<!-- end: HEAD -->
<body>
	<div id="app">
		<%@ include file="headerAndSideManu.jsp"%>
		<div class="app-content">
			<%@ include file="topNavbar.jsp"%>
			<div class="main-content" id="main_content">
				<div class="wrap-content container" id="container">
					<!-- start: DASHBOARD TITLE -->
					<section id="page-title" class="padding-top-15 padding-bottom-15">
						<div class="row">
							<div class="col-sm-7">
								<h1 class="mainTitle">Dashboard</h1>
								<span class="mainDescription">overview &amp; stats </span>
							</div>
							<div class="col-sm-5">
								<!-- start: MINI STATS WITH SPARKLINE -->
								<ul class="mini-stats pull-right">
									<li>
										<div class="sparkline-1">
											<span></span>
										</div>
										<div class="values">
											<strong class="text-dark">18304</strong>
											<p class="text-small no-margin">Sales</p>
										</div>
									</li>
									<li>
										<div class="sparkline-2">
											<span></span>
										</div>
										<div class="values">
											<strong class="text-dark">&#36;3,833</strong>
											<p class="text-small no-margin">Earnings</p>
										</div>
									</li>
									<li>
										<div class="sparkline-3">
											<span></span>
										</div>
										<div class="values">
											<strong class="text-dark">&#36;848</strong>
											<p class="text-small no-margin">Referrals</p>
										</div>
									</li>
								</ul>
								<!-- end: MINI STATS WITH SPARKLINE -->
							</div>
						</div>
					</section>
					<!-- end: DASHBOARD TITLE -->
					<!-- start: Main CONTENT -->
						<%@ include file="main.jsp"%>
					<!-- end: Main CONTENT -->
				</div>
			</div>
		</div>
		<!-- start: FOOTER -->
		<%@ include file="footer.jsp"%>
		<!-- end: FOOTER -->
		<!-- start: OFF-SIDEBAR -->
		<%@ include file="offSidebar.jsp"%>
		<!-- end: OFF-SIDEBAR -->
		<!-- start: SETTINGS -->
		<%@ include file="setting.jsp"%>
		<!-- end: SETTINGS -->
	</div>
	<%@ include file="javascript.jsp"%>
</body>
</html>

