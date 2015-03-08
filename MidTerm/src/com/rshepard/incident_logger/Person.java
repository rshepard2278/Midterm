package com.rshepard.incident_logger;

/**
 * @author Richard Shepard
 * @version Mar 8, 2015
 */


public class Person {
	
	private static int idPool = 10000;
	
	private String firstName;
	private String lastName;
	private String address;
	private Injury injury;
	private InjuryLocation location;
	private int age;
	private int id;
	private int severity;
	
	public Person() {
		this.id = idPool;
		idPool++;
		getData();
	}
	
	public Person(String firstName, String lastName, int age, String address, String injury, 
			String location, int severity) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.injury = Injury.valueOf(injury.toUpperCase());
		this.location = InjuryLocation.valueOf(location.toUpperCase());
		this.age = age;
		this.severity = severity;
		this.id = idPool;
		idPool++;
	}
	
	private void getData() {
		System.out.println("Please enter patients first name: ");
		firstName = TextIO.getlnWord();
		
		System.out.println("Please enter patients last name: ");
		lastName = TextIO.getlnWord();
		
		System.out.println("Please enter patients age: ");
		age = TextIO.getlnInt();
		
		System.out.println("Please enter patients address: ");
		address = TextIO.getln();
		
		System.out.println("Please enter patients injury: ");
		String injuryString;
		injuryString = TextIO.getlnWord().toUpperCase();
		injury = Injury.valueOf(injuryString);

		System.out.println("Please enter patients injury location: ");
		String locationString;
		locationString = TextIO.getlnWord().toUpperCase();
		location = InjuryLocation.valueOf(locationString);
		
		System.out.println("Please enter injury serverity: ");
		severity = TextIO.getlnInt();
		
	}
	
	public String toString() {
		String line1 = "         Patient # " + id;
		String line2 = "=================================";
		String line3 = "Name:           " + firstName + " " + lastName;
		String line4 = "Address:        " + address;
		String line5 = "Age :           " + age;
		String line6 = "Injury:         " + injury.toString();
		String line7 = "Location:       " + location.toString();
		String line8 = "Severity:       " + severity;
		String multilineString = String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n",
				line1, line2, line3, line4, line5, line6, line7, line8);
		return multilineString;
	}
	
	
	
	
	/**
	 * @return the idPool
	 */
	public static int getIdPool() {
		return idPool;
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	
	/**
	 * @return the injury
	 */
	public Injury getInjury() {
		return injury;
	}
	
	
	/**
	 * @return the location
	 */
	public InjuryLocation getLocation() {
		return location;
	}
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * @return the severity
	 */
	public int getSeverity() {
		return severity;
	}
	
	public String getFullName() {
		return (firstName + " " + lastName);
	}
	
}
