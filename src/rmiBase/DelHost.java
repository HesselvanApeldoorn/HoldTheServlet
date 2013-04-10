package rmiBase;

import java.rmi.Remote;
import java.rmi.RemoteException;




public interface DelHost extends Remote {
    
    public static final String SERVICE_NAME = "DeleteHost";
    
	void executeTask(DeleteHostTask<String> t, String host) throws RemoteException;
}