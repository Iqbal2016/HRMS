package com.iqbal.hrms.util;

public class Constants {
	
	public static final String InsertDemo = "{call NewProcedure(?,?,?,?)}";
	public static final String GetByEmail = "{call getEmail(?)}";
	public static final String ADD_NEW_CASE = "{call ADD_NEW_CASE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String NEW_PROFILE_DETAILS_PROC_1 = "{call ADD_NEW_TEST(?,?,?)}";
	public static final String UPDATE_PROFILE_DETAILS_PROC_2 = "{call ADD_NEW_TEST(?,?,?)}";
	
	public static final String ADD_NEW_TEST = "{call ADD_NEW_TEST(?,?,?)}";
	public static final String Add_Defulder = "{call AddDefulder(?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String Add_Investiagation_Info = "{call AddInvestiagationInfo(?,?,?,?,?)}";
	public static final String Add_Investigation_Result = "{call AddInvestigationResult(?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String Add_Seized_Asset_Details = "{call AddSeizedAssetDetails(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	public static final String Add_Requester = "{call AddRequester(?,?,?,?,?)}";
	public static final String Add_Court_Order = "{call AddCourtOrder(?,?,?,?)}";
	public static final String Add_Remark = "{call AddRemark(?,?)}";
	public static final String Get_Battalion_Name = "{call GetBattalionName()}";
	public static final String Get_Company_Name = "{call getCompanyName()}";
	public static final String Get_Organizations = "{call getOrganization()}";
	public static final String Get_District = "{call GetDistrictName()}";
	public static final String Get_Police_Station = "{call getPiliceStationName()}";
	public static final String Add_Attached_File = "{call AddAttachment(?,?,?,?)}";
	public static final String Asset_Relise = "{call AddAsserReliseProcess(?,?,?)}";
	public static final String Get_Bat_Name_By_Id = "{call getBatNameById(?)}";
	public static final String Get_Comp_Name_By_Id = "{call GetCompNameById(?)}";
	public static final String GET_Case_Info = "{call GetCaseInfo(?)}";
	public static final String Get_Requester_Info = "{call GetRequesterInfo(?)}";
	public static final String Get_Defulder_Info = "{call GetDefaulderInfo(?)}";
	public static final String GetSeizedAssetInfo = "{call GetSeizedAssetInfo(?)}";
	public static final String GetInvestigationOfficeInfo = "{call GetInvestigationOfficeInfo(?)}";
	public static final String GetInvestigationresult = "{call GetInvestigationresult(?)}";
	public static final String GetCourtResult = "{call GetCourtResult(?)}";
	public static final String GetRemark = "{call GetRemark(?)}";
	public static final String GetAssetReliseProcess = "{call GetAssetReliseProcess(?)}";
	public static final String GetLawName = "{call GetLawName()}";
	public static final String ReportByDate = "{call ReportByDate(?,?)}";
	public static final String DashBoardData = "{call DashBoardData()}";
	public static final String ActivityReport = "{call ActivityReport()}";
	public static final String SearchByDate = "{call SearchByDate(?,?)}";
	public static final String SearchByBattalionAndCompany = "{call SearchByBattalionAndCompany(?)}";
	public static final String SearchByCrime = "{call SearchByCrime(?,?,?)}";
	public static final String getAllCase = "{call getAllCase()}";
	public static final String getTypeOfCrime="{call getTypeOfCrime()}";
	public static final String getCompanyListBYBattalion="{call getCompanyListBYBattalion(?)}"; 
	public static final String getThanaListBYDist="{call getthanaListBydist(?)}";
	public static final String CrimeReportByLawName = "{call CrimeReportByLawName()}";
	public static final String CrimeReportByTypeOfCrime = "{call CrimeReportByTypeOfCrime()}";
	public static final String CrimeReportByBattalion = "{call CrimeReportByBattalion()}";
	public static final String ReportSummaryByBattalion = "{call ReportSummaryByBattalion(?)}";
	public static final String ReportSummaryByLawName = "{call ReportSummaryByLawName(?)}";
	public static final String ReportSummaryByTypeOfCrime = "{call ReportSummaryByTypeOfCrime(?)}";
	public static final String DateSummaryForBattalionName = "{call DateSummaryForBattalionName(?,?)}";
	public static final String DateSummaryForLawName = "{call DateSummaryForLawName(?,?)}";
	public static final String DateSummaryForCrimeType = "{call DateSummaryForCrimeType(?,?)}"; 

}
