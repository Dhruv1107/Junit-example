package com.dhruv.junit;

public class RemoveAFromFirst2Chars {

	public String remove(String string) {
		int stringlength = string.length();
		if (stringlength < 1)
			return string;
		else if (stringlength == 1) {
			if ('A' == string.charAt(0)) {
				return "";
			}
			return string;
		} else {
			if ('A' == string.charAt(0) && 'A' == string.charAt(1))
				return string.substring(2);
			else if ('A' == string.charAt(0) && 'A' != string.charAt(1))
				return string.substring(1);
			else if ('A' != string.charAt(0) && 'A' == string.charAt(1))
				return string.substring(0, 1) + string.substring(2);
			else
				return string;
		}
	}

}
