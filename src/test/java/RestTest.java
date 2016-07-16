import static com.jayway.restassured.RestAssured.*;
//import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;
import org.testng.*;
import org.testng.annotations.*;
//import org.testng.asserts.*;

import com.jayway.restassured.response.Response;

public class RestTest {

	
	
		
	String url="https://api.twitter.com/1.1/statuses/user_timeline.json";
//	String Path="/1.1/statuses/user_timeline.json";
	
	@Test
	public void teststatus(){
	int statuscode=	
		given().
		      param("user_id", "lali20000").
		      
		      get(url).
	 
		     statusCode();
		
		//Assert.assertEquals(statuscode, 200);
	Assert.assertTrue(statuscode==200);
	}
}
