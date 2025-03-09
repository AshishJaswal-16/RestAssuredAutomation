package tests;

import org.json.simple.JSONObject;
import org.junit.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class TestsOnLoaclAPI {
	
	@Test
	public void get() {
		
		baseURI = "http://localhost:3000";
		given().get("/users").then().statusCode(200).log().all();
	}
	
	@Test
	public void post() {
		
		baseURI = "http://localhost:3000";
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Thomas");
		request.put("latName", "Edison");
		request.put("subjectId", "2");
		request.put("id", "7");
		
		given().contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201);
	}
	
	@Test
	public void put() {
		
		baseURI = "http://localhost:3000";
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Vikrant");
		request.put("latName", "Kanwar");
		request.put("subjectId", "2");
		request.put("id", "5");
		
		given().contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString()).
		when().
		put("/users/2").
		then().
		statusCode(200);
	}
	
	@Test
	public void patch() {
		
		baseURI = "http://localhost:3000";
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Shit");
		request.put("latName", "Kanwar");
		request.put("subjectId", "2");
		request.put("id", "5");
		
		given().contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString()).
		when().
		patch("/users/5").
		then().
		statusCode(200);
	}
	
	@Test
	public void delete() {
		baseURI = "http://localhost:3000";
		
		when().delete("/users/6").then().statusCode(200);
		
	}
}
