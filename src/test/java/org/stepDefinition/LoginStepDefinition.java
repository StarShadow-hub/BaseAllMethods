package org.stepDefinition;

import org.utilities.BaseInvoke;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseInvoke {


	@Given("Enter  {string} and {string}")
	public void enter_and(String browser, String url) {
	    launch(browser, url);
	}

	@When("Enter user {string} and {string}")
	public void enter_user_and(String username, String password) {
		sendValues(ValueId("email"), username);
		sendValues(ValueId("pass"), password);
	}
	@When("Click on Login button")
	public void click_on_login_button() {
		valueName("login").click();
	}
	@Then("Validate the result")
	public void validate_the_result() {
	System.out.println("unsuccessfull");
		
	}



}
