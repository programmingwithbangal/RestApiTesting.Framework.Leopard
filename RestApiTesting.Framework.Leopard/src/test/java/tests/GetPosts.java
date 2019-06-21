package tests;

import io.restassured.response.Response;
import models.PostModel;
import org.junit.Test;
import constants.PostConstants;
import constants.RequestType;
import constants.StatusCodeConstants;

public class GetPosts extends BaseTests 
{
	@Test
	public void GetPostsTest() 
	{
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Get, "/1", null);
		
		AssertStatusCode(response, StatusCodeConstants.Ok);												
												
		PostModel expectedPostModel = new PostModel(1, 1, PostConstants.Title1, PostConstants.Body1); 				
		AssertContent(expectedPostModel, response);
	}
}