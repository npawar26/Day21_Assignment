package com.bridgelabz.Day19_Assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc3_ValidEMail {
	
	public void getValidEMail(String eMail) {
		Pattern p= Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(eMail);
		if(m.matches()){
			System.out.println("Valid EMail address");
		}
		else {
			System.out.println("InValid EMail address");
		}
	}
	
		public static void main(String[] args) {		
		Uc3_ValidEMail uc3_ValidEMail=new Uc3_ValidEMail();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EMail Address");
		String eMail=sc.next();
		sc.close();	
		uc3_ValidEMail.getValidEMail(eMail);
	
	}

}
