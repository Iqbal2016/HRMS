<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="tab-pane" id="tab_0">

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
		<div class="box-body">
			<div class="form-group">
				<form:form action="AddRequester?tab=tab_0" method="post"
					commandName="requesterInfo">

					<div class="col-md-6">
						<div class="form-group">
							<label for="requesterId">বাদির আই ডি </label>
							<form:input type="text" class="form-control" path="requesterId"
								placeholder="বাদির  আই ডি " />
						</div>


						<div class="form-group">
							<label for="requestorName">বাদির নাম </label>
							<form:input type="text" class="form-control" path="requestorName"
								placeholder="বাদির নাম" />
						</div>



					</div>

					<div class="col-md-6">




						<div class="form-group">
							<label for="requesterMobileNo">বাদির মোবাইল নাম্বার </label>
							<form:input type="text" class="form-control"
								path="requesterMobileNo" placeholder="বাদির মোবাইল নাম্বার " />
						</div>



					</div>
				<%-- 	 
					<div class="col-md-12">

						<div class="form-group">
							<label for="requesterAddress">গ্রাম /ঠিকানা</label>
							<form:textarea rows="8" type="text" class="form-control"
								path="requesterAddress" placeholder="গ্রাম /ঠিকানা" />
						</div>
					</div> --%>
 

					<div class="col-md-12">


						<div class="box-footer text-center">
							<input type="submit" class="btn btn-primary" value="সেভ করুন" />
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
 
  

