package com.bridgelabz.Day19_Assignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc8_ValidatePw1SpecialChar  {

	public void getValidPassword(String password) {
		Pattern p= Pattern.compile("([0-9a-zA-Z]*)([~!@#$]{1})([0-9a-zA-Z]*)");
		Matcher m=p.matcher(password);
		if(m.matches()){
			System.out.println("Valid Password");
		}
		else {
			System.out.println("InValid Password-Password should have exactly 1 Special Character");
		}
	}
	public static void main(String[] args) {
		Uc8_ValidatePw1SpecialChar uc8_ValidatePw1SpecialChar =new Uc8_ValidatePw1SpecialChar ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password");
		String password=sc.next();
		sc.close();
		uc8_ValidatePw1SpecialChar.getValidPassword(password);
	}
}




