	package com.bridgelabz.Day19_Assignment;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class Uc7_ValidatePw1Number  {

		public void getValidPassword(String password) {
			Pattern p= Pattern.compile("(?=.*[0-9]){8,}.*");
			Matcher m=p.matcher(password);
			if(m.matches()){
				System.out.println("Valid Password");
			}
			else {
				System.out.println("InValid Password-Password should have at least 1 number");
			}
		}
		public static void main(String[] args) {
			Uc7_ValidatePw1Number uc7_ValidatePw1Number =new Uc7_ValidatePw1Number ();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Password");
			String password=sc.next();
			sc.close();
			uc7_ValidatePw1Number.getValidPassword(password);
		}
	}




