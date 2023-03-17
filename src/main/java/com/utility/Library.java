package com.utility;

import org.openqa.selenium.WebElement;

public class Library {
	
	
	public static void custome_sendkyes(WebElement element,String valus) {
		try {
		element.sendKeys(valus);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
