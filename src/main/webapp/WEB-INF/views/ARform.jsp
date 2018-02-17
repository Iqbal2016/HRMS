<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Asset registration form</title>



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

						<div class="col-md-6">
							<div class="box box-primary ">

								<div class="box-body">
									<div class="form-group">
										<label for="refDetails">GD / Reference details</label> <input
											type="text" class="form-control" id="refDetails"
											name="refDetails" placeholder="GD / Reference details">
									</div>

									<div class="form-group">
										<label for="policeStationName">police station Name</label> <input
											type="text" class="form-control" id="policestationname"
											placeholder="police Station Name">
									</div>

									  <div class="form-group">
                      <label>Thana</label>
                      <select class="form-control">
                        <option>Gulshan</option>
                        <option>Badda</option>
                        <option>Uttora</option>
                        <option>Shahbag</option>
                        <option>Mirpur</option> 
                        <option>Mohammadpur</option>
                        
                      </select>
                    </div>

									<div class="form-group">
										<label for="district">District </label> <input type="text"
											class="form-control" id="district" placeholder="District">
									</div>

									<div class="form-group">
										<label for="prNumber">PR number</label> <input type="text"
											class="form-control" id="prNumber" placeholder="PR number">
									</div>

								</div>
							</div>
						</div>
						
						
						<div class="col-md-6">

							<div class="box box-primary">

								<div class="box-body">

									<div class="form-group">
										<label for="mrNumber">MR number</label> <input type="text"
											class="form-control" id="mrNumber" placeholder="MR number">
									</div>

									<div class="form-group">
										<label for="mrNumber">Asset type</label> <input type="text"
											class="form-control" id="assetType" placeholder="Asset type">
									</div>

									<div class="form-group">
										<label for="mrNumber">Asset details</label> <input type="text"
											class="form-control" id="assetDetails"
											placeholder="Asset details">
									</div>

									<div class="form-group">
										<label for="mrNumber">Asset cost</label> <input type="text"
											class="form-control" id="assetCost" placeholder="Asset cost">
									</div>

									<div class="form-group">
										<label for="mrNumber">place   </label> <input type="text"
											class="form-control" id="Place" placeholder="place">
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
