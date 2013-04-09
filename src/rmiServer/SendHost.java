package rmiServer;


import java.rmi.RemoteException;
import java.util.ArrayList;

import model.GameRoom;

import rmiBase.RetrieveHost;
import rmiBase.Task;


public class SendHost implements RetrieveHost {

	@Override
	public <T> ArrayList<GameRoom> executeTask(Task<T> t) throws RemoteException {
		return t.execute();
	}
}