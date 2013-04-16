package rmiClient;

import java.io.Serializable;

import model.GameRoom;
import model.GameRooms;

import rmiBase.SendNewHostTask;

public class SendNewHost implements SendNewHostTask<GameRoom>, Serializable {

	
	private static final long serialVersionUID = -8379700026436615556L;
	
	
	public void execute(GameRoom newGameRoom) {
		GameRooms.rooms.add(newGameRoom);
	}

}
