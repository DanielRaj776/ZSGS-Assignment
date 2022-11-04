package filemanepulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class hitaAPI {

    public static void main(String[] args) {
	    URL url;
	    try {
		url = new URL("https://reqres.in/api/unknown");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		System.out.println(reader.readLine());
		connection.disconnect();
	    } catch (IOException e) {
		System.out.println("A Problem Has Occered Try Again");
	    }
    }

}
