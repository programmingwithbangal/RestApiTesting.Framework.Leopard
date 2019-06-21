package helpers;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonProcessing {

	public ObjectMapper objectMapper = new ObjectMapper();
	
	public JsonProcessing() 
	{
	}
	
	public String ConvertModelToJSON(Object model) 
	{		
		String postModelAsString = null;
		try 
		{
			postModelAsString = objectMapper.writeValueAsString(model);
			return postModelAsString;
		} 
		catch (JsonProcessingException e) 
		{
			e.printStackTrace();
		}
		
		return postModelAsString;		
	}
	
	public Map<?, ?> ConvertModelToMap(Object model) 
	{
		Map<?, ?> mappedObject = objectMapper.convertValue(model, Map.class);
		return mappedObject;
	}

}