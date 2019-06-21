package tests;

import io.restassured.response.Response;
import models.PostModel;
import org.junit.Test;
import constants.PostConstants;
import constants.RequestType;
import constants.StatusCodeConstants;

public class CreatePosts extends BaseTests
{
	@Test
	public void CreatePostsTest() 
	{
		PostModel postModel = new PostModel(1, 101, PostConstants.TitleCreate, PostConstants.BodyCreate); 
		String postModelAsString = data.ConvertModelToJSON(postModel); 
				
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Post, "/", postModelAsString);
		
		AssertStatusCode(response, StatusCodeConstants.Created);												
		AssertContent(postModel, response);
	}
}