package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetAPITest {
	@Test
	
	public void GetAPI() {
		Response r = get("https://reqres.in/api/users/2");
		System.out.println(r.getStatusCode());
		System.out.println(r.statusCode());
		System.out.println(r.getTime());
		System.out.println(r.getBody().asString());
		
		//Validations
		
		Assert.assertEquals(r.statusCode(), 200);
		
		//Validating the values
		
		baseURI = "https://reqres.in/api/users/2";
		given().
		  get("https://reqres.in/api/users/2").
		then().
		  statusCode(200).
		  body("data.first_name", equalTo("Janet")).
		  log().all();
		
		  
	}

}
