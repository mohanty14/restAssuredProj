package com.qa.restAssured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class postdata {
	@Test
	public void post1() {
		JSONObject js=new JSONObject();
		js.put("name", "sunanda");
		js.put("job", "QA");
		
		System.out.println(js.toJSONString());
		given().header("Content-Type","application/json").and().
		body(js.toJSONString()).when().post("https://reqres.in/api/users").then()
		.statusCode(201);
	}
}
