package Runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	public static void generateReport(String jsonfile) {
		File file = new File("target\\reports\\cucumberReport");
		Configuration config = new Configuration(file , "FbLogin");
		config.addClassifications("OS", "Window");
		config.addClassifications("browser", "chrome");
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder build = new ReportBuilder(jsonfiles, config);
		build.generateReports();
		

}}
