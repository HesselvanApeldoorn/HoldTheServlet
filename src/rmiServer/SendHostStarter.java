package rmiServer;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmiBase.RetrieveHost;
import rmiBase.RmiStarter;


public class SendHostStarter extends RmiStarter {

	public SendHostStarter() {
		super(RetrieveHost.class);
	}

	@Override
	public void start() {
		try {
			RetrieveHost engine = new SendHost();
			
			RetrieveHost engineStub = (RetrieveHost) UnicastRemoteObject.exportObject(engine, 0);
			LocateRegistry.createRegistry(2525);  
			Naming.rebind("rmi://"+StartRmi.ipaddress +":2525/"+RetrieveHost.SERVICE_NAME, engineStub); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SendHostStarter();
	}
}