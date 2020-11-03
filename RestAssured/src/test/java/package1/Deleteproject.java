package package1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Deleteproject {
	
	@Test
	 public void createPRoject() {
	  //Selenium code
	  Response resp = RestAssured.delete("http://localhost:8084/projects/123");
	  
	  //System.out.println(resp.asString());
	  resp.prettyPrint();
	  
	  int actualStatusCode = resp.getStatusCode();
	  System.out.println(actualStatusCode);
	  Assert.assertEquals(actualStatusCode, 200);
	  
	  System.out.println(resp.getHeaders());
	  
	}

}
