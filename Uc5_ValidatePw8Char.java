package com.bridgelabz.Day19_Assignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc5_ValidatePw8Char {

	public void getValidPassword(String password) {
		Pattern p= Pattern.compile("[a-zA-Z0-9~!@#$]{8,}");
		Matcher m=p.matcher(password);
		if(m.matches()){
			System.out.println("Valid Password");
		}
		else {
			System.out.println("InValid Password-Password should contain minimum 8 characters");
		}
	}
	public static void main(String[] args) {
		Uc5_ValidatePw8Char uc5_ValidatePw8Char =new Uc5_ValidatePw8Char ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password");
		String password=sc.next();
		sc.close();
		uc5_ValidatePw8Char.getValidPassword(password);
	}
}

