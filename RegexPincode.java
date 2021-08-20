package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexPincode {


	public static boolean isValidPinCode(String pinCode)
	{

		
		String regex
			= "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

		
		Pattern p = Pattern.compile(regex);
		
		if (pinCode == null) {
			return false;
		}


		Matcher m = p.matcher(pinCode);


		return m.matches();
	}


	public static void main(String args[])
	{

		// Test Case 1
		String num1 = "132103";
		System.out.println(
			num1 + ": "
			+ isValidPinCode(num1));

		// Test Case 2
		String num2 = "201 305";
		System.out.println(
			num2 + ": "
			+ isValidPinCode(num2));

		// Test Case 3
		String num3 = "014205";
		System.out.println(
			num3 + ": "
			+ isValidPinCode(num3));

		// Test Case 4
		String num4 = "1473598";
		System.out.println(
			num4 + ": "
			+ isValidPinCode(num4));
	}
}
