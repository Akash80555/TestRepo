package com.demotest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Your order no 12 ready for purchange and value is $32.32";
		
		  Pattern pattern = Pattern.compile("\\$(\\d+\\.\\d+)");
	        Matcher matcher = pattern.matcher(str);

	        if (matcher.find()) {
	            String price = matcher.group(1);
	            System.out.println("Price: $" + price);
	        } else {
	            System.out.println("Price not found.");
	        }
	        
	        //second approach:
	       int str1= str.indexOf('$');
	      String str2= str.substring(str1+1);
	      System.out.println(str2);
	    }
	
	}
