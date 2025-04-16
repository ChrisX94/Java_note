package Ch22;
// 模擬client端發送request
import java.io.File;
import java.net.URI;

// java.net.http -> Java 11
// Maven 要加入gson的設定檔

//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpRequest.BodyPublishers;
//import java.net.http.HttpResponse;
import java.nio.file.Paths;
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;


public class JavaNetHttp {
	public static void main(String[] args) {
//		String f = "./src/main/java/JavaNetHttp/comment.json";
//		File file = new File(f);
//		System.out.println(file.exists());
		
//		
//		try {
//			getComment();
//			createComment();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
	}
//	
//	public static void getComment() throws Exception{
//		HttpClient client =  HttpClient.newHttpClient(); //建立client端
//		// 建立request資訊,這裡模擬get方式
//		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/comments?postId=1")).build();
//		// send request
//		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//		Gson gson = new Gson();
//		// 用JsonArray物件去接在response body 中的json
//		JsonArray comments = gson.fromJson(response.body(), JsonArray.class);
//		// 讀取json
//		for(JsonElement comment : comments) {
//			System.out.println("Comment ID: " + comment.getAsJsonObject().get("id").getAsInt());
//			System.out.println("Name: " + comment.getAsJsonObject().get("name").getAsString());
//			System.out.println("Email: " + comment.getAsJsonObject().get("email").getAsString());
//			System.out.println("Body: " + comment.getAsJsonObject().get("body").getAsString());
//			System.out.println("===================================================");
//		}
//		
//	}
//
//	public static void createComment()throws Exception{
//		HttpClient client =  HttpClient.newHttpClient(); //建立client端
//		// 建立request資訊,這裡模擬post方式在request body中帶入json
//		HttpRequest request = HttpRequest.newBuilder()
//				.uri(URI.create("https://jsonplaceholder.typicode.com/comments"))
//				.header("Content-Type", "application/json")
//				.POST(BodyPublishers.ofFile(Paths.get("./src/main/java/JavaNetHttp/comment.json")))
//				.build();
//		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//		System.out.println("Response Body: " + response.body());
//	}
}
