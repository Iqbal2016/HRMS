<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Add User</title>

<%@ include file="css.jsp"%>
</head>
<body class="skin-blue sidebar-mini">


	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>

		<div class="content-wrapper">


			<section class="content ">
				<div class="row">
					<form role="form"  >

						<div class="col-md-12">
							<div class="box box-primary ">

								<div class="box-body">
									<div class="form-group">
										<label for="battalionName">First name</label> <input
											type="text" class="form-control" id="battalionName"
											name="battalionName" placeholder="Battalion name">
									</div>
									
									<div class="form-group">
										<label for="battalionName">Last name</label> <input
											type="text" class="form-control" id="battalionName"
											name="battalionName" placeholder="Last name">
									</div>

									<div class="form-group">
										<label for="battalionArea">Email </label> <input
											type="email" class="form-control" id="battalionArea"
											placeholder="email address">
									</div>
									
									<div class="form-group">
										<label for="battalionArea">Password</label> <input
											type="password" class="form-control" id="battalionArea"
											placeholder="******">
									</div>

									

								</div>
							</div>
						</div>
						
							
								<div class="col-md-12 center">
							<div class="box-footer text-center">
								<button type="submit" class="btn btn-danger">Cancel</button>
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</div>


					</form>
				</div>
			</section>
		</div>
	</div>

	<%@ include file="javascript.jsp"%>
	<script src="resources/javascript/ARform.js" type="text/javascript"></script>

</body>
</html>
