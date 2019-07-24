package tests;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Map;
import io.restassured.response.Response;
import org.junit.Test;
import constants.RequestType;
import constants.StatusCodeConstants;

public class DeletePosts extends BaseTests
{
	@Test
	public void DeletePostsTest() 
	{
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Delete, "/1", null);
		
		AssertStatusCode(response, StatusCodeConstants.Ok);												
												
		Map<?, ?> actualResponseBody = response.jsonPath().get();
		System.out.println("Actual Response Content:" + actualResponseBody);
		
		Map<?, ?> expectedResponseBody = Collections.emptyMap();
		System.out.println("Expected Response Content:" + expectedResponseBody);
		
		assertEquals(expectedResponseBody, actualResponseBody);
	}	
}