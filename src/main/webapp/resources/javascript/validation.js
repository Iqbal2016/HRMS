$(document).ready(function() {

	$(".newCaseForm").validate({
		rules : {
			battalionName : {
				required : true
			},

			companyName : {
				required : true
			},

			serailNo : {
				required : true
			},

			policeStationName : {
				required : true
			},

			caseDhara : {
				required : true
			},
			lawName : {
				required : true
			},

		},
		messages : {
			battalionName : {
				required : "তথ্য আবশ্যক "
			},

			companyName : {
				required : "তথ্য আবশ্যক "
			},

			serailNo : {
				required : "তথ্য আবশ্যক "
			},

			policeStationName : {
				required : "তথ্য আবশ্যক "
			},

			caseDhara : {
				required : "তথ্য আবশ্যক "
			},
			lawName : {
				required : "তথ্য আবশ্যক "
			},

		}
	});

});