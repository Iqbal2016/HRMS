<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>


									<div class="tab-pane" id="tab_3">
										<div class="box box-primary">
											<div class="box-header with-border">
												<i class="fa fa-bar-chart-o"></i>
												<h3 class="box-title">তদন্তকারী সংস্থা</h3>
												<div class="box-tools pull-right">
													<button class="btn btn-box-tool" data-widget="collapse">
														<i class="fa fa-minus"></i>
													</button>
												</div>
											</div>
											<div class="box-body">
												<div class="form-group">
													<form:form action="addInvestigationOrgInfo" method="post"
														commandName="investigationOrganizationInfo">

														<div class="col-md-6">
															<div class="form-group">
																<label for="officeName">তদন্তকারী সংস্থার নাম </label>
																
																<form:select class="form-control"
														path="officeName" >
														<form:options items="${orgName}" />
													</form:select>
																 	</div>
																 	
																 	
															<div class="form-group">
																<label for="officerTitle">তদন্তকারী কর্মকর্তার
																	পদবী </label>
																<form:input type="text" class="form-control"
																	path="officerTitle"
																	placeholder="তদন্তকারী কর্মকর্তার  পদবী   " />
															</div>
																 	

															
														</div>
														<div class="col-md-6">
														<div class="form-group">
																<label for="officerName">তদন্তকারী কর্মকর্তার
																	নাম </label>
																<form:input type="text" class="form-control"
																	path="officerName"
																	placeholder="তদন্তকারী কর্মকর্তার নাম  " />
															</div>

															<div class="form-group">
																<label for="officerMobileNO">তদন্তকারী
																	কর্মকর্তার মোবাইল নাম্বার </label>
																<form:input type="text" class="form-control"
																	path="officerMobileNO"
																	placeholder="তদন্তকারী কর্মকর্তার মোবাইল নাম্বার  " />
															</div>
														</div>
														<div class="col-md-12">
															<div class="box-footer text-center">
																<input type="submit" class="btn btn-primary"
																	value="সেভ করুন " />
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
			<h3 class="box-title">তদন্তকারী সংস্থার তথ্য</h3>
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
					<td>তদন্তকারী সংস্থার নাম </td>
					<td>তদন্তকারী কর্মকর্তার নাম </td> 
					<td>তদন্তকারী কর্মকর্তার পদবী </td>
					<td>তদন্তকারী কর্মকর্তার মোবাইল নাম্বার </td>
				</tr> 
					<c:forEach items="${orgList}" var="orgInfo">
						<tr>
<td> ${orgInfo.officeName} </td>
<td> ${orgInfo.officerName} </td>
<td> ${orgInfo.officerTitle} </td>
<td> ${orgInfo.officerMobileNO} </td>
 
 </tr>


					</c:forEach>
			</tbody>
		</table>



	</div>

										
										
									</div>
