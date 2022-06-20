	package com.bridgelabz.Day19_Assignment;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class Uc6_ValidatePw1UpperCase  {

		public void getValidPassword(String password) {
			Pattern p= Pattern.compile("(?=.*[A-Z])[a-zA-Z0-9~!@#$]{8,}");
			Matcher m=p.matcher(password);
			if(m.matches()){
				System.out.println("Valid Password");
			}
			else {
				System.out.println("InValid Password-Password should contain at least 1 Upper Case");
			}
		}
		public static void main(String[] args) {
			Uc6_ValidatePw1UpperCase uc6_ValidatePw1UpperCase =new Uc6_ValidatePw1UpperCase ();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Password");
			String password=sc.next();
			sc.close();
			uc6_ValidatePw1UpperCase.getValidPassword(password);
		}
	}


