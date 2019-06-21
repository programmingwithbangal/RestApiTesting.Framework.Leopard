package tests;

import io.restassured.response.Response;
import models.PostModel;
import org.junit.Test;
import constants.PostConstants;
import constants.RequestType;
import constants.StatusCodeConstants;

public class UpdatePosts extends BaseTests 
{
	@Test
	public void UpdatePostsTest() 
	{
		PostModel postModel = new PostModel(1, PostConstants.TitleUpdate, PostConstants.BodyUpdate); 
		String postModelAsString = data.ConvertModelToJSON(postModel); 
				
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Put, "/1", postModelAsString);
		
		AssertStatusCode(response, StatusCodeConstants.Ok);												
												
		PostModel expectedPostModel = new PostModel(1, 1, PostConstants.TitleUpdate, PostConstants.BodyUpdate); 
		AssertContent(expectedPostModel, response);
	}
}