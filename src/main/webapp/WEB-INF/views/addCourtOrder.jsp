<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="addRemark.jsp"%>


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
		<div class="box-body">
			<div class="form-group">
				<form:form action="AddCourtOrder" method="post"
					commandName="courtOrder" enctype="multipart/form-data">

					<div class="col-md-12">
						<div class="form-group">
							<label for="defulderName">আদালতের আদেশনামা /
								ম্যাজিস্ট্রেটের আদেশ </label>
							<form:textarea rows="4" type="text" class="form-control"
								path="courtOrder"
								placeholder=" আদালতের আদেশনামা  / ম্যাজিস্ট্রেটের আদেশ " />
						</div>

					</div>
					<div class="col-md-4">


						<div class="form-group">
							<label for="date">আদেশের তারিখ </label>
							<form:input type="text" class="form-control" path="date" id="courtOrder2"
								placeholder=" আদেশের তারিখ  " />
						</div>
						</div>
						<div class="col-md-4">
						<div class="form-group">
							<label for="fmNumber">এফ এম নাম্বার</label>
							<form:input type="text" class="form-control" path="fmNumber"
								placeholder="এফ এম নাম্বার" /> 
						</div>
						</div>
						<div class="col-md-4">
						<div class="form-group">
							<label for="officeName">এফ এম ফাইল</label> <form:input
								type="file" class="form-control" path="file" />
						</div>
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

