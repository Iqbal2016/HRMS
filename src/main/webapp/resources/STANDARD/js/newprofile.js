function initValidateProfile() {

	// Setup form validation on the #register-form element
	$("#newProfileForm").validate({
		errorClass : "my-error-class",
		validClass : "my-valid-class",
		// Specify the validation rules
		rules : {
			Id : {
				required : true
			},
			Name : {
				required : true
			},
			Address : {
				required : true
			}

		},
		messages : {
			Id : {
				required : "Please provide ID"
			},
			Name : {
				required : "Please provide Name"
			},
			Address : {
				required : "Please provide Address"
			}
		}
	});
}

function loadCustomerIdsForProfile() {
	var contextPath = $("input#contextPath").val();
	callProfileAjax(contextPath);
	setTimeout(function() {
		loadAssetFamilyName()
	}, 100);

};

function callProfileAjax(contextPath, successMessage) {
	$.ajax({
		type : "GET",
		contentType : "application/json",
		url : contextPath + "asset-management/getAllCustomerId",
		dataType : "json",
		success : function(data, textStatus, jqXHR) {
			if (successMessage != null) {
				callSuccessMessage(successMessage);
			}
			populateCustomerAdminIds1(data);
		},
		error : function(jqXHR, textStatus, errorThrown) {
		}
	});
};

function populateCustomerAdminIds1(data) {
	$('#CustomerIdProfileSelect').find('option').remove();
	// for (var id in data) {

	for (var i = 0; i < data.length; i++) {
		var customer = data[i];
		var index = i + 1;

		$("#CustomerIdProfileSelect").append(
				$("<option></option>").val(customer).html(customer));
	}
};
// asset family
function loadAssetFamilyName() {
	var contextPath = $("input#contextPath").val();
	callRuleServerAjax_profile(contextPath);
};

function callRuleServerAjax_profile(contextPath) {
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : contextPath + "asset-management/getAllAssetFamilyName",
		dataType : "json",
		success : function(data, textStatus, jqXHR) {
			// $('#form-msg-label').fadeToggle(3000);
			populateAssetFamilyName_Profile(data);
		},
		error : function(jqXHR, textStatus, errorThrown) {

		}
	});
};

function populateAssetFamilyName_Profile(data) {
	$('#assetfmaily').find('option').remove();
	// for (var id in data) {
	for (var i = 0; i < data.length; i++) {
		var assetfmaily = data[i];
		var index = i + 1;

		$("#assetfmaily").append(
				$("<option></option>").val(assetfmaily).html(assetfmaily));
	}
};

function submitNewProfile() { //alert(11111111111222222222);
	validateNewProfileRequest();

};

function validateNewProfileRequest() {

	//alert(2222222222222222);

	var Id = $("input#Id").val();
	 //alert("Id"+Id);
	var Name = $("input#Name").val();
	//alert("Name"+Name);
	var Address = $("input#Address").val();
	//alert("Address"+Address);

	
	var contextPath = $("input#contextPath").val();
	var jsonValue = JSON.stringify({
		"Id" : Id,
		"Name" : Name,
		"Address" : Address

	});
	// $('#form-msg-label').fadeToggle(3000);
	callAddProfileAjax(jsonValue, contextPath);
}

;
function loadProfileForSuccess(successMessage) {
	$('#page-wrapper').load('newprofile.html', function() {
		var contextPath = $("input#contextPath").val();
		if (successMessage != null) {
			callSuccessMessage(successMessage);
		}
	});
}

function callSuccessMessage(successMessage) {
	$('#form-msg-label').removeClass("display-alert, alert-danger").addClass(
			"alert-success").text(successMessage);
	// $('#form-msg-label').show();
	$("#form-msg-label").fadeOut(3000);
}
function callAddProfileAjax(jsonValue, contextPath) { alert(333333);
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : contextPath + "addProfile",
		//url : contextPath + "asset-management/addProfile",
		///HRMS/src/main/java/com/iqbal/hrms/controller/TestController.java
		data : jsonValue,
		dataType : "json",
		success : function(data, textStatus, jqXHR) {
			// $("#form-msg-label").text("Customer created successfully");
			// $("#form-msg-label").fadeIn(0);
			// $("#form-msg-label").fadeOut(3000);
			loadProfileForSuccess("Profile created successfully");
			// $("#form-msg-label").fadeOut(3000);
			loadCustomerIdsForProfile();

		},
		error : function(jqXHR, textStatus, errorThrown) {
			var message = jqXHR.status == 400 ? jqXHR.responseText : JSON
					.parse(jqXHR.responseText).errorMessage;
			$("#form-msg-label").removeClass("display-alert").text(message);
			$('#form-msg-label').show();
		}

	});
};

function ResetNewProfile() {
	// alert("Enter...............");
	$('#submitNewProfile')[0].reset();
	$("p#CustomerIdProfileSelect").text('XXXXXX');
	$("#submitNewProfile").show();
	$("#form-msg-label").hide();
};