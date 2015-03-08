package com.rshepard.incident_logger;

/**
 * @author Richard Shepard
 * @Mar 8, 2015
 */
public enum InjuryLocation {

	ARM("arm"),
	ABDOMEN("abdomen"),
	HEAD("head"),
	LEG("leg");
	
	private String location;
	
	InjuryLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return location;
	}
	
}
