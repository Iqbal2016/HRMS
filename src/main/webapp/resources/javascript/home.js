$(document).ready(

function() {

	$("#battalionName").change(function() {
		$('#companyName').find('option').remove().end(); // clear the city
															// ddl
		var battalionName = $(this).find("option:selected").text();

		$.ajax({

			url : myContextPath + '/getCompanyList',
			type : 'post',
			data : {
				'battalionName' : battalionName
			},
			cache : false,
			success : function(data) {

				var dataArray = data.split('$');

				// data=JSONArray.fromObject(data);
				var ddl = document.getElementById('companyName');
				var option = document.createElement('option');
				option.value = "";
				option.text = "SELECT A VALUE";
				ddl.appendChild(option);

				for (var c = 0; c < dataArray.length; c++) {

					var option = document.createElement('option');

					option.value = dataArray[c];
					option.text = dataArray[c];

					ddl.appendChild(option);

				}

			},
			error : function(jxhr) {
				alert(jxhr.responseText);

			}
		});

	}), $("#caseDate").datepicker({
		dateFormat : 'yyyy-mm-dd',
		changeMonth : true,
		changeYear : true
	}), $("#dateOfCrime").datepicker({
		dateFormat : 'yyyy-mm-dd',
		changeMonth : true,
		changeYear : true
	});
	// $('#timeOfCrime').timepicker({ 'scrollDefault': 'now' });

}

);

$(document).ready(

function() {

	$("#district").change(function() {
		$('#policeStationName').find('option').remove().end(); // clear the
																// city ddl
		var districtval = $(this).find("option:selected").text();

		$.ajax({

			url : myContextPath + '/getThanaList',
			type : 'post',
			data : {
				'distName' : districtval
			},
			cache : false,
			success : function(data) {
				var dataArray = data.split('$');
				var tname = document.getElementById('policeStationName');

				var option = document.createElement('option');

				option.value = "";
				option.text = "SELECT A VALUE";

				tname.appendChild(option);

				for (var c = 0; c < dataArray.length; c++) {

					var option = document.createElement('option');

					option.value = dataArray[c];
					option.text = dataArray[c];

					tname.appendChild(option);

				}

			},
			error : function(jxhr) {
				alert(jxhr.responseText);

			}
		});

	}), $("#caseDate").datepicker({
		dateFormat : 'yyyy-mm-dd',
		changeMonth : true,
		changeYear : true
	}), $("#dateOfCrime").datepicker({
		dateFormat : 'yyyy-mm-dd',
		changeMonth : true,
		changeYear : true
	});
	// $('#timeOfCrime').timepicker({ 'scrollDefault': 'now' });

}

);
