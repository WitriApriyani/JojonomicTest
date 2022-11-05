package com.juaracoding.restassured;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGet {
@Test
	public void testGetCurrent() {
//		RestAssured.baseURI=baseUrl;
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.get("https://api.weatherbit.io/v2.0/current?lat=40.730610&lon=73.935242&key=390f4f60a4154e44b45746132a4f83bc");
		
		resp.then().statusCode(200);
		System.out.println(resp.getBody().asString());
		System.out.println(resp.getStatusCode());
	}
}