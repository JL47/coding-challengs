package com.revature;

//mport org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.regex.*;

//@SpringBootApplication
public class PinValidationApplication {
	
	public static boolean validate(String pin) {
		if(Pattern.matches("[0-9]{6}", pin) || Pattern.matches("[0-9]{4}",pin)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(PinValidationApplication.class, args);
		String s1 = "121317";
		String s2 = "1234";
		String s3 = "45135";
		String s4 = "89abc1";
		String s5 = "900876";
		String s6 = " 4983";
		
		System.out.println("s1 is " + validate(s1));
		System.out.println("s2 is " + validate(s2));
		System.out.println("s3 is " + validate(s3));
		System.out.println("s4 is " + validate(s4));
		System.out.println("s5 is " + validate(s5));
		System.out.println("s6 is " + validate(s6));



		
		
		
		
	}

}
