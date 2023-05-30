package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

import application.Entities.WSResult;

public class Api {
	public static WSResult getResults(int offset,int limit) throws Exception {
		if(limit > 10431) throw new IllegalArgumentException("limit is under the 10431");
		if(offset < 0) throw new IllegalArgumentException("offset is above the 0");
		var url = new URL("https://api.worldskills.org/results/?offset="+offset+"&limit="+limit+"&sort=event_desc&l=en-US");
		var con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setDoOutput(true);
		var gson = new Gson();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		return gson.fromJson(br.readLine(), WSResult.class);
	}
}
