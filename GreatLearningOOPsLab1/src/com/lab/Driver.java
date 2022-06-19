package com.lab;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		
		
		
		String fName,lName;
		Scanner fN=new Scanner(System.in);
		Scanner lN=new Scanner(System.in);
		System.out.println("Please enter your first name :");
		fName=fN.next();
		System.out.println("please enter your last name :");
		lName=lN.next();
		String P,E,b;
   Employee emp=new Employee(fName,lName);
   emp.setFirstName(fName);
   emp.setLastName(lName);
   CredentialService obj=new CredentialService();
   
   
   b=obj.generateEmailAddress(emp.getFirstName(),emp.getLastName());
   obj.showCredentials(emp.getFirstName(),emp.getLastName(), b, obj.generatePassword());
        	}

}
