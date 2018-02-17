
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>report by Date</title>



<%@ include file="css.jsp"%>
</head>
<body class="skin-blue sidebar-mini">


	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>

		<div class="content-wrapper">


			<section class="content ">
				<div class="row">
					<form:form id="reportByDate" action="reportByDatepdf" method="post"
						commandName="requestVO">

						<div class="col-md-12">
							<div class="box box-primary ">

								<div class="box-body">

									<div class="form-group col-md-6">
										<label for="startingDate">প্রথম তারিখ </label>
										<form:input type="text" class="form-control" id="date1"
											path="startingDate" placeholder="প্রথম তারিখ  " />
										<form:errors path="startingDate" />
									</div>


									<div class="form-group col-md-6">
										<label for="endDate">শেষ তারিখ </label>
										<form:input type="text" class="form-control" id="date2"
											path="endDate" placeholder="শেষ তারিখ  " />
										<form:errors path="endDate" />
									</div>

									<div class="col-md-12">
										<div class="box-footer text-center">
											<input type="submit" class="btn btn-primary"
												value="সার্চ করুন " />
										</div>
									</div>
								</div>
							</div>
						</div>


					</form:form>


				</div>


				<div class="box">



					<section class="content">

						<div class="box box-primary">
							<div class="box-body">
								<br> <br> <br>

								<div class="col-md-4">

									<div class="box box-primary ">
										<div class="box-header with-border">
											<i class="fa fa-bar-chart-o"></i>
											<h3 class="box-title">ব্যাটেলিয়ানের ক্রাইম রিপোর্ট</h3>
											<div class="box-tools pull-right">
												<button class="btn btn-box-tool" data-widget="collapse">
													<i class="fa fa-minus"></i>
												</button>
												<button class="btn btn-box-tool" data-widget="remove">
													<i class="fa fa-times"></i>
												</button>
											</div>
										</div>
										<div class="box-body">

											<table id="BattalionCrimeSummary"
												class="table table-bordered table-hover">
												<thead>

													<tr>
														<th>ব্যাটেলিয়ানের নাম</th>
														<th>তারিখ</th>
														<th>কেস সংখ্যা</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${allBattalionSummary}"
														var="BattalionSummary">
														<tr>


															<td>${BattalionSummary.battalionName}</td>
															<td>${BattalionSummary.caseDate}</td>
															<td>${BattalionSummary.totalCaseNo}</td>
														</tr>

													</c:forEach>

												</tbody>
											</table>


										</div>
									</div>

								</div>

								<div class="col-md-4">

									<div class="box box-primary ">
										<div class="box-header with-border">
											<i class="fa fa-bar-chart-o"></i>
											<h3 class="box-title">আইন রিপোর্ট</h3>
											<div class="box-tools pull-right">
												<button class="btn btn-box-tool" data-widget="collapse">
													<i class="fa fa-minus"></i>
												</button>
												<button class="btn btn-box-tool" data-widget="remove">
													<i class="fa fa-times"></i>
												</button>
											</div>
										</div>
										<div class="box-body">

											<table id="BattalionCrimeSummary"
												class="table table-bordered table-hover">
												<thead>

													<tr>
														<th>তারিখ</th>
														<th>আইন</th>
														<th>কেস নাম্বার</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${allLawNameSummary}"
														var="BattalionSummary">
														<tr>

															<td>${BattalionSummary.caseDate}</td>
															<td>${BattalionSummary.lawName}</td>
															<td>${BattalionSummary.totalCaseNo}</td>
														</tr>

													</c:forEach>

												</tbody>
											</table>

										</div>
									</div>
								</div>

								<div class="col-md-4">

									<div class="box box-primary ">
										<div class="box-header with-border">
											<i class="fa fa-bar-chart-o"></i>
											<h3 class="box-title">অপরাধের ধরন রিপোর্ট</h3>
											<div class="box-tools pull-right">
												<button class="btn btn-box-tool" data-widget="collapse">
													<i class="fa fa-minus"></i>
												</button>
												<button class="btn btn-box-tool" data-widget="remove">
													<i class="fa fa-times"></i>
												</button>
											</div>
										</div>
										<div class="box-body">

											<table id="BattalionCrimeSummary"
												class="table table-bordered table-hover">
												<thead>

													<tr>
														<th>তারিখ</th>
														<th>অপরাধের ধরন</th>
														<th>কেস নাম্বার</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${allCrimeTypeSummary}"
														var="BattalionSummary">
														<tr>

															<td>${BattalionSummary.caseDate}</td>
															<td>${BattalionSummary.typeOfCrime}</td>
															<td>${BattalionSummary.totalCaseNo}</td>
														</tr>

													</c:forEach>

												</tbody>
											</table>


										</div>

									</div>
								</div>


							</div>
						</div>


					</section>



					<div class="box-body">
						<table id="reportByDate" class="table table-bordered table-hover">
							<thead>
								<tr>
									<th>ব্যাটেলিয়ানের নাম</th>

									<th>কম্পানির নাম</th>

									<th>সিরিয়াল নাম্বার</th>
									<th>কেস নাম্বার</th>
									<th>আইন</th>
									<th>অপরাধের ধরণ</th>
									<th>কেসের তারিখ</th>
									<th>বিস্তারিত</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${reports}" var="report">
									<tr>

										<td>${report.battalionName}</td>
										<td>${report.companyName}</td>
										<td>${report.serialNumber}</td>
										<td>${report.caseNumber}</td>
										<td>${report.lawName}</td>
										<td>${report.typeOfCrime}</td>
										<td>${report.caseDate}</td>
										<td><a
											href="${pageContext.request.contextPath}/reportByCompany?caseid=${report.caseSystemId}">বিস্তারিত
										</a></td>
									</tr>

								</c:forEach>

							</tbody>
						</table>
					</div>
					<!-- /.box-body -->
				</div>
				<!-- /.box -->

			</section>

		</div>
	</div>
	<script src="resources/javascript/ARform.js" type="text/javascript"></script>

	<%@ include file="javascript.jsp"%>

</body>
</html>
