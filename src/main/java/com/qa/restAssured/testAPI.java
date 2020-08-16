package com.qa.restAssured;

import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class testAPI {
@Test
public static void hello() {
	Response rs= RestAssured.get("https://reqres.in/api/users");
	System.out.println(rs.getBody());
	System.out.println(rs.asString());
	System.out.println(rs.getStatusCode());
	int code=rs.getStatusCode();
	Assert.assertEquals(200, code);
}
@Test
public void test2() {
	given().get("https://reqres.in/api/users").then().and()
	.body("data.email[0]",equalTo("george.bluth@reqres.in")).log().all()
	.body("data.first_name",hasItems("George","Janet")).and()
	.contentType(ContentType.JSON);
}

}
