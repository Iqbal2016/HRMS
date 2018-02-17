
function loadNewCustomer(){
	$('#page-wrapper').load('newcustomer.html');
}

function loadNewProfile(){ //alert("iqbal Hossain");
	$('#main_content').load('resources/STANDARD/views/okk.html');
	//$('#main_content').load('newprofile.html');
}

function loadNewRuleSection(){
	$('#page-wrapper').load('newrulesection.html',loadRuleSectionNameInRulesection);

}
//loadCreateSection
function loadCreateSection(){
	$('#page-wrapper').load('newcreatesection.html',loadAssetFamilyName_Section);
}

//loadRuleMapping
function loadRuleMapping(){
	$('#page-wrapper').load('newrulemapping.html');
}

function SearchCustomer(){
	$('#page-wrapper').load('topsearch.html', FindCustomerforSearch);
}


function loadEditCustomer(){
	$('#page-wrapper').load('editcustomer.html',FindCustomer);
	$(document).ready(function () {
		$("div#customerEditDiv.col-lg-6").hide();
	});
}


function cancel(){
    if(jQuery('#form-msg-label')[0]!=undefined)
    jQuery('#form-msg-label')[0].innerHTML="";
}


function loadAdmin(){
	$('#page-wrapper').load('newcustomeradmin.html',loadCustomerIds);
}


function loadEditAdmin(){
	$('#page-wrapper').load('editcustomeradmin.html',FindAdmin);
}


function loadNewSite(){
	$('#page-wrapper').load('newsiteserver.html',loadCustomerIdsInSiteServer);
}


function loadEditSite(){
	$('#page-wrapper').load('editsiteserver.html',FindServer);

}
//EditProfile

function EditProfile(){
	$('#page-wrapper').load('editprofile.html',FindProfile);
}
function EditRule(){
	$('#page-wrapper').load('editrule.html', FindRule);
}
//loadEditSection
function loadEditSection(){
	$('#page-wrapper').load('editsection.html', FindSection);
}

function EditRuleMapping(){
	$('#page-wrapper').load('editruleMapping.html',FindRuleMapping);
}


function loadResetAdminPassword(){
	$('#page-wrapper').load('resetAdminpassword.html',FindAdminPassword);
}




function loadDashboard(){
	//$('#page-wrapper').load('blank.html');
        if(window!=null&&window.location!=null)
        window.location.reload();
        
}
