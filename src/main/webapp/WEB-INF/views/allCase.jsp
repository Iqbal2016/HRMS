
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>All case</title>



<%@ include file="css.jsp"%>
</head>
<body class="skin-blue sidebar-mini">


	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>

		<div class="content-wrapper">


			<section class="content ">
				


				<div class="box">

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
										<td><a href="${pageContext.request.contextPath}/reportByCompany?caseid=${report.caseSystemId}" >বিস্তারিত </a></td> 
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
