/**
 * @author Richard Shepard
 * @version Mar 8, 2015
 */
package com.rshepard.incident_logger;

import java.awt.Container;

/**
 * @author Richard Shepard
 * @Mar 8, 2015
 */
public class IncidentInterface {
	
	private InjuryLog log;
	private LogParser parser;
	private ReportGenerator report;
	boolean continueFlag = true;
	
	public IncidentInterface() {
		
		log = new InjuryLog(true);     //Set to false to remove test data
		int choice;
		
		
		while(continueFlag)	{
			
			System.out.println("Nubs Nob Incident Interface");
			System.out.println("=================================");
			System.out.println("1.) add new patient");
			System.out.println("2.) calculate average severity for all");
			System.out.println("3.) calculate average severity by age group");
			System.out.println("4.) find multiple incidents");
			System.out.println("5.) generate report for all");
			System.out.println("6.) generate report for severity 8+");
			System.out.println("0.) EXIT");
			System.out.println();
			System.out.println("Enter choice: ");
			choice = TextIO.getlnInt();
			processInput(choice);
		
		}
		System.out.println("Thank you for using Nubs Nob Incident Interface");
	}

	
	private void processInput(int choice) {
		parser = new LogParser(log.getLog());
		report = new ReportGenerator(log.getLog());
		switch(choice) {
			case 0:
				continueFlag = false;
				break;
			case 1:
				log.addIncident(new Person());
				break;
			case 2:
				if(!log.isEmpty()) {
					System.out.println(parser.calculateAverage(false));
				} else {
					System.out.println("Must add patients first.");
				}
				break;
			case 3:
				if(!log.isEmpty()) {
					System.out.println(parser.calculateAverage(true));
				} else {
					System.out.println("Must add patients first.");
				}
				break;
			case 4:
				if(!log.isEmpty()) {
					System.out.println(parser.hasDuplicate());
				} else {
					System.out.println("Must add patients first.");
				}
				break;
			case 5:
				if(!log.isEmpty()) {
					System.out.println(report.generate());
				} else {
					System.out.println("Must add patients first.");
				}
				break;
			case 6:
				if(!log.isEmpty()) {
					System.out.println(report.generate(8));
				} else {
					System.out.println("Must add patients first.");
				}
				break;		
		}
	}
}
