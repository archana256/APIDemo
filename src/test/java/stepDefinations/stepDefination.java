package stepDefinations;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.UtilData;

public class stepDefination extends UtilData {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	JsonPath js ;
	static String campaignId;
	TestDataBuild data = new TestDataBuild();

	@Given("Create campaign payload with {string} {string}  {string}  {string}")
	public void create_campaign_payload_with(String name, String start_date, String end_date, String after_expiry)
			throws Exception {

		res = given().spec(requestSpecification())
				.body(data.createCampaignPayload(name, start_date, end_date, after_expiry));

	}

	@When("user calls {string} API using {string} Http method")
	public void user_calls_API_using_Http_method(String resource, String method) {
		// constructor will be called here with value of resource
		APIResources resourceName = APIResources.valueOf(resource);
		// will actually get the resource value
		resourceName.getResource();
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType("application/json").build();
		if (method.equalsIgnoreCase("POST")) {
			response = res.when().post(resourceName.getResource());
		}
		else if (method.equalsIgnoreCase("GET"))
		{
			response = res.when().get(resourceName.getResource());

		}

		else if (method.equalsIgnoreCase("PUT")) {
			response = res.when().get(resourceName.getResource());

		}
	}

	@Then("API Call got success with status code {int}")
	public void api_Call_got_success_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(), 200);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String ExpectedValue) {
		// Write code here that turns the phrase above into concrete actions

		assertEquals(getJsonPath(response,keyValue), ExpectedValue);
		

	}
	
	@Then("verify campaign id created maps to {string} using {string}")
	public void verify_campaign_id_created_maps_to_using(String expectedName, String resource) throws Exception {
	    
		
		campaignId = getJsonPath(response,"id");
		res = given().spec(requestSpecification()).queryParam("page", "1").queryParam("records", "10")
				.queryParams("search", campaignId).queryParams("admin_id","9934");
		user_calls_API_using_Http_method(resource,"GET");
		String actualName = getJsonPath(response,"rows[0].Name");
		System.out.println(actualName);
		assertEquals(actualName,expectedName);
	}

}
