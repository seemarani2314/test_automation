package stepDefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	@Given("User is on NetBanking login page")
	public void user_is_on_net_banking_login_page() {
		System.out.println("User landed on netbanking page");
	}

	@When("User login into the application")
	public void user_login_into_the_application() {
		System.out.println("User login into the application");
	}
	
	@When("^User login into the application with (.+) and password (.+)$")
	public void user_login_into_the_application_with_and_password(String username, String password) {
		System.out.println("username is = "+username+" and password = "+password);
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is diplayed to the user");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Credit card details are displayed to the user");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on practice landing page");
	}
	
	//step definition file
	@When("User Signup into the application")
	public void user_signup_into_the_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
}