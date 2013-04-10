package rmiClient;

import java.io.Serializable;

import model.GameRoom;
import model.GameRooms;


import rmiBase.DeleteHostTask;

public class DeleteHost implements DeleteHostTask<String>, Serializable {

	private static final long serialVersionUID = -8379700026436615556L;
	
	public DeleteHost() {System.out.println("hostlist constructor");}
	
	public void execute(String host) {
		int toBeDeleted = -1;
		System.out.println("execute dehlost");
		for(GameRoom room: GameRooms.rooms) {
			if(room.getHost().equals(host)) {
				System.out.println("deleted host: " + room.getHost());
				toBeDeleted = GameRooms.rooms.indexOf(room);
				break;
			}
		}
		
		if(toBeDeleted!=-1) {
			GameRooms.rooms.remove(toBeDeleted);
		} else {
			System.out.println("attempt to delete a host that is never added.");
		}
	}


}
