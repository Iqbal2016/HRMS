<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>


<div class="tab-pane" id="AssetRelise">

	<div class="box box-primary">
		<div class="box-header with-border">
			<i class="fa fa-bar-chart-o"></i>
			<h3 class="box-title">সম্পত্তি নিস্পত্তির প্রক্রিয়া</h3>
			<div class="box-tools pull-right">
				<button class="btn btn-box-tool" data-widget="collapse">
					<i class="fa fa-minus"></i>
				</button>
			</div>
		</div>
		<div class="box-body">

			<div class="form-group">
				<form:form action="addAssetReliseProcess" method="post" commandName="assetReliseProcess">

					 

					<div class="form-group">
						<label for="assetReliseProcess">সম্পত্তি নিস্পত্তির
							প্রক্রিয়া </label>
						<form:textarea type="text" class="form-control" id="remark"
							path="assetReliseProcess"
							placeholder="সম্পত্তি নিস্পত্তির প্রক্রিয়া" />
					</div>

					<div class="form-group">
						<label for="assetReliseDate">সম্পত্তি নিস্পত্তির তারিখ </label>
						<form:textarea type="text" class="form-control" id="remark"
							path="assetReliseDate" placeholder="সম্পত্তি নিস্পত্তির তারিখ " />
					</div>


					<input type="submit" class="btn btn-primary" value="সেভ করুন " />

				</form:form>

			</div>
		</div>
	</div>
	
	
	<br> <br>
	<div class="box box-primary">
		<div class="box-header with-border">
			<i class="fa fa-bar-chart-o"></i>
			<h3 class="box-title">সম্পত্তি নিস্পত্তির প্রক্রিয়া </h3>
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
					<td>সম্পত্তি নিস্পত্তির প্রক্রিয়া</td>
					<td>${assetReliseProcess.assetReliseProcess}</td>
				</tr>
				<tr>
					<td>সম্পত্তি নিস্পত্তির তারিখ </td>
					<td>${assetReliseProcess.assetReliseDate}</td>
				</tr>
			 

			</tbody>
		</table>



	</div>

	

</div>


