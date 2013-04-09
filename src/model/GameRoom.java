package model;

import java.io.Serializable;
import java.util.ArrayList;

public class GameRoom implements Serializable {
	

	private static final long serialVersionUID = 2L;
	
	private String host;
	private int max_points;
	private ArrayList<String> names;
	
	public GameRoom(String host, int max_points, ArrayList<String> names) {
		this.host = host;
		this.max_points = max_points;
		this.names = names;
	}
	
	public String getHost() {
		return this.host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public int getMax_points() {
		return this.max_points;
	}
	
	public void setMax_points(int max_points) {
		this.max_points = max_points;
	}
	
	public ArrayList<String> getNames() {
		return this.names;
	}
	
	public void setNames(ArrayList<String> names) {
		this.names = names;
	} 

}
