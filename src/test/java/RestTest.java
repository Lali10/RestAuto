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
		      param("Authorization","OAuth ").
		      param("oauth_consumer_key","DC0sePOBbQ8bYdC8r4Smg").
		      param("oauth_signature_method","HMAC-SHA1").
		      param("oauth_timestamp","1468635221").
		      param("oauth_nonce","237279448").
		      param("oauth_version","1.0").
		      param("oauth_token","753707781442588672-MHaVfshYyLO9Qxfa5hXrgIgJRYxT07u").
		      param("oauth_signature","%2BeN%2Bif3oHVdWSQQ%2Fu2kUI7hkoLw%3D").
		      
		      get(url).
	 
		     statusCode();
		
		//Assert.assertEquals(statuscode, 200);
	Assert.assertTrue(statuscode==200);
	}
}
