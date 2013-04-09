package model;

import java.util.ArrayList;

public class GameRooms {
	
	public static ArrayList<GameRoom> rooms = new ArrayList<GameRoom>();
	
	public GameRooms() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bert");
		names.add("Ernie");
		GameRoom gameRoom = new GameRoom("129.0.0.1", 100, names );
		GameRooms.rooms.add(gameRoom);
	}

	public static ArrayList<String> getHosts() {
		ArrayList<String> hosts = new ArrayList<String>();
		for(GameRoom room: GameRooms.rooms) {
			hosts.add(room.getHost());
		}
		return hosts;
	}
}
