<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Add new case</title>



<%@ include file="css.jsp"%>
<script type="text/javascript"
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
</head>
<body class="skin-blue sidebar-mini">


	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>


		<div class="content-wrapper">
			<br>
			<br>
			<div class="nav-tabs-custom">
				<ul class="nav nav-pills">
					<li class="active"><a href="#tab_1" data-toggle="tab">প্রাথমিক তথ্য
					</a></li>

					<li><a href="#tab_0" data-toggle="tab">বাদী সম্পর্কিত তথ্য
					</a></li>
					<li><a href="#tab_2" data-toggle="tab">আসামি সম্পর্কিত
							তথ্য </a></li>

					<li><a href="#tab_6" data-toggle="tab">উদ্ধারকৃত /জব্দকৃত মালামালের বিবরণ</a></li>
					<li><a href="#tab_3" data-toggle="tab">তদন্তকারী সংস্থা
							সম্পর্কিত তথ্য</a></li>
					<li><a href="#tab_4" data-toggle="tab">তদন্তের ফলাফল</a></li>
					<li><a href="#CourtOrder" data-toggle="tab">বিচারের ফলাফল
					</a></li>
					<li><a href="#Remark" data-toggle="tab"> মন্তব্য </a></li>
				</ul>

				<div class="tab-content">


					<div class="tab-pane active" id="tab_1">
						<div class="form-group">
										<table id="criminalInformation"
												class="table table-striped table-bordered table-hover">

												<tbody>
													<tr>
														<td>সিরিয়াল নাম্বার</td>
														<td>${caseBasicInfo.serialNumber}</td>
													</tr>
													
													<tr>
														<td>জেলা</td>
														<td>${caseBasicInfo.district}</td>
													</tr>
													
													<tr>
														<td>উপজেলা/ থানার নাম</td>
														<td>${caseBasicInfo.policeStationName}</td>
													</tr>

													<tr>
														<td>কেস নাম্বার</td>
														<td>${caseBasicInfo.caseNumber}</td>
													</tr>
													
													<tr>
														<td>ঘটনাস্থল</td>
														<td>${caseBasicInfo.placeOfCrime}</td>
													</tr>
													<tr>
														<td>ঘটনার  সময় </td>
														<td>${caseBasicInfo.timeOfCrime}</td>
													</tr>
													
												  <tr>
												  <td>ঘটনার তারিখ</td> 
												  <td>${caseBasicInfo.dateOfCrime}</td>
												  </tr> 
													

													<tr>
														<td>কেসের তারিখ</td>
														<td>${caseBasicInfo.caseDate}</td>
													</tr>

													<tr>
														<td>আইন</td>
														<td>${caseBasicInfo.lawName}</td>
													</tr>
													
													<tr>
														<td>অপরাধের ধরণ </td>
														<td>${caseBasicInfo.typeOfCrime}</td>
													</tr>

													<tr>
														<td>কেস ধারা</td>
														<td>${caseBasicInfo.caseDahara}</td>
													</tr>
													
													
													
													<tr>
														<td>ঘটনার বিবরণ  </td>
														<td>${caseBasicInfo.crimeDescription}</td>
													</tr>

												</tbody>
											</table>
						
						</div>


					</div>





					<div class="tab-pane" id="tab_0">

						<br> <br>
						<div class="box box-primary">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">বাদি সম্পর্কিত তথ্য</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>

							
		<table id="requesterInfo"
			class="table table-striped table-bordered table-hover">

 

			<tbody>
				<tr>
					<td>বাদি নাম</td>
					<td>বাদির পদবি</td>
					<td>বাদির মোবাইল নাম্বার</td>
					 
				</tr>
				<c:forEach items="${requesterInfos}" var="requesterInfo">
					<tr>

						<td>${requesterInfo.requestorName}</td>

						<td>${requesterInfo.requesterId}</td>
						<td>${requesterInfo.requesterMobileNo}</td>
						 
					</tr>


				</c:forEach>
			</tbody>
		</table>

							

						</div>

					</div>

					<div class="tab-pane" id="tab_2">



						<div class="box box-primary">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">আসামি সম্পর্কিত তথ্য</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<table id="defaulderInfo"
								class="table table-striped table-bordered table-hover">



								<tbody>
									<tr>
										<td>আসামির নাম্বার</td>
										<td>আসামির নাম</td>
										<td>বয়স</td>
										<td>জেলা</td>
										<td>উপজেলা/থানা</td>
										<td>লিঙ্গ</td>
										<td>পিতার নাম</td>
										<td>মাতার নাম</td>
										<td>স্বামীর নাম</td>
										<td>ন্যাশনাল আই ডি</td>


									</tr>
									<c:forEach items="${defaulderInfos}" var="defaulderInfo">
										<tr>

											<td>${defaulderInfo.defulderNumber}</td>
											<td>${defaulderInfo.defulderName}</td>

											<td>${defaulderInfo.age}</td>
											<td>${defaulderInfo.district}</td>

											<td>${defaulderInfo.subDistrict}</td>
											<td>${defaulderInfo.gender}</td>

											<td>${defaulderInfo.fatherName}</td>
											<td>${defaulderInfo.motherName}</td>
											<td>${defaulderInfo.husbandName}</td>
											<td>${defaulderInfo.nationalId}</td>
										</tr>


									</c:forEach>
								</tbody>
							</table>

						</div>


					</div>


					<div class="tab-pane" id="tab_6">


						<div class="box box-primary">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">উদ্ধারকৃত /জব্দকৃত মালামালের বিবরণ</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>

						<table id="seizedInfo"
			class="table table-striped table-bordered table-hover">



			<tbody>
				<tr>
					<td>উদ্ধারকৃত /জব্দকৃত মালামালের বিবরণ</td>
					<td>মালামালের উদ্ধারের স্থান</td>
					<td>উদ্ধারকৃত /জব্দকৃত মালামালের আনুমানিক মূল্য</td>
					<td>মালামালের উদ্ধারের তারিখ</td>
					<td>মালামালের উদ্ধারের সময় </td> 
					<td>উদ্ধারকৃত /জব্দকৃত কর্মকর্তার নাম</td>
					<td>উদ্ধারকৃত /জব্দকৃত কর্মকর্তার পদবী</td>
					<td>পি আর নাম্বার</td>
					<td>এম আর নাম্বার</td>
					<td>সম্পত্তি নিস্পত্তির প্রক্রিয়া</td>
					<td>সম্পত্তি নিস্পত্তির তারিখ</td>
					<td>সম্পত্তি নিস্পত্তির সময়</td>
				</tr>
				<c:forEach items="${seizedList}" var="seizedDetails">
					<tr>

						<td>${seizedDetails.details}</td>
						<td>${seizedDetails.place}</td>
						<td>${seizedDetails.cost}</td>
						<td>${seizedDetails.date}</td>
						<td>${seizedDetails.time}</td>
						<td>${seizedDetails.officerName}</td>
						<td>${seizedDetails.officerPost}</td>
						<td>${seizedDetails.prNumber}</td>
						<td>${seizedDetails.mrNumbber}</td>
						
						<td>${seizedDetails.assetReliseProcess}</td>
						<td>${seizedDetails.assetReliseDate}</td>

						<td>${seizedDetails.reliseTime}</td>

					</tr>


				</c:forEach>
			</tbody>
		</table>

					

						</div>



					</div>

					<div class="tab-pane" id="tab_3">

						<div class="box box-primary">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">তদন্তকারী সংস্থার তথ্য</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>

							<table id="requesterInfo"
								class="table table-striped table-bordered table-hover">



								<tbody>
									<tr>
										<td>তদন্তকারী সংস্থার নাম</td>
										<td>তদন্তকারী কর্মকর্তার নাম</td>
										<td>তদন্তকারী কর্মকর্তার পদবী</td>
										<td>তদন্তকারী কর্মকর্তার মোবাইল নাম্বার</td>
									</tr>
									<c:forEach items="${orgList}" var="orgInfo">
										<tr>
											<td>${orgInfo.officeName}</td>
											<td>${orgInfo.officerName}</td>
											<td>${orgInfo.officerTitle}</td>
											<td>${orgInfo.officerMobileNO}</td>

										</tr>


									</c:forEach>
								</tbody>
							</table>



						</div>



					</div>


					<div class="tab-pane" id="tab_4">


						<br> <br>
						<div class="box box-primary">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">তদন্তর ফলাফল</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>

						
		<table id="invstResults"
			class="table table-striped table-bordered table-hover">



			<tbody>
				<tr>
					<td>সি এস নাম্বার</td>
					<td>কেসের ধারা</td>
					<td>এফ আর নাম্বার</td>
					<td>এফ আর টাইপ </td>
					<td>ফলফলের তারিখ</td> 
					<td>আসামীর নাম্বার</td> 
					<td>আসামীর নাম</td>
					<td>এফ আর এর তারিখ </td> 
					<td>আসামীর ঠিকানা</td> 
				</tr>
				<c:forEach items="${invResultList}" var="resultInfo">
					<tr>

						<td>${resultInfo.csNumber}</td>
						<td>${resultInfo.caseDhara}</td>
						<td>${resultInfo.frNumber}</td>
						<td>${resultInfo.frType}</td>						
						<td>${resultInfo.resultDate}</td>						
						<td>${resultInfo.defulderNumber}</td>
						<td>${resultInfo.defulderName}</td>
						<td>${resultInfo.frDate}</td>
						<td>${resultInfo.defulderAddress}</td>

					</tr>


				</c:forEach>
			</tbody>
		</table>

						

						</div>


					</div>


					<div class="tab-pane" id="Remark">


						<div class="box box-primary">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">মন্তব্য</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>

							<table id="requesterInfo"
								class="table table-striped table-bordered table-hover">



								<tbody>
									<tr>
										<td>মন্তব্য</td>
										<td>${remark.remark}</td>
									</tr>


								</tbody>
							</table>



						</div>



					</div>



					<div class="tab-pane" id="CourtOrder">


						<div class="box box-primary">
							<div class="box-header with-border">
								<i class="fa fa-bar-chart-o"></i>
								<h3 class="box-title">বিচারের ফলাফল সম্পর্কিত তথ্য</h3>
								<div class="box-tools pull-right">
									<button class="btn btn-box-tool" data-widget="collapse">
										<i class="fa fa-minus"></i>
									</button>
								</div>
							</div>

							<table id="requesterInfo"
								class="table table-striped table-bordered table-hover">



								<tbody>
									<tr>
										<td>আদালতের আদেশনামা / ম্যাজিস্ট্রেটের আদেশ</td>
										<td>${courtOrder.courtOrder}</td>
									</tr>
									<tr>
										<td>এফ আর নাম্বার</td>
										<td>${courtOrder.fmNumber}</td>
									</tr>
									<tr>
										<td>আদেশের তারিখ</td>
										<td>${courtOrder.date}</td>
									</tr>

								</tbody>
							</table>



						</div>

					</div>


				</div>

			</div>
		</div>

	</div>

	<%@ include file="javascript.jsp"%>
</body>
</html>
