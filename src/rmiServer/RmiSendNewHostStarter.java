package rmiServer;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmiBase.RmiStarter;
import rmiBase.SendNew;

public class RmiSendNewHostStarter extends RmiStarter {

	private final static int port = 2727;
	public RmiSendNewHostStarter() {
		super(SendNew.class);
	}

	@Override
	public void start() {
		try {
			SendNew engine = new RmiSendNewHost();
			
			SendNew engineStub = (SendNew) UnicastRemoteObject.exportObject(engine, 0);
			LocateRegistry.createRegistry(RmiSendNewHostStarter.port);  
			Naming.rebind("rmi://"+StartRmi.ipaddress +":" + RmiSendNewHostStarter.port + "/"+SendNew.SERVICE_NAME, engineStub); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new RmiSendNewHostStarter();
	}
}