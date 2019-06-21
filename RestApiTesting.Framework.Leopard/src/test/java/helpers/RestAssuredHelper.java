package helpers;

import constants.RequestType;
import constants.RestAssuredConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredHelper {
	
	public Response SpecifyAndSendRequest(RequestType requestType, String url, String postModelAsString) {

		RequestSpecification request = RestAssured.given();				
		request.header(RestAssuredConstants.ContentType, RestAssuredConstants.ApplicationJson);
		
		if(postModelAsString != null) 
		{
			request.body(postModelAsString);					
		}
		
		Response response = null;

		switch(requestType) 
		{
		case Delete:
			response = request.delete(url);
			break;
		case Get:
			response = request.get(url);
			break;
		case Patch:
			response = request.patch(url);
			break;
		case Post:
			response = request.post(url);
			break;
		case Put:
			response = request.put(url);
			break;
		default:
            throw new UnsupportedOperationException("Request type is not supported.");		
		}
		
		return response;
	}
}
