package model;

import java.util.ArrayList;

public class GameRooms {
	
	public static ArrayList<GameRoom> rooms = new ArrayList<GameRoom>();
	
	public GameRooms() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bert");
		names.add("Ernie");
		GameRoom gameRoom = new GameRoom("129.0.0.1", 100, names );
		rooms.add(gameRoom);
	}
}
