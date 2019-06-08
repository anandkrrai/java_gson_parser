package rai.aid;

import java.io.*;
import java.util.*;
import com.google.gson.*;

public class App {

	public static void main(String[] args) throws Exception {

		Gson gson = new Gson();
//		JsonParser parser = new JsonParser();
//		JsonElement jsonTree = parser.parse(extra.str);
//		JsonObject jsonObject = jsonTree.getAsJsonObject();
//		System.out.println(jsonObject.get("api_version"));

		Recommendations recommendations = gson.fromJson(extra.str, Recommendations.class);
		Body body = recommendations.getBody();
		System.out.println(recommendations.getApiVersion());

		List<Recommendation> recommendation = body.getRecommendations();
		
		System.out.println(recommendation.get(0));
		
		// read from file , fixed but some problem with json
//		BufferedReader br = new BufferedReader(new FileReader("file.json"));
//		Recommendations recommendations = gson.fromJson(br, Recommendations.class);
//		System.out.println(recommendations);

	}
}
