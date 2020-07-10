package application.api;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import application.models.Response;

import java.io.UnsupportedEncodingException;


public class API {
	static String url = "http://localhost:3001/translation";
	private void sendPost() throws UnsupportedEncodingException {
 
        
	}
	
	private void sendGet() {}
	
	public static Response getTranslations() throws Exception {
		HttpGet get = new HttpGet(url);
		Response jsonData = null;
        try {
        	CloseableHttpClient httpClient = HttpClients.createDefault();
        	CloseableHttpResponse response = httpClient.execute(get);
        	
        	String data = EntityUtils.toString(response.getEntity());
        	
        	Gson gson = new Gson();
        	
        	jsonData = gson.fromJson(data, new TypeToken<Response>() {}.getType());
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        return jsonData;
	}
}
