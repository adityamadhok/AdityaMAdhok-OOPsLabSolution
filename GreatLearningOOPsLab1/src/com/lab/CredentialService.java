package com.lab;

import java.util.Scanner;

/*Create a separate CredentialService which will have generatePassword,
generateEmailAddress, & showCredentials method.*/


public class CredentialService {
	
	String email="";
	String pass="";
	String department="";
	int input;
	
	public String generateEmailAddress(String fn,String ln) {

		System.out.println("-----------------------------------------------");
		System.out.println("Please enter your department from the following");
		System.out.println("1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resources\n"
				+ "4. Legal");
		Scanner s=new Scanner(System.in);
		input=s.nextInt();
		//System.out.println(input);
		
		switch(input) {
		case 1:department="tech";break;
			
		case 2:
			department="admin";
			break;
			
		case 3:
			department="hr";
			break;
			
		case 4:
			department="lgl";
			break;
			
			default:
				throw new IllegalArgumentException("wrong input !"+input);

		}
			email=email+fn.toLowerCase()+ln.toLowerCase()+"@"+department+"."+"company.com";
		return email;
		
	
	}
	public String generatePassword() {
		
		//alternate algorithm for a password generator too long maybe still works!
		/*String pass="";
    	char smallAlpha,sa2,bigAlpha,ba2,specialChar,sc2,num,num2;
    	
    	char[] Array;
    	Array = new char[19];
    	Array[0]='#';
    	Array[1]='!';
    	Array[2]='@';
    	Array[3]='$';
    	Array[4]='%';
    	Array[5]='^';
    	Array[6]='&';
    	Array[7]='*';
    	Array[8]='(';
    	Array[9]=')';
    	Array[10]='{';
    	Array[11]='}';
    	Array[12]='[';
    	Array[13]=']';
    	Array[14]=':';
    	Array[15]='>';
    	Array[16]='<';
    	Array[17]='?';
    	Array[18]='|';
    
 
    	int h,h1;
    	int t,t1;
    	t=(int)(Math.random()*(19-0)+0);
    	t1=(int)(Math.random()*(19-0)+0);
    	
    	
    	h=(int)(Math.random()*(57-48)+48);
    	h1=(int)(Math.random()*(57-48)+48);
    	specialChar=Array[t];
    	sc2=Array[t1];
    	num=(char)h;
    	num2=(char)h1;
    	int j,j2,k,k2;
    	j=(int)(Math.random()*(90-65)+65);
    	j2=(int)(Math.random()*(90-65)+65);
    	k=(int)(Math.random()*(122-97)+97);
    	k2=(int)(Math.random()*(122-97)+97);
    	smallAlpha=(char)k;
    	sa2=(char)k2;
    	ba2=(char)j2;
    	bigAlpha=(char)j;
    	
    	
    	pass=pass+bigAlpha+ba2+smallAlpha+sa2+specialChar+sc2+num+num2;
    	
    	*/
		byte v;
		char c;
        StringBuilder str= new StringBuilder();
        for (int i=0;i<8;i++) {
        	v=(byte)(Math.random()*(126-33)+33);
        	c=(char)v;
        	str.append(c);
        }
        pass=str.toString();
		
		return pass;
		}
	public void showCredentials(String F,String L,String eMail,String Pass){
		
		System.out.println("--------------------------------------------");
		System.out.println("Hello !  "+F+"  your generated credentials are as follows ");
		System.out.println("Email    ---->  "+eMail);
		System.out.println("Password ---->  "+Pass);
		
					
		}
				
		
	}
	
	


