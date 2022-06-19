package com.lab;

/*Use parameterized constructor of class Employee, 
 to pass firstName, lastName
 */

class Employee {
	 
	
	private String firstName;
	private String lastName;
	
	Employee(String firstName,String lastName){
		//this.firstName=firstName;
		//this.lastName=lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	

}
