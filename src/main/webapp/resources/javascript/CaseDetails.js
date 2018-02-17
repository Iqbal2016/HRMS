function loadfunction(){
	alert("loading");
}

function loadMore(ButtonId){
	if(ButtonId=="criminalInfoButton"){
		var row = "";
			row = row  + "<tr><td><input type=\"text\" class=\"form-control\" id=\"criminalName_Criminal\" name=\"serailno\" placeholder=\"আসামির নাম\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"criminalAddress_Criminal\" name=\"serailno\" placeholder=\"আসামির ঠিকানা\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"thanaName_Criminal\" name=\"serailno\" placeholder=\"থানার নাম\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"district_Criminal\" name=\"serailno\" placeholder=\"জেলা\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"location_Criminal\" name=\"serailno\" placeholder=\"ঘটনাস্থল\"></td></tr>";
	
		$(row).insertBefore( "#Button_Criminal" );
	}
	if(ButtonId=="organizationInfoButton"){
		var row = "";
			row = row  + "<tr><td><input type=\"text\" class=\"form-control\" id=\"investigationOrgName_Org\" name=\"serailno\" placeholder=\"তদন্তকারী সংস্থার নাম\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"investigationOfficerName_Org\" name=\"serailno\" placeholder=\"তদন্তকারী কর্মকর্তার নাম\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"investigationOfficerRank_Org\" name=\"serailno\" placeholder=\"তদন্তকারী কর্মকর্তার পদবী\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"investigationOfficerMobile_Org\" name=\"serailno\" placeholder=\"তদন্তকারী কর্মকর্তার মোবাইল নাম্বার\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"csNumber_Org\" name=\"serailno\" placeholder=\"সি এস নাম্বার\"></td>"+
			"<td><input type=\"text\" class=\"form-control\" id=\"frNumber_Org\" name=\"serailno\" placeholder=\"এফ আর নাম্বার\"></td></tr>";
			
	
		$(row).insertBefore( "#Button_Org" );
	}
	if(ButtonId=="investigationInfoButton"){
		var row = "";
			row = row  + "<tr><td><input type=\"text\" class=\"form-control\" id=\"csNo_Investigation\" name=\"serailno\" placeholder=\"সি এস নাম্বার\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"frNo_Investigation\" name=\"serailno\" placeholder=\"এফ আর নাম্বার\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"caseNo_Investigation\" name=\"serailno\" placeholder=\"কেসের ধারা\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"resultDate_Investigation\" name=\"serailno\" placeholder=\"ফলফলের তারিখ\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"criminalName_Investigation\" name=\"serailno\" placeholder=\"আসামীর নাম\"></td>"+
			"<td><input type=\"text\" class=\"form-control\" id=\"criminalAddress_Investigation\" name=\"serailno\" placeholder=\"আসামীর ঠিকানা\"></td></tr>";
			
	
		$(row).insertBefore( "#Button_Investigation" );
	}
	
	if(ButtonId=="courtInfoButton"){
		var row = "";
			row = row  + "<tr><td><input type=\"text\" class=\"form-control\" id=\"courtOrder_Court\" name=\"serailno\" placeholder=\"আদালতের আদেশনামা\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"frNo_Court\" name=\"serailno\" placeholder=\"এফ আর নাম্বার\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"comment_Court\" name=\"serailno\" placeholder=\"মন্তব্য\"></td>" +
			"<td><input type=\"file\" class=\"form-control\" id=\"file_Court\" name=\"serailno\" placeholder=\"ফাইল\"></td>";
			
	
		$(row).insertBefore( "#Button_Court");
	}
	
	if(ButtonId=="seizedInfoButton"){
		var row = "";
			row = row  + "<tr><td><input type=\"text\" class=\"form-control\" id=\"caseDetails_Seized\" name=\"serailno\" placeholder=\"জিডি /মামলার  সূত্র\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"policeStation_Seized\" name=\"serailno\" placeholder=\"থানা\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"district_Seized\" name=\"serailno\" placeholder=\"জেলা\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"prNo_Seized\" name=\"serailno\" placeholder=\"পি আর নাম্বার\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"seizedDetails_Seized\" name=\"serailno\" placeholder=\"উদ্ধারকৃত মালামালের বিবরণ\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"seizedPrice_Seized\" name=\"serailno\" placeholder=\"উদ্ধারকৃত মালামালের আনুমানিক মূল্য\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"seizedLocation_Seized\" name=\"serailno\" placeholder=\"মালামালের উদ্ধারের স্থান\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"seizedDate_Seized\" name=\"serailno\" placeholder=\"মালামালের উদ্ধারের তারিখ\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"seizedOfficer_Seized\" name=\"serailno\" placeholder=\"উদ্ধারকারী কর্মকর্তার নাম\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"assetResult_Seized\" name=\"serailno\" placeholder=\"সম্পত্তি নিশপত্তির প্রক্রিয়া\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"assetDate_Seized\" name=\"serailno\" placeholder=\"সম্পত্তি নিশপত্তির তারিখ\"></td>" +
			"<td><input type=\"text\" class=\"form-control\" id=\"comment_Seized\" name=\"serailno\" placeholder=\"মন্তব্য\"></td>";
			
	
		$(row).insertBefore( "#Button_Seized");
	}
}