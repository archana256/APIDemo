package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UtilData {
	public static RequestSpecification req;
	
	
	public RequestSpecification requestSpecification() throws Exception {
		if(req==null) {
		PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
		 req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
				.setContentType("application/json;charset = UTF-8")
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.build();
		 return req;
		}
		return req;
	}
	
	public static String getGlobalValue(String key) throws IOException {
        Properties prop = new Properties(); //to scan the file content
        FileInputStream fis =new FileInputStream("C:\\Users\\archana.b\\eclipse-workspace\\CMSFrmwk\\src\\test\\java\\resources\\global.properties");
        prop.load(fis); //to load file
        return prop.getProperty(key); //to extract the actual data



    }
	
	 public String getJsonPath(Response response, String key){
	     String resp = response.asString();
	       JsonPath JS = new JsonPath(resp);
	        return JS.get(key).toString();
	    }


}
