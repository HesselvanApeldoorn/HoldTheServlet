package rmiServer;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmiBase.RetrieveHost;
import rmiBase.RmiStarter;


public class SendHostStarter extends RmiStarter {

	private static final int port = 2525;
	
	public SendHostStarter() {
		super(RetrieveHost.class);
	}

	@Override
	public void start() {
		try {
			RetrieveHost engine = new SendHost();
			
			RetrieveHost engineStub = (RetrieveHost) UnicastRemoteObject.exportObject(engine, 0);
			LocateRegistry.createRegistry(SendHostStarter.port);  
			Naming.rebind("rmi://"+StartRmi.ipaddress +":"+SendHostStarter.port+"/"+RetrieveHost.SERVICE_NAME, engineStub); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SendHostStarter();
	}
}