package rmiBase;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.GameRoom;


public interface SendNew extends Remote {
    
    public static final String SERVICE_NAME = "SendNewHost";
    
    void executeTask(SendNewHostTask<GameRoom> t, GameRoom newRoom) throws RemoteException;
}