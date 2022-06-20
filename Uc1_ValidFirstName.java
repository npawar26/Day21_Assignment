package com.bridgelabz.Day19_Assignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc1_ValidFirstName {

	public void getValidFirstName(String firstName) {	
		Pattern p= Pattern.compile("(^[A-Z]{1}[a-z]{2}$)");
		Matcher m=p.matcher(firstName);
		if(m.matches()){
			System.out.println("Valid firstname");
		}
		else {
			System.out.println("InValid firstname");
		}
	}

	public static void main(String[] args) {	
		Uc1_ValidFirstName uc1_ValidFirstName=new Uc1_ValidFirstName();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firstname");
		String firstName=sc.next();
		sc.close();
		uc1_ValidFirstName.getValidFirstName(firstName);
	}

}
