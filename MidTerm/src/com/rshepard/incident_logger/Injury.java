package com.rshepard.incident_logger;

/**
 * @author Richard Shepard
 * @Mar 8, 2015
 */
public enum Injury {
	
	BREAK("break"),
	SPRAIN("sprain"),
	BURN("burn"),
	STS("soft tissue slash"),
	STB("soft tissue blunt");
	
	private String injury;
	
	Injury(String injury) {
		this.injury = injury;
	}
	
	public String toString() {
		return this.injury;
	}

}
