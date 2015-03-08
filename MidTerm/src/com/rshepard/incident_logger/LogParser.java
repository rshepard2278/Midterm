package com.rshepard.incident_logger;

import java.util.ArrayList;

/**
 * @author Richard Shepard
 * @Mar 8, 2015
 */
public class LogParser {

	private ArrayList<Person> log;

	public LogParser(ArrayList<Person> log) {
		this.log = log;
	}


	public String calculateAverage(boolean byAgeGroup) {
		String output = "";
		if(byAgeGroup) {
			output = "Average severity by age";
			output += "\n=================================";
			for (int i = 0; i < 6; i++) {
				switch (i) {
				case 0:
					output += "\n1-5:      " + getAverage(0, 6);
					break;					
				case 1:
					output += "\n6-10:     " + getAverage(5, 11);
					break;						
				case 2:
					output += "\n11-15:    " + getAverage(10, 16);
					break;	
				case 3:
					output += "\n16-20:    " + getAverage(15, 21);
					break;	
				case 4:
					output += "\n21-50:    " + getAverage(20, 51);
					break;	
				case 5:				
					output += "\n50+:      " + getAverage(50, 110);
					break;	
				}
			}
		} else {
			output = "The average severity for everyone is: " + getAverage(0, 110);
		}
		
		return output;
	}

	private double getAverage(int low, int high) {
		double total = 0;
		double count = 0;
		for(Person p : log) {
			if(p.getAge() < high && p.getAge() > low) {
				total += p.getSeverity();
				count++;
			}
		}
		total = (double)total / (double)count;
		return total;
	}
	
	public String hasDuplicate() {
		String duplicate = "Patients with more than one incident:";
		int size = log.size();
		int count = 0;
		for(int i = 0; i < size; i++) {
			int id = log.get(i).getId();
			for(int j = i; j < size; j++) {
				count = 0;
				if(id == log.get(j).getId()) {
					count++;
				}
			}
			if(count > 0) {
				duplicate += "\n" + log.get(i).getFirstName() + " " + log.get(i).getLastName() 
						+ " # " + log.get(i).getId() + " with " + (count + 1) + " incidents";
			}			
		}
		return duplicate;
	}
}
