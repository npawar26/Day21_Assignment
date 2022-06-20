package com.bridgelabz.Day19_Assignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc4_ValidateMobileNumber {

	public void getValidMobileNumber(String mNumber) {
		Pattern p= Pattern.compile("^(91-){1}[6-9][0-9]{9}$");
		Matcher m=p.matcher(mNumber);
		if(m.matches()){
			System.out.println("Valid Mobile number");
		}
		else {
			System.out.println("InValid Mobile number");
		}
	}

	public static void main(String[] args) {
		Uc4_ValidateMobileNumber uc4_ValidateMobileNumber=new Uc4_ValidateMobileNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile number");
		String mNumber=sc.next();
		sc.close();
		uc4_ValidateMobileNumber.getValidMobileNumber(mNumber);
	}
}
