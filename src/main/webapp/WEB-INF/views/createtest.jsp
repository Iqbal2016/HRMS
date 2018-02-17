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
			<div class="main-content">
				<div class="wrap-content container" id="container">
					<!-- start: DASHBOARD TITLE -->
					<section id="page-title" class="padding-top-15 padding-bottom-15">
						<div class="row">
							<div class="col-sm-7">
								<h1 class="mainTitle">Test Registration</h1>
							</div>
							<div class="col-sm-5">
								<!-- start: MINI STATS WITH SPARKLINE -->
								<ul class="mini-stats pull-right">
									<li>
										<div class="sparkline-1">
											<span></span>
										</div>
										<div class="values">
											<p class="text-small no-margin">Sales</p>
										</div>
									</li>
									<li>
										<div class="sparkline-2">
											<span></span>
										</div>
										<div class="values">
											<p class="text-small no-margin">Earnings</p>
										</div>
									</li>
									<li>
										<div class="sparkline-3">
											<span></span>
										</div>
										<div class="values">
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
					<div class="container-fluid container-fullw bg-white">
						<div class="row">
							<div class="row margin-top-30">
								<div class="col-lg-6 col-md-12">
									<div class="panel panel-white">
										<div class="panel-body">
										<%-- <form:form id="newCaseForm" action="showdetailsinputform"
								method="post" commandName="caseBasicInfo"
								enctype="multipart/form-data"> --%>
											<form role="form" class="form-horizontal" id="createtest" action="savetest" method="post">
												<div class="form-group">
													<label class="col-sm-2 control-label" for="inputEmail3">
														Id </label>
													<div class="col-sm-10">
														<input type="text" placeholder="Id" id="inputEmail3" name="Id"
															class="form-control">
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-2 control-label" for="inputEmail3">
														Name </label>
													<div class="col-sm-10">
														<input type="text" placeholder="Name" id="inputEmail3" name="Name"
															class="form-control">
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-2 control-label" for="inputEmail3">
														Address </label>
													<div class="col-sm-10">
														<input type="text" placeholder="Address" id="inputEmail3" name="Address"
															class="form-control">
													</div>
												</div>
												<div class="form-group margin-bottom-0">
													<div class="col-sm-offset-2 col-sm-10">
														<button class="btn btn-o btn-primary" type="submit">
															Save</button>
													</div>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- end: Main CONTENT -->
					</div>
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
	<script src="resources/javascript/ARform.js" type="text/javascript"></script>

</body>
</html>

