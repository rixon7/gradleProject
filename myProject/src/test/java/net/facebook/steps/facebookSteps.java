package net.facebook.steps;

import net.facebook.config.EmsConfig;
import net.thucydides.core.annotations.Step;

public class facebookSteps extends EmsConfig {
	
	@Step
	public void navigateTofacebookloginpage()
	{
		facebookpage.openUrl(env.getProperty("fb.url"));
	}
			
	@Step
	public void enterfacebookUsername()
	{
		facebookpage.fbusername.clear();
		facebookpage.fbusername.sendKeys(env.getProperty("fb.username"));
	}
	
	@Step
	public void enterfacebookPassword()
	{	
		facebookpage.fbpassword.clear();
		facebookpage.fbpassword.sendKeys(env.getProperty("fb.password"));
	}

	@Step
	public void clickfbloginbutton()
	{
		facebookpage.loginbutton.click();
	}

	@Step
	public void verifyHome()
	{
		facebookpage.HOME.isDisplayed();
	}
}
