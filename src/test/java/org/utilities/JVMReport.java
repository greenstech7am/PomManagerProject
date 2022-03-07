package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJvmReport(String jsonPath) {
		
		// 1. Mention the target folder location - File
		File f = new File(System.getProperty("user.dir")+"\\target\\reports\\JvmReport");
		
		// 2. Add details to the report using Configuration class
		
		Configuration con = new Configuration(f, "Facebook Application");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser Version", "97");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("OS Version", "10");
		con.addClassifications("Sprint", "32");
		
		//3. Add json file paths into List<String>
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		
		//4. Create object for ReportBuilder class and using the created object call generateReports() method.

		ReportBuilder r= new ReportBuilder(li, con);
		r.generateReports();
		
		
		
		
		
		
		

	}

}
