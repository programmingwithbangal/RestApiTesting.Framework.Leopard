package tests;

import io.restassured.response.Response;
import models.PostModel;
import org.junit.Test;
import constants.PostConstants;
import constants.RequestType;
import constants.StatusCodeConstants;

public class PatchPosts extends BaseTests 
{
	@Test
	public void PatchPostsTest() 
	{
		PostModel postModel = new PostModel(PostConstants.BodyPatch); 
		String postModelAsString = data.ConvertModelToJSON(postModel); 
				
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Patch, "/1", postModelAsString);
		
		AssertStatusCode(response, StatusCodeConstants.Ok);												
												
		PostModel expectedPostModel = new PostModel(0, 0, null, PostConstants.BodyPatch); 
		AssertContent(expectedPostModel, response);
	}	
}