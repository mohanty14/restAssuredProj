package com.qa.restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class delete {
	@Test
	public void deltedata() {
		given().delete("https://reqres.in/api/users/8").then().statusCode(204);
}
}