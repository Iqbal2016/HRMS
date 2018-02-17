$(document).ready(

function() {
	$("#searchByDate").datepicker({
		changeMonth : true,
		changeYear : true
	});

}

);

$(document).ready(function() {
	$('#example').dataTable({
		"dom" : 'T<"clear">lfrtip',
		"tableTools" : {
			"sSwfPath" : "/swf/copy_csv_xls_pdf.swf"
		}
	});
});