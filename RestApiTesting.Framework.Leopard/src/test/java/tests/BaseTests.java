package tests;

import java.util.Map;
import org.testng.Assert;
import helpers.JsonProcessing;
import helpers.RestAssuredHelper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseTests 
{
	JsonProcessing data;
	
	RestAssuredHelper restAssuredHelper;
	
	public BaseTests()
	{
		SetBaseUri();
		data = new JsonProcessing();
		restAssuredHelper = new RestAssuredHelper();
	}
	
	public void SetBaseUri() 
	{
		RestAssured.baseURI = "http://jsonplaceholder.typicode.com/posts";
	}
	
	public void AssertStatusCode(Response response, int expectedStatusCode) 
	{
		int actualStatusCode = response.getStatusCode();
		System.out.println("Response Status Code: " + actualStatusCode);
		Assert.assertEquals(actualStatusCode, expectedStatusCode);
	}
	
	public void AssertContent(Object postModel, Response response) 
	{
		Map<?, ?> actualResponseBody = response.jsonPath().get();
		System.out.println("Actual Response Content:" + actualResponseBody);
		
		Map<?, ?> expectedResponseBody = data.ConvertModelToMap(postModel);
		System.out.println("Expected Response Content:" + expectedResponseBody);

		Assert.assertEquals(actualResponseBody, expectedResponseBody);
	}	
}
