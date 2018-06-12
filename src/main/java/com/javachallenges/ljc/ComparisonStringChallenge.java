package com.javachallenges.ljc;

/**
 * A - 1357 B - 2357 C - 2368 D - 2367 What is the answer?
 */
@SuppressWarnings(value = "all")
public class ComparisonStringChallenge {
	public static void main(String... doYourBest) {
		String result = "";
		result += " powerfulCode ".trim() == "powerfulCode" 
				? "1" : "2";
		
		result += "flexibleCode" == "flexibleCode"
				? "3" : "4";
		
		result += new String("doYourBest") == new String("doYourBest")
				? "5" : "6";

		result += new String("noBugsProject").equals(new String("noBugsProject"))
				? "7" : "8";


		System.out.println(result);
	}
}


