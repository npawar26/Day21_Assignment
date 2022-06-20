package com.bridgelabz.Day19_Assignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc2_ValidLastName {

	public void getValidLastName(String lastName) {
    	Pattern p= Pattern.compile("(^[A-Z]{1}[a-z]{2}$)");
		Matcher m=p.matcher(lastName);
		if(m.matches()){
			System.out.println("Valid LastName");
		}
		else {
			System.out.println("InValid LastName");
		}
	}

	public static void main(String[] args) {
        Uc2_ValidLastName uc2_ValidLastName=new Uc2_ValidLastName();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter LastName");
		String lastName=sc.next();
		sc.close();
		uc2_ValidLastName.getValidLastName(lastName);
	}
}


