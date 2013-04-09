package rmiServer;


import java.rmi.RemoteException;

import model.GameRoom;
import model.GameRooms;

import rmiBase.SendNew;
import rmiBase.SendNewHostTask;


public class RmiSendNewHost implements SendNew {

	@Override
	public void executeTask(SendNewHostTask<GameRoom> t, GameRoom room) throws RemoteException {
		t.execute(room);
		//return t.execute(GameRooms.rooms);
	}
}