package tests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchAndDeleteExamples {
	
	@Test
	public void testPut() {
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "morpheus");
//		map.put("job", "Teacher");
//		
//		System.out.println(map);
		
		JSONObject request= new JSONObject(map);
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		given().
		header("Content-Type","application/json").
		body(request.toJSONString()).
		when().
		put("/users/2").
		then().
		statusCode(200).log().all();
		
	}
	
	@Test
	public void testPatch() {
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "morpheus");
//		map.put("job", "Teacher");
//		
//		System.out.println(map);
		
		JSONObject request= new JSONObject(map);
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		given().
		header("Content-Type","application/json").
		body(request.toJSONString()).
		when().
		patch("/users/2").
		then().
		statusCode(200).log().all();
		
	}
	
	@Test
	public void testDelete() {

		
		baseURI = "https://reqres.in/api";
		
		when().
		delete("/users/2").
		then().
		statusCode(204).log().all();
		
	}
}
