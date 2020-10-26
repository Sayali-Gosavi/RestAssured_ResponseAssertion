package StepDefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ResponseAssertion {
	
	Response response;
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    RestAssured.baseURI="https://api.ratesapi.io";
	}

	@Test
	@When("posted with correct information")
	public void posted_with_correct_information() {
		response = RestAssured.get("/api/latest");
	}

	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		int StatusCode = response.getStatusCode();
		System.out.println("Response Code : "+StatusCode);
		Assert.assertTrue(StatusCode==200);
		Assert.assertEquals(StatusCode, 200);
		Assert.assertNotNull(response);
		response.prettyPrint();
		
	}
}
