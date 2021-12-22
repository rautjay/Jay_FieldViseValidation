package com.project;

import java.util.regex.Pattern;

public class validations {
	
	
	public boolean personPanNum(String regex,String value ) {
		
	  return Pattern.compile(regex).matcher(value).matches();
		
	}

}
