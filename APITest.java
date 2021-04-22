package tests;

//Importing the libraries

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

// Using TestNG

public class APITest{
	@Test
	public void test_1() {
		
		//Getting the Response from the Rest API
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getTime());
		System.out.println(response.statusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		
		// Validation of Status code
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode/*Actual Value*/, 200/*Expected Value*/);
		
	}

}
