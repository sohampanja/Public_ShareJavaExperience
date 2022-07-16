package com.test.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class RegExPatternMatcher 
{
    public static void main( String[] args )
    { 
    	//String  ToValidate="+919051232521";
    //	String patternExp="^\\+(91)[6-9][0-9]{9}$";  //  Mobile Expression
    	
    	
    	String  ToValidate="bqppp1280f";
        	String patternExp="^[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}$";
    	Pattern ptr = Pattern.compile(patternExp);
    	Matcher match=ptr.matcher(ToValidate);
    	
    	Boolean status = match.matches();
    	if(status) {
    	
    		System.out.println("Valid / Matches");
    	}
    	
    	else {
    		System.out.println("InValid String ");
    	}
    	
    }
}
