package rmiClient;

import java.io.Serializable;
import java.util.ArrayList;

import model.GameRoom;

import rmiBase.Task;

public class HostList implements Task<ArrayList<GameRoom>>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8379700026436615556L;
	/**
	 * 
	 */
	
	public HostList() {System.out.println("hostlist constructor");}
	
	public ArrayList<GameRoom> execute(ArrayList<GameRoom> knownHosts) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("naam");
		GameRoom room = new GameRoom("Gasdrsdfgap", 5 , list); 
		knownHosts.add(room);
		return knownHosts;
	}
	public void getHost() {
		
	}

}
