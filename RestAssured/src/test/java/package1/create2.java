package package1;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import  io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class create2 {
	
	@Test
	 public void createPRoject() {
	 
	   JSONObject jsonObj = new JSONObject();
	   jsonObj.put("projectId", "V123");
	   jsonObj.put("createdBy", "deepak");
	   jsonObj.put("projectName", "Vodafone1234");
	   jsonObj.put("status", "aaa");
	   jsonObj.put("teamSize", 10);
	   
	   given()
	          .contentType(ContentType.JSON)
	          .body(jsonObj.toJSONString())
	   .when()
	   		  .post("http://localhost:8084/addProject")
	  .then()
	         .assertThat().statusCode(201);
	   
	   
	   
	}

}
