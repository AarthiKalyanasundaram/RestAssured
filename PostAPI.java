package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;
public class PostAPI {
	
	
	@Test
	
	public void testPost() {
		
		/*
		 * Map<String,Object> map = new HashMap<String, Object>(); 
		 * map.put("name","Aarthi"); map.put("job", "Product Test Engineer");
		 
		System.out.println(map);
		*/
		JSONObject req = new JSONObject();
		req.put("name","Aarthi");
		req.put("job", "Product Test Engineer");
		System.out.println(req.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		   body(req.toJSONString()).
		when().
		   post("/users").
		then().
		   statusCode(201).log().all();
		
	}

}
