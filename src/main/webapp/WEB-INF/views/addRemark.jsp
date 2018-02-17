<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>


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
		<div class="box-body">

			<div class="form-group">
				<form:form action="AddRemark" method="post" commandName="caseRemark">
					<div class="form-group">


						<label for="remark">মন্তব্য </label>
						<form:textarea type="text" class="form-control" id="remark"
							path="remark" placeholder="মন্তব্য" />
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
			<h3 class="box-title">মন্তব্য </h3>
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


