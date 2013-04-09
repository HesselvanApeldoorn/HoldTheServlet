package rmiServer;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import model.GameRooms;

import rmiBase.RmiStarter;
import rmiBase.SendNew;

public class RmiSendNewHostStarter extends RmiStarter {

	public RmiSendNewHostStarter() {
		super(SendNew.class);
		new GameRooms();
	}

	@Override
	public void start() {
		try {
			SendNew engine = new RmiSendNewHost();
			
			SendNew engineStub = (SendNew) UnicastRemoteObject.exportObject(engine, 0);
			LocateRegistry.createRegistry(2727);  
			Naming.rebind("rmi://129.125.41.177:2727/"+SendNew.SERVICE_NAME, engineStub); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new RmiSendNewHostStarter();
	}
}