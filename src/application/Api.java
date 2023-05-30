package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

import application.Entities.WSResult;

public class Api {
	public static WSResult getResults() throws IOException {
		var url = new URL("https://api.worldskills.org/results/?offset=0&limit=10431&sort=event_desc&l=en-US");
		var con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setDoOutput(true);
		var gson = new Gson();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		return gson.fromJson(br.readLine(), WSResult.class);
	}
}
