package com.bridgelabz.Day20_Assignment;
import static org.junit.Assert.*;
import org.junit.Test;

public class JunitTest {
	@Test
	public void givenFirstName_WhenChecked_ShouldGetValidate() {
		Junit junit = new Junit();
		boolean result=junit.getValidFirstname("(^[A-Z]{1}[a-z]{2}$)","Nik");
		assertEquals(true,result);
	}
	@Test
	public void givenFirstName_whenChecked_shouldNotGetValidate() {
		Junit junit = new Junit();
		boolean result=junit.getValidFirstname("(^[A-Z]{1}[a-z]{2}$)","Nikh");
		assertEquals(false,result);
	}

	@Test
	public void givenLastName_whenChecked_shouldGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidLastname("(^[A-Z]{1}[a-z]{2}$)","Paw");
		assertEquals(true,result);
	}
	@Test
	public void givenLastName_whenChecked_shouldNotGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidLastname("(^[A-Z]{1}[a-z]{2}$)","Pawa");
		assertEquals(false,result);
	}
	@Test
	public void givenEMail_whenChecked_shouldGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidEMail("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$","nik@gmail.com");
		assertEquals(true,result);
	}
	@Test
	public void givenEMail_whenChecked_shouldnotGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidEMail("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$","nik@gmail.comlijss");
		assertEquals(false,result);
	}
	@Test
	public void givenMobileNumber_whenChecked_shouldGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidMNumber("^(91-){1}[6-9][0-9]{9}$","91-9534445654");
		assertEquals(true,result);
	}	
	@Test
	public void givenMobileNumber_whenChecked_shouldnotGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidMNumber("^(91-){1}[6-9][0-9]{9}$","91-95344456542");
		assertEquals(false,result);
	}
	@Test
	public void givenPassword_whenCheckedForMinimun8Char_shouldGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidMNumber("[a-zA-Z0-9~!@#$]{8,}","12345678");
		assertEquals(true,result);
	}
	@Test
	public void givenPassword_whenCheckedForMinimun8Char_shouldnotGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidMNumber("[a-zA-Z0-9~!@#$]{8,}","1234567");
		assertEquals(false,result);
	}
	@Test
	public void givenPassword_whenCheckedForAtLeast1UpperCase_shouldGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidPwWithAtLeast1UpperCase("(?=.*[A-Z])[a-zA-Z0-9~!@#$]{8,}","A1234567");
		assertEquals(true,result);
	}

	@Test
	public void givenPassword_whenCheckedForAtLeast1UpperCase_shouldnotGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidPwWithAtLeast1UpperCase("(?=.*[A-Z])[a-zA-Z0-9~!@#$]{8,}","a1234567");
		assertEquals(false,result);
	}
	@Test
	public void givenPassword_whenCheckedForAtLeast1Num_shouldGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidPwWithAtLeast1Num("(?=.*[0-9]){8,}.*","9gagshdh");
		assertEquals(true,result);
	}
	@Test
	public void givenPassword_whenCheckedForAtLeast1Num_shouldnotGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidPwWithAtLeast1Num("(?=.*[0-9]){8,}.*","pgagshdh");
		assertEquals(false,result);
	}

	@Test
	public void givenPassword_whenCheckedForExact1SpecialChar_shouldGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidPwWithExact1SpecialChar("([0-9a-zA-Z]*)([~!@#$]{1})([0-9a-zA-Z]*)","p1234@anjI");
		assertEquals(true,result);
	}
	@Test
	public void givenPassword_whenCheckedForExact1SpecialChar_shouldnotGetValidate() {
		Junit junit=new Junit();
		boolean result=junit.getValidPwWithExact1SpecialChar("([0-9a-zA-Z]*)([~!@#$]{1})([0-9a-zA-Z]*)","p1234anjI");
		assertEquals(false,result);
	}
}


