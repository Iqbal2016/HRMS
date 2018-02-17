<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Add Battalion</title>



<%@ include file="css.jsp"%>
</head>
<body class="skin-blue sidebar-mini">
	<%--  <div class="wrapper">
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

</div>  --%>

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
										<label for="battalionName">Battalion name</label> <input
											type="text" class="form-control" id="battalionName"
											name="battalionName" placeholder="Battalion name">
									</div>

									<div class="form-group">
										<label for="battalionArea">Battalion area</label> <input
											type="text" class="form-control" id="battalionArea"
											placeholder="Battalion area">
									</div>
									
									<div class="form-group">
										<label for="battalionArea">Battalion contact number</label> <input
											type="text" class="form-control" id="battalionArea"
											placeholder="Battalion contact number">
									</div>

									<div class="form-group">
										<label for="district">Coverage count </label> <input type="text"
											class="form-control" id="tehna" placeholder="Coverage count">
									</div>

									<div class="form-group">
										<label for="district">Status </label> <input type="text"
											class="form-control" id="district" placeholder="Status">
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
