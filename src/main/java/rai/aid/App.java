package rai.aid;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.*;


public class App {

	public static void main(String[] args) throws FileNotFoundException {

//		System.out.println("Hello World!");
//		Gson gson = new Gson();
//		JsonReader reader = new JsonReader(new FileReader("file.json"));
//		List<Recommendations> data = gson.fromJson(reader, REVIEW_TYPE); // contains the whole reviews list
//		data.toScreen();
//		JsonParser parser = new JsonParser();
//		JsonElement jsonTree = parser.parse(extra.str);
//		if (jsonTree.isJsonObject()) {
//			JsonObject jsonObject = jsonTree.getAsJsonObject();
//			JsonElement element = jsonObject.get("api_version");
//			System.out.println(element);
//		}
		
		  Gson gson = new Gson();

	  BufferedReader br = new BufferedReader(new FileReader("//home//anand//eclipse-workspace//aid//src//main//java//rai//aid//file.json"));
	   Recommendations recommendations = gson.fromJson(br, Recommendations.class);
	   System.out.println(recommendations);

	}
}
