<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>


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
		<div class="box-body">
			<div class="form-group">
				<form:form action="AddSeizedAssetDetails" method="post"
					commandName="seizedAssetDetails" enctype="multipart/form-data">

					<div class="col-md-6">

						<div class="form-group">
							<label for="details">উদ্ধারকৃত /জব্দকৃত মালামালের বিবরণ </label>
							<form:textarea rows="4" type="text" class="form-control"
								path="details" placeholder="উদ্ধারকৃত  /জব্দকৃত  মালামালের বিবরণ " />
						</div>

						<div class="form-group">
							<label for="cost">উদ্ধারকৃত /জব্দকৃত  মালামালের আনুমানিক মূল্য </label>
							<form:input type="text" class="form-control" path="cost"
								placeholder="উদ্ধারকৃত /জব্দকৃত   মালামালের  আনুমানিক মূল্য  " />

						</div>

					</div>

					<div class="col-md-6">

						<div class="form-group">
							<label for="place"> উদ্ধারকৃত /জব্দকৃত  মালামালের উদ্ধারের স্থান </label>
							<form:textarea rows="4" type="text" class="form-control"
								path="place" placeholder=" উদ্ধারকৃত /জব্দকৃত  মালামালের  উদ্ধারের স্থান  " />
						</div>

						<div class="form-group">
							<label for="date">   মালামালের উদ্ধারের তারিখ </label>
							<form:input type="text" class="form-control" path="date"
								placeholder="   মালামালের  উদ্ধারের তারিখ " />

						</div>
					</div>

					<div class="col-md-6">

						<div class="form-group">
							<label for="time"> মালামালের উদ্ধারের সময় </label>
							<form:input type="text" class="form-control" id="time"
								path="time" placeholder="মালামালের উদ্ধারের সময় " />
							<form:errors path="time" />
						</div>

						<div class="form-group">
							<label for="prNumber"> উদ্ধারকৃত /জব্দকৃত কর্মকর্তার নাম </label>
							<form:input type="text" class="form-control" path="officerName"
								placeholder="উদ্ধারকৃত  কর্মকর্তার নাম" />
						</div>

						
					</div>
					
					<div class="col-md-6">
					

						<div class="form-group">
							<label for="mrNumbber"> উদ্ধারকৃত /জব্দকৃত কর্মকর্তার পদবী </label>
							<form:input type="text" class="form-control" path="officerPost"
								placeholder="উদ্ধারকৃত /জব্দকৃত  কর্মকর্তার পদবী  " />
						</div>
						<div class="form-group">
							<label for="prNumber"> পি আর নাম্বার </label>
							<form:input type="text" class="form-control" path="prNumber"
								placeholder=" মালামালের  উদ্ধারের তারিখ " />
						</div>
					</div> 



					<div class="col-md-6">

						

						<div class="form-group">
							<label for="mrNumbber"> এম আর নাম্বার </label>
							<form:input type="text" class="form-control" path="mrNumbber"
								placeholder="এম  আর নাম্বার " />
						</div>
						
						<div class="form-group">
							<label for="assetReliseProcess">সম্পত্তি নিস্পত্তির
								প্রক্রিয়া </label>
							<form:textarea type="text" class="form-control" id="remark"
								path="assetReliseProcess"
								placeholder="সম্পত্তি নিস্পত্তির প্রক্রিয়া" />
						</div>
					</div>
 
					<div class="col-md-6">
						

						<div class="form-group">
							<label for="assetReliseDate">সম্পত্তি নিস্পত্তির তারিখ </label>
							<form:input type="text" class="form-control" id="assetReliseDate"
								path="assetReliseDate" placeholder="সম্পত্তি নিস্পত্তির তারিখ " />
						</div>
					</div>
					
					<div class="col-md-6">
					<div class="form-group">
							<label for="timeOfCrime">সম্পত্তি নিস্পত্তির সময় </label>
							<form:input type="text" class="form-control" id="reliseTime"
								path="reliseTime" placeholder="সম্পত্তি নিস্পত্তির সময় " />
							<form:errors path="reliseTime" />
						</div>
						<div class="form-group">
							<label for="officeName">উদ্ধারকৃত /জব্দকৃত মালামালের তালিকা  </label> <form:input
								type="file" class="form-control" path="file" />
						</div>
					</div> 

					<div class="box-footer text-center col-md-12">
						<input type="submit" class="btn btn-primary" value="সেভ করুন " />
					</div>

				</form:form>

			</div>
		</div>
	</div>


	<br> <br>
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

