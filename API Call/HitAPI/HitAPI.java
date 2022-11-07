package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.ColorPOJO;

public class HitAPI {

    public static void main(String[] args) {
	
	URL url;
	try {
	    url = new URL("https://reqres.in/api/unknown");
	    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    JSONObject obj = new JSONObject(reader.readLine());
	    List<ColorPOJO> list = new ArrayList<>();
	    JSONArray arr = (JSONArray) obj.get("data");
	    for(int i = 0; i < arr.length(); i++) {
		JSONObject jsonObj = arr.getJSONObject(i);
		ObjectMapper mapper = new ObjectMapper();
		ColorPOJO temp = mapper.readValue(jsonObj.toString(), ColorPOJO.class);
		list.add(temp);
	    }
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel panel = new JPanel();
	    JList<Object>  jList;
	    for(ColorPOJO x : list) {
		Object[] dataArr = { x.getId(), x.getName(), x.getYear() , x.getColor(), x.getPantone_value()};
		jList = new JList<>(dataArr);
		panel.add(jList);
		frame.add(panel);
	    }
	    frame.setSize(1000, 720);
	    frame.setVisible(true);
	} catch (IOException e) {
	    System.out.println("A Problem as occered");
	}
    }
}