package rmiBase;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import model.GameRoom;


public interface RetrieveHost extends Remote {
    
    public static final String SERVICE_NAME = "SendHost";
    
    <T> ArrayList<GameRoom> executeTask(Task<T> t) throws RemoteException;
}