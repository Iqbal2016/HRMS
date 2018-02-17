<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>


<div class="tab-pane" id="tab_4">


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
		<div class="box-body">
			<div class="form-group">
				<form:form action="addInvestigationResult" method="post"
					commandName="investigationResult" enctype="multipart/form-data">

					<div class="col-md-6">

						<div class="form-group">

							<label for="csNumber"> সি এস নাম্বার </label>
							<form:input type="text" class="form-control" path="csNumber"
								placeholder=" সি এস নাম্বার  " />
						</div>
						<div class="form-group">

							<label for="caseDhara"> কেসের ধারা </label>
							<form:input type="text" class="form-control" path="caseDhara"
								placeholder=" কেসের ধারা   " />
						</div>


					</div>

					<div class="col-md-6">


						<div class="form-group">

							<label for="frNumber"> এফ আর নাম্বার </label>
							<form:input type="text" class="form-control" path="frNumber"
								placeholder=" এফ আর নাম্বার  " />
						</div>
						<div class="form-group">

							<label for="frType"> এফ আর টাইপ </label>
							<form:input type="text" class="form-control" path="frType"
								placeholder=" এফ আর টাইপ  " />
						</div>



					</div>

					<div class="col-md-6">



						<div class="form-group">

							<label for="resultDate"> ফলফলের তারিখ </label>
							<form:input type="text" class="form-control" path="resultDate"
								id="resultDate1" placeholder=" ফলফলের তারিখ   " />
						</div>
						<div class="form-group">

							<label for="defulderName"> আসামীর নাম</label>
							<form:input type="text" class="form-control" path="defulderName"
								placeholder=" আসামীর নাম " />
						</div>




					</div>

					<div class="col-md-6">

						<div class="form-group">

							<label for="frDate"> এফ আর এর তারিখ </label>
							<form:input type="text" class="form-control" path="frDate"
								id="frDate1" placeholder="এফ আর এর তারিখ" />
						</div>
						<div class="form-group">

							<label for="defulderNumber"> আসামীর নাম্বার</label>
							<form:input type="text" class="form-control"
								path="defulderNumber" placeholder=" আসামীর নাম্বার " />
						</div>


					</div>

					
					<div class="col=md-12">

						<div class="form-group">

							<label for="defulderAddress"> আসামীর ঠিকানা</label>
							<form:textarea rows="4" type="text" class="form-control"
								path="defulderAddress" placeholder=" আসামীর  ঠিকানা" />
						</div>
					</div>
					
					<div class="col=md-6">

						<div class="form-group">
							<label for="officeName">এফ আর /সি এস অ্যাড করুন   </label>
							<form:input type="file" class="form-control" path="file" />
						</div>
						<div class="form-group"></div>
					</div>

					<div class="col-md-12">
						<div class="box-footer text-center">
							<input type="submit" class="btn btn-primary" value="সেভ করুন " />
						</div>
					</div>

				</form:form>

			</div>
		</div>
	</div>


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
					<td>এফ আর টাইপ</td>
					<td>ফলফলের তারিখ</td>
					<td>আসামীর নাম্বার</td>
					<td>আসামীর নাম</td>
					<td>এফ আর এর তারিখ</td>
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

