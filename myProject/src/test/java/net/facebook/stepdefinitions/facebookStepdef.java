package net.facebook.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.facebook.steps.facebookSteps;
import net.thucydides.core.annotations.Steps;

public class facebookStepdef {
	
	@Steps
	public facebookSteps fbsteppage;

@Given("^open facebook application$")
public void open_facebook_application() {
	   fbsteppage.navigateTofacebookloginpage();
}

@When("^enter facebook username and password$")
public void enter_facebook_username_and_password() {
	   fbsteppage.enterfacebookUsername();
	   fbsteppage.enterfacebookPassword();
}

@When("^click login button on facebook$")
public void click_login_button_on_facebook() {
	  fbsteppage.clickfbloginbutton();
}

@Then("^user should be logged in successfully to facebook$")
public void user_should_be_logged_in_successfully_to_facebook() {
	fbsteppage.verifyHome();
}

@Then("^user should Logout successfully$")
public void user_should_Logout_successfully() {
    
}



}
