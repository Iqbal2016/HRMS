<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="false"%>
<html>
<head>
<title>Add new case</title>



<%@ include file="css.jsp"%>
<script type="text/javascript" 
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>

</head>
<body class="skin-blue sidebar-mini">


	<div class="wrapper">

		<%@ include file="headerAndSideManu.jsp"%>

		<div class="content-wrapper">

 
				<div class="row">

					<div class="col-md-12">

						<div class="box box-primary">

							<div class="box-body">
 
 	
							<form:form id="demoForm" action="register" method="post" commandName="user" >
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="username" />
                    
                    <form:errors path="username" /></td>
                    
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="email" /></td>
                </tr>
                
                <tr>
                    <td>Profession:</td>
                    <td><form:input path="profession" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
							
									</div>
						</div>
					
					<div class="wrapper">
      
      <div class="content-wrapper">
        
        <section class="content">
       
          <div class="row"> 
		  <div class="col-md-12">
           
              <div class="box box-primary">
                <div class="box-header with-border">
                  <i class="fa fa-bar-chart-o"></i>
                  <h3 class="box-title">Bar Chart</h3>
                  <div class="box-tools pull-right">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                    <button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
                  </div>
                </div>
                <div class="box-body">
                  <div id="bar-chart" style="height: 300px;"></div>
                </div> 
              </div> 

               </div> 
          </div> 
        </section> 

      </div> 
      
    </div> 

					
					
					</div>
				</div>
		 
		</div>
	</div>

	<%@ include file="javascript.jsp"%>

 <script type="text/javascript">

      $(function () {
          var bar_data = {
          data: [["January", 10], ["February", 8], ["March", 4], ["April", 13], ["May", 17], ["June", 9]],
          color: "#3c8dbc"
        };
      
	  $.plot("#bar-chart", [bar_data], {
          grid: {
            borderWidth: 1,
            borderColor: "#f3f3f3",
            tickColor: "#f3f3f3"
          },
          series: {
            bars: {
              show: true,
              barWidth: 0.5,
              align: "center"
            }
          },
          xaxis: {
            mode: "categories",
            tickLength: 0
          }
        });
       
      });

       
      function labelFormatter(label, series) {
        return "<div style='font-size:13px; text-align:center; padding:2px; color: #fff; font-weight: 600;'>"
                + label
                + "<br/>"
                + Math.round(series.percent) + "%</div>";
      }
    </script>
 
</body>
</html>
