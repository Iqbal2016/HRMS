
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>

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
		<div class="box-body">
			<div class="form-group">
				<form:form action="defultderInfo" method="post"
					commandName="defulderInformation">

					<div class="col-md-6">

						<div class="form-group">

							<label for="defulderName">আসামির নাম্বার </label>
							<form:input type="text" class="form-control"
								path="defulderNumber" placeholder="আসামির নাম্বার   " />
						</div>


						<div class="form-group">
							<label for="defulderName">আসামির নাম </label>
							<form:input type="text" class="form-control" path="defulderName"
								placeholder="আসামির নাম  " />
						</div>

					</div>

					<div class="col-md-6">



						<div class="form-group">
							<label for="district"> জেলা </label>

							<form:select class="form-control" path="district">
								<form:options items="${district}" />
							</form:select>
						</div>
						
							<div class="form-group">
													<label for="subDistrict">উপজেলা /থানার নাম </label>
													<form:select class="form-control" path="subDistrict">
														<form:options items="${policeStations}" />
													</form:select>
													<form:errors path="subDistrict" />
												</div>
						 
					</div>
					<div class="col-md-6">



						<div class="form-group">
							<label for="fatherName">পিতার নাম </label>
							<form:input rows="4" type="text" class="form-control"
								path="fatherName" placeholder="পিতার নাম " />
						</div>

						<div class="form-group">
							<label for="motherName">মাতার নাম </label>
							<form:input type="text" class="form-control" path="motherName"
								placeholder="মাতার নাম " />
						</div>
						<div class="form-group">
							<label for="nationalId"> ন্যাশনাল আই ডি </label>

							<form:input type="text" class="form-control" path="nationalId"
								placeholder="ন্যাশনাল আই ডি   " />
						</div>

					</div>

					<div class="col-md-6">


						<div class="form-group">
							<label for="district"> লিঙ্গ </label>

							<form:select class="form-control" path="gender">
								<option value="">select a value</option>
								<option value="পুরুষ">পুরুষ</option>
								<option value="মহিলা ">মহিলা</option>
								<option value="অনন্যা ">অনন্যা</option>
							</form:select>
						</div>

						<div class="form-group">
							<label for="husbandName">স্বামীর /স্ত্রীর  নাম </label>
							<form:input type="text" class="form-control" path="husbandName"  
								placeholder="স্বামীর নাম   " />
						</div>
						
						 
						<div class="form-group">
							<label for="age">বয়স </label>
							<form:input type="number" class="form-control" path="age"
								placeholder="বয়স  " />
						</div>


					</div>

					<div class="col-md-12">

						<div class="form-group">
							<label for="defulderAddress">গ্রাম /ঠিকানা</label>
							<form:textarea rows="2" type="text" class="form-control"
								path="defulderAddress" placeholder="গ্রাম /ঠিকানা" />
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
					<td>উপজেলা</td>
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
