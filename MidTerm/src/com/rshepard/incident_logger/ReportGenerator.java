package com.rshepard.incident_logger;

import java.util.ArrayList;

/**
 * @author Richard Shepard
 * @Mar 8, 2015
 */
public class ReportGenerator {
	
	private ArrayList<Person> log;
	
	public ReportGenerator(ArrayList<Person> log) {
		this.log = log;
	}
	
	public String generate() {
		String report = "\n       Incident Report (ALL)";
		report += "\n****************************************\n";
		for(Person p : log) {
			report +="\n" +  p.toString() + "\n";
		}
		report += "**********End of Report************";
		return report;
	}

	public String generate(int severity) {
		String report = "\n   Incident Report by Severity " + severity +"+";
		report += "\n***************************************************\n";
		for(Person p : log) {
			if(p.getSeverity() >= severity) {
				report +="\n" +  p.toString() + "\n";
			}
		}
		report += "*****************End of Report****************";
		return report;
	}
	
}
