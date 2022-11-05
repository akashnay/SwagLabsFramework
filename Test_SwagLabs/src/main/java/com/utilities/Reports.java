package com.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports addReport()
	{
		ExtentSparkReporter htmlReport=new ExtentSparkReporter("ExtentReport.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("CreatedBy", "AkashN");
		report.setSystemInfo("ReportType", "Sanity");
		return report;
	}
}
