package com.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class SampleRestTestIT {
	@Test
	public void sampleRestTest() {
	
	Response response = given().get("https://reqres.in/api/users?page=1&id=2");
	response.prettyPrint();
     System.out.println(response.getHeaders());
     System.out.println(response.getStatusCode());
	}

}
