<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<script>
	var myContextPath = "${pageContext.request.contextPath}"
</script>
<title>RAB-Add a New Case</title>



<%@ include file="css.jsp"%>

<script src="resources/javascript/home.js" type="text/javascript"></script>
<script type="text/javascript"
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
</head>
<body class="skin-blue sidebar-mini">


	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>

		<div class="content-wrapper">


			<section class="content">
				<div class="row">

					<div class="col-md-12">
						<div class="box-body ">

							<form:form id="newCaseForm" action="showdetailsinputform"
								method="post" commandName="caseBasicInfo"
								enctype="multipart/form-data">

								<div class="col-md-12">

									<div class="box box-primary ">
										<div class="box-header with-border">
											<i class="fa fa-bar-chart-o"></i>
											<h3 class="box-title">প্রাথমিক তথ্য</h3>

										</div>
										<div class="box-body">

											<div class="col-md-6">
												<div class="form-group">
													<label for="battalionName"> ব্যাটেলিয়ানের নাম </label>
													<form:select class="form-control" path="battalionName">
														<form:options items="${battalionNames}" />
													</form:select>
													<form:errors path="battalionName" />
												</div>

												<div class="form-group">
													<label for="companyName"> কম্পানির নাম </label>

													<form:select class="form-control" path="companyName">
														<form:options items="${companyNames}" />
													</form:select>

													<form:errors path="companyName" />
												</div>
											</div>

											<div class="col-md-6">
												<div class="form-group">
													<label for="serailNo">সিরিয়াল নাম্বার </label>
													<form:input type="text" class="form-control"
														path="serialNumber" placeholder="সিরিয়াল নাম্বার  " />
													<form:errors path="serialNumber" />
												</div>

												<div class="form-group">
													<label for="district"> জেলা </label>

													<form:select class="form-control" path="district">
														<form:options items="${district}" />
													</form:select>
												</div>


											</div>

											<div class="col-md-6">

												<div class="form-group">
													<label for="caseDate">কেসের তারিখ </label>
													<form:input type="text" class="form-control"
														path="caseDate" placeholder="কেসের তারিখ " />
													<form:errors path="caseDate" />
												</div>

												<div class="form-group">
													<label for="caseNumber">কেস নাম্বার </label>
													<form:input type="text" class="form-control"
														path="caseNumber" placeholder="কেস   নাম্বার " />
													<form:errors path="caseNumber" />
												</div>


											</div>

											<div class="col-md-6">

												<div class="form-group">
													<label for="policeStationName">উপজেলা /থানার নাম </label>
													<form:select class="form-control" path="policeStationName">
														<form:options items="${policeStations}" />
													</form:select>
													<form:errors path="policeStationName" />
												</div>



												<div class="form-group">
													<label for="placeOfCrime">ঘটনাস্থল </label>
													<form:input type="text" class="form-control"
														path="placeOfCrime" placeholder="ঘটনাস্থল " />
													<form:errors path="placeOfCrime" />
												</div>


											</div>



											<div class="col-md-6">

												<div class="form-group">
													<label for="dateOfCrime">ঘটনার তারিখ </label>
													<form:input type="text" class="form-control"
														path="dateOfCrime" placeholder="ঘটনার  তারিখ " />
													<form:errors path="dateOfCrime" />
												</div>

												<div class="form-group">
													<label for="timeOfCrime">ঘটনার সময় </label>
													<form:input type="text" class="form-control"
														path="timeOfCrime" placeholder="ঘটনার  সময় " />
													<form:errors path="timeOfCrime" />
												</div>

											</div>

											<div class="col-md-6">
												<div class="form-group">
													<label for="lawName">আইন </label>

													<form:select class="form-control" path="lawName">
														<form:options items="${lawNames}" />
													</form:select>
													<form:errors path="lawName" />
												</div>
											</div>

											<div class="col-md-6">

												<div class="form-group">
													<label for="typeOfCrime">অপরাধের ধরণ </label>

													<form:select class="form-control" path="typeOfCrime">
														<form:options items="${typeOfCrimes}" />
													</form:select>
													<form:errors path="typeOfCrime" />
												</div>


											</div>




											<div class="col-md-12">

												<div class="form-group">
													<label for="caseDhara">কেস ধারা </label>
													<form:textarea rows="2" type="text" class="form-control"
														path="caseDahara" placeholder="কেস ধারা  " />
													<form:errors path="caseDahara" />
												</div>

												<div class="form-group">
													<label for="crimeDescription">ঘটনার বিবরণ </label>
													<form:textarea rows="2" type="text" class="form-control"
														path="crimeDescription" placeholder="ঘটনার বিবরণ  " />
													<form:errors path="crimeDescription" />
												</div>
											</div>

											<div class="col-md-6">
												<div class="form-group">
													<label for="officeName">এফ আই আর আটাচমেন্ট </label>
													<form:input type="file" class="form-control" path="file" />
												</div>
											</div>

											<div class="col-md-12">
												<div class="box-footer text-center">
													<input type="submit" class="btn btn-primary"
														value="সেভ করুন " />
												</div>
											</div>

										</div>

									</div>


								</div>

								<!-- <div class="col-md-2 "></div>
									<div class="col-md-8"></div> -->


							</form:form>

						</div>
					</div>
				</div>
			</section>
		</div>
	</div>

	<%@ include file="javascript.jsp"%>
</body>
</html>

<script type="text/javascript">
	$(document).ready(function() {

		$("#newCaseForm").validate({
			rules : {
				battalionName : {
					required : true
				},

				companyName : {
					required : true
				},

				serailNo : {
					required : true
				},

				policeStationName : {
					required : true
				},

				caseDhara : {
					required : true
				},
				lawName : {
					required : true
				},

			},
			messages : {
				battalionName : {
					required : "তথ্য আবশ্যক "
				},

				companyName : {
					required : "তথ্য আবশ্যক "
				},

				serailNo : {
					required : "তথ্য আবশ্যক "
				},

				policeStationName : {
					required : "তথ্য আবশ্যক "
				},

				caseDhara : {
					required : "তথ্য আবশ্যক "
				},
				lawName : {
					required : "তথ্য আবশ্যক "
				},

			}
		});

	})
</script>
