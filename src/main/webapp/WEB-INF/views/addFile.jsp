<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>

<div class="tab-pane" id="fileUpload">

	<div class="box box-primary">
		<div class="box-header with-border">
			<i class="fa fa-bar-chart-o"></i>
			<h3 class="box-title">ফাইল আপলোড</h3>
			<div class="box-tools pull-right">
				<button class="btn btn-box-tool" data-widget="collapse">
					<i class="fa fa-minus"></i>
				</button>
			</div>
		</div>
		<div class="box-body">

			<div class="form-group">
				<form:form action="AddFile" method="post"
					enctype="multipart/form-data">


					<div class="col-md-6">
						<div class="form-group">
							<label for="serailNo">নথির নাম </label> <input type="text"
								class="form-control" name="fileName" placeholder="নথির নাম" />
							<form:errors path="fileName" />
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<label for="officeName">নথি অ্যাড করুন </label> <input
								type="file" class="form-control" name="file" multiple="multiple" />
						</div>
					</div>

					<div class="box-footer text-center col-md-12">
						<input type="submit" class="btn btn-primary" value="সেভ করুন " />
					</div>

				</form:form>

			</div>
		</div>
	</div>

</div>

