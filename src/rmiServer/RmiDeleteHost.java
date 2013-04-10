package rmiServer;


import java.rmi.RemoteException;

import rmiBase.DelHost;
import rmiBase.DeleteHostTask;


public class RmiDeleteHost implements DelHost {

	@Override
	public void executeTask(DeleteHostTask<String> t, String host) throws RemoteException {
		t.execute(host);
	}
}