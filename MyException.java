package com.bridgelabz.exception;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyException  {

	public boolean getValidDetails(String regex,String value) throws CustomException  {	
		Pattern p= Pattern.compile(regex);
		Matcher m=p.matcher(value);
		if(m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}



	public static void main(String[] args) throws com.bridgelabz.exception.CustomException {

		MyException exception=new MyException();
		Scanner sc=new Scanner(System.in);	

		while(true){
			System.out.println("Enter firstname-Starts with cap and minimum 3 char");
			String firstName=sc.next();
			try {
				boolean result = exception.getValidDetails("(^[A-Z]{1}[a-z]{2}$)",firstName);
				if(result==(true)){
					System.out.println("Valid Value");
					break;
				}else{
					throw new CustomException(firstName +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");
			}
		}
		while(true){
			System.out.println("Enter Lastname-Starts with cap and minimum 3 char");
			String lastName=sc.next();
			try {
				boolean result = exception.getValidDetails("(^[A-Z]{1}[a-z]{2}$)",lastName);
				if(result==(true)){
					System.out.println("Valid Value");
					break;
				}else{
					throw new CustomException(lastName +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");
			}
		}

		while(true){
			System.out.println("Enter eMail");
			String eMail=sc.next();
			try {
				boolean result = exception.getValidDetails("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$",eMail);
				if(result==(true)){
					System.out.println("Valid Value");
					break;
				}else{
					throw new CustomException(eMail +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");

			}
		}

		while(true){
			System.out.println("Enter Mobile Number-Country code followed by - and 10 digit number");
			String mNumber=sc.next();
			try {
				boolean result = exception.getValidDetails("^(91-){1}[6-9][0-9]{9}$",mNumber);
				if(result==(true)){
					System.out.println("Valid Value");
					break;
				}else{
					throw new CustomException(mNumber +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");
			}
		}

		while(true){
			System.out.println("Enter Password with Minimun 8 Character");
			String password=sc.next();
			try {
				boolean result = exception.getValidDetails("[a-zA-Z0-9~!@#$]{8,}",password);
				if(result==(true)){
					System.out.println("Valid Value");
					break;
				}else{
					throw new CustomException(password +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");
			}
		}

		while(true){
			System.out.println("Enter Password with At Least 1 UpperCase");
			String password=sc.next();
			try {
				boolean result = exception.getValidDetails("(?=.*[A-Z])[a-zA-Z0-9~!@#$]{8,}",password);
				if(result==(true)){
					System.out.println("Valid Value");
					break;
				}else{
					throw new CustomException(password +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");
			}
		}
		while(true){
			System.out.println("Enter Password with At Least 1 Number");
			String password=sc.next();
			try {
				boolean result = exception.getValidDetails("(?=.*[0-9]){8,}.*",password);
				if(result==(true)){
					System.out.println("Valid Value");
					break;
				}else{
					throw new CustomException(password +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");
			}
		}
		while(true){
			System.out.println("Enter Password with Exact 1 Special Character");
			String password=sc.next();
			try {
				boolean result = exception.getValidDetails("([0-9a-zA-Z]*)([~!@#$]{1})([0-9a-zA-Z]*)",password);
				if(result==(true)){
					System.out.println("Valid Value");
					System.out.println("Thank You!!!");
					break;
				}else{
					throw new CustomException(password +" : Not Valid - Try again");
				}
			}catch(CustomException e){
				System.out.println("[" + e + "]");
			}

		}
		sc.close();
	}

}



