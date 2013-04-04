package model;

import java.net.InetAddress;
import java.util.ArrayList;

public class GameRoom {
	
	private InetAddress host;
	private int max_points;
	private int[] scores;
	private ArrayList<String> names;
	
	public InetAddress getHost() {
		return host;
	}
	
	public void setHost(InetAddress host) {
		this.host = host;
	}
	
	public int getMax_points() {
		return max_points;
	}
	
	public void setMax_points(int max_points) {
		this.max_points = max_points;
	}
	
	public int[] getScores() {
		return scores;
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public ArrayList<String> getNames() {
		return names;
	}
	
	public void setNames(ArrayList<String> names) {
		this.names = names;
	} 

}
