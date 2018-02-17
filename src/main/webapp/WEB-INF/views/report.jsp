<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>report by Battalion and company</title>



<%@ include file="css.jsp"%>
</head>
<body class="skin-blue sidebar-mini">
	<%--  <div class="wrapper">
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

</div>  --%>

	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>


		<div class="content-wrapper">


			<section class="content ">
				<div class="row">
					<form:form id="reportByDate" action="searchByBatAndCompany"
						method="post" commandName="requestVO">


						<div class="box box-primary ">

							<div class="box-body">

								<div class="col-md-4">
									<div class="form-group">
										<label for="battalionName"> ব্যাটেলিয়ানের নাম </label>
										<form:select class="form-control" path="battalionName">
											<form:options items="${battalionNames}" />
										</form:select>
										<form:errors path="battalionName" />
									</div>
								</div>
<%-- 								<div class="col-md-4">
									<div class="form-group">
										<label for="companyName"> কম্পানির নাম </label>

										<form:select class="form-control" path="companyName">
											<form:options items="${companyNames}" />
										</form:select>

										<form:errors path="companyName" />
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="policeStationName">থানার নাম </label>
										<form:select class="form-control" path="thanaName">
											<form:options items="${policeStations}" />
										</form:select>
										<form:errors path="thanaName" />
									</div>
								</div> --%>



								<div class="col-md-12">
									<div class="box-footer text-center">
										<input type="submit" class="btn btn-primary"
											value="সার্চ করুন " />
									</div>
								</div>
							</div>
						</div>


					</form:form>


				</div>


				<div class="box">
<br><br><br>

					<div class="col-md-4">

						<div class="box box-primary ">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">ব্যাটেলিয়ানের ক্রাইম রিপোর্ট</h3>

							</div>
							<div class="box-body">

								<table id="BattalionCrimeSummary"
									class="table table-bordered table-hover">
									<thead>

										<tr>
											<th>ব্যাটেলিয়ানের নাম</th>
											<!-- <th>কম্পানির নাম</th> -->
											<th>কেস সংখ্যা</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${allBattalionSummary}"
											var="BattalionSummary">
											<tr>

												<td>${BattalionSummary.battalionName}</td>
												<%-- <td>${BattalionSummary.companyName}</td> --%>
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
								<h3 class="box-title">আইন   রিপোর্ট</h3>

							</div>
							<div class="box-body">

								<table id="BattalionCrimeSummary"
									class="table table-bordered table-hover">
									<thead>

										<tr>
											<th>ব্যাটেলিয়ানের নাম</th>
											<th>আইন</th>
											<th>কেস নাম্বার</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${allLawNameSummary}" var="BattalionSummary">
											<tr>

												<td>${BattalionSummary.battalionName}</td>
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
								<h3 class="box-title">অপরাধের ধরন  রিপোর্ট</h3>

							</div>
							<div class="box-body">

								<table id="BattalionCrimeSummary"
									class="table table-bordered table-hover">
									<thead>

										<tr>
											<th>ব্যাটেলিয়ানের নাম</th>
											<th>অপরাধের ধরন</th>
											<th>কেস নাম্বার</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${allCrimeTypeSummary}"
											var="BattalionSummary">
											<tr>

												<td>${BattalionSummary.battalionName}</td>
												<td>${BattalionSummary.typeOfCrime}</td>
												<td>${BattalionSummary.totalCaseNo}</td>
											</tr>

										</c:forEach>

									</tbody>
								</table>


							</div>

						</div>
					</div>
					
					
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

	<%@ include file="javascript.jsp"%>
	<script src="resources/javascript/ARform.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(function() {
			var bar_data = {
				data : [ [ "January", 10 ], [ "February", 8 ], [ "March", 4 ],
						[ "April", 13 ], [ "May", 17 ], [ "June", 9 ] ],
				color : "#3c8dbc"
			};

			$.plot("#bar-chart", [ bar_data ], {
				grid : {
					borderWidth : 1,
					borderColor : "#f3f3f3",
					tickColor : "#f3f3f3"
				},
				series : {
					bars : {
						show : true,
						barWidth : 0.5,
						align : "center"
					}
				},
				xaxis : {
					mode : "categories",
					tickLength : 0
				}
			});

		});

		function labelFormatter(label, series) {
			return "<div style='font-size:13px; text-align:center; padding:2px; color: #fff; font-weight: 600;'>"
					+ label + "<br/>" + Math.round(series.percent) + "%</div>";
		}
	</script>

</body>
</html>
