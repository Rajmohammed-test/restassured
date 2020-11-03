package package1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class patchproject {
	
	@Test
	 public void createPRoject() {
	 
	   JSONObject jsonObj = new JSONObject();
	   jsonObj.put("projectId", "123");
	   
	   jsonObj.put("projectName", "Vodafone1111");
	  
	   jsonObj.put("teamSize", 15);
	  
	  RequestSpecification reqSpec = RestAssured.given();
	  reqSpec.contentType(ContentType.JSON);
	  reqSpec.body(jsonObj.toJSONString());
	  
	  Response resp = reqSpec.when().patch("http://localhost:8084/projects/123");
	  
	  System.out.println(resp.prettyPrint());
	  
	  int Astatuscode=resp.getStatusCode();
	  System.out.println(Astatuscode);
	  Assert.assertEquals(Astatuscode, 201);
	  
	  String cTtype=resp.contentType();
	  System.out.println(Astatuscode);
	  Assert.assertTrue(cTtype, cTtype.contains("JSON"));
	  
	  System.out.println(resp.getBody());
	}

}
