<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>RAB Case Managment System</title>

<script>var myContextPath = "${pageContext.request.contextPath}"</script>
 
<%@ include file="css.jsp"%>
<script type="text/javascript" src="resources/javascript/detailsInput.js"></script>

</head>
<body class="skin-blue sidebar-mini">


	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>

		<div class="content-wrapper">


			<section class="content">
				<div class="row">

					<div class="col-md-12">

						<div class="box-body">
							<div class="nav-tabs-custom" id="ttabs">
								<ul class="nav nav-pills">
									<li><a href="#tab_1" name="tab_1" data-toggle="tab">প্রাথমিক তথ্য
									</a></li>

									<li><a href="#tab_0" name="tab_0" data-toggle="tab">বাদী সম্পর্কিত
											তথ্য </a></li>
									<li><a href="#tab_2" data-toggle="tab">আসামি সম্পর্কিত
											তথ্য </a></li>

									<li><a href="#tab_6" data-toggle="tab">উদ্ধারকৃত /জব্দকৃত মালামালের বিবরণ</a></li>
									<li><a href="#tab_3" data-toggle="tab">তদন্তকারী
											সংস্থা সম্পর্কিত তথ্য</a></li>
									<li><a href="#tab_4" data-toggle="tab">তদন্তের ফলাফল</a></li>
									<li><a href="#CourtOrder" data-toggle="tab">বিচারের
											ফলাফল </a></li>
									<li><a href="#Remark" data-toggle="tab"> মন্তব্য </a></li>
									
										<li><a href="#fileUpload" data-toggle="tab">ফাইল আপলোড  </a></li>
										
										 
								</ul>
								<div class="tab-content">
								
								


									<div class="tab-pane" id="tab_1">
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
									 



<%@ include file="requesterPage.jsp"%>
<%@ include file="defulderPage.jsp"%>
<%@ include file="seizedAsset.jsp"%>
<%@ include file="InvestiganOffice.jsp"%>
<%@ include file="InvestigationResult.jsp"%>
<%@ include file="addFile.jsp"%>
<%@ include file="addRemark.jsp"%>
<%@ include file="addCourtOrder.jsp"%> 
					
					
 </div>
								<!-- /.tab-content -->
							</div>

						</div>
					</div>
				</div>
			</section>
		</div>
	</div>

	<%@ include file="javascript.jsp"%>
	 <script src="resources/javascript/detailsInput.js" type="text/javascript"></script>

 
</body>
</html>
