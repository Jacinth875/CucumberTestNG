package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TestPage;
import utils.TestContextSetup;

public class TestPageStepDefinition {
	public WebDriver driver;
	 TestPage testPage;
	 TestContextSetup testContextSetup;
	
	public TestPageStepDefinition(TestContextSetup testContextSetup) {

		this.testContextSetup=testContextSetup;
		this.testPage =testContextSetup.pageObjectManager.getTestPage();
	}
	

	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		System.out.println("homepage open");
	}
	@When("I enter the text to search")
	public void i_enter_the_text_to_search() {
		testPage.typeText();
		
	}
	@When("I do some workaround")
	public void workAround() throws InterruptedException {
		testPage.buttonClick();
		Thread.sleep(3000);
		
	}
	@Then("I should see the results")
	public void i_should_see_the_results() {
		testPage.proceedCheckout();
		System.out.println("done");
	}

}
