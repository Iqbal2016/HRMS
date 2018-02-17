<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>report by Battalion</title>



<%@ include file="css.jsp"%>
</head>
<body class="skin-blue sidebar-mini">
 

	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>


		<div class="content-wrapper">


			<section class="content ">
				<div class="row">
					<form:form id="reportByDate" action="reportByCrime"
						method="post" commandName="requestVO">


						<div class="box box-primary ">

							<div class="box-body">

								<div class="col-md-4">
									<div class="form-group">
										<label for="lawName">আইন </label>

										<form:select class="form-control" path="lawName">
											<form:options items="${lawNames}" />
										</form:select>
										<form:errors path="lawName" />
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="caseDhara">কেস ধারা </label>
										<form:input type="text" class="form-control" path="caseDhara"
											placeholder="কেস ধারা  " />
										<form:errors path="caseDhara" />
									</div>
								</div>
								<div class="col-md-4">

									<div class="form-group">
										<label for="typeOfCrime">অপরাধের ধরণ </label>
										<form:input type="text" class="form-control"
											path="typeOfCrime" placeholder="অপরাধের ধরণ  " />
										<form:errors path="typeOfCrime" />
									</div>
								</div>



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

	<%@ include file="javascript.jsp"%>
	<script src="resources/javascript/ARform.js" type="text/javascript"></script>

</body>
</html>
