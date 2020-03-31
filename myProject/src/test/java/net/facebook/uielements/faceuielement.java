package net.facebook.uielements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class faceuielement extends PageObject {

	@FindBy(id="email")
	public WebElement fbusername;

	@FindBy(id="pass")
	public WebElement fbpassword;

	@FindBy(id="u_0_b")
	public WebElement loginbutton;
	
	@FindBy(id="u_0_c")
	public WebElement HOME;
}


