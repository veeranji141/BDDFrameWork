package org.automation.stepdefinition;

import org.automation.base.DriverInstance;


import io.cucumber.java.en.*;

public class StepDefinition {

	@Given("User launch the browser and open the register page")
	public void user_launch_the_browser_and_open_the_register_page() {
		
		DriverInstance.startDriverInstance();	
	}
	@Given("user enters the First name and last name")
	public void user_enters_the_first_name_and_last_name() {
		System.out.println("Enter the first name");
	    
	}
	@Given("user enters password in password and confirm password fields")
	public void user_enters_password_in_password_and_confirm_password_fields() {
		
	}
	@Given("user enters the email into email field")
	public void user_enters_the_email_into_email_field() {

	}
	@When("the user clicks on create button")
	public void the_user_clicks_on_create_button() {
	   
	}
	@Then("mail account is created")
	public void mail_account_is_created() {
	    
	}

}
