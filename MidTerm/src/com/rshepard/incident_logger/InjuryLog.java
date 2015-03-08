package com.rshepard.incident_logger;

import java.util.ArrayList;

/**
 * @author Richard Shepard
 * @Mar 8, 2015
 */
public class InjuryLog {
	
	private ArrayList<Person> log;
	

	public InjuryLog(boolean loadTestData) {
		log = new ArrayList<>();
		if(loadTestData) {
			loadTestData();
		}
		
	}
	
	public void loadTestData() {
		System.out.println("Loading test data.......");
		log.add(new Person("Rick", "Shepard", 37, "123 fake st.", "Break", "leg", 10));
		log.add(new Person("Megan", "Shepard", 18, "321 State st.", "Burn", "arm", 6));
		log.add(new Person("James", "Kirk", 8, "1701 Enterprise dr.", "sts", "Abdomen", 4));
		log.add(new Person("Don", "Draper", 58, "1806 SCDP st.", "stb", "head", 9));
		log.add(new Person("Jax", "Teller", 32, "625 Charming st.", "Sprain", "leg", 5));
		log.add(new Person("Chico", "Shepard", 3, "123 fake st.", "Break", "leg", 3));
		log.add(new Person("Veda", "Shepard", 12, "123 fake st.", "Break", "leg", 1));
		log.add(new Person("Don", "Draper", 58, "1806 SCDP st.", "Break", "arm", 9));
		System.out.println("Test data loaded.");
	}
	
	public void addIncident(Person p){
		log.add(p);
		System.out.println("Patient: " + p.getFullName() + " added.");
	}
	


	/**
	 * @return the log
	 */
	public ArrayList<Person> getLog() {
		return log;
	}

	/**
	 * @return
	 */
	public boolean isEmpty() {
		boolean isEmpty;
		if(log.isEmpty()) {
			isEmpty = true;
		} else {
			isEmpty = false;
		}
		return isEmpty;
	}

}
