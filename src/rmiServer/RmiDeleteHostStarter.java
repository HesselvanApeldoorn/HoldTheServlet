package rmiServer;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmiBase.DelHost;
import rmiBase.RmiStarter;

public class RmiDeleteHostStarter extends RmiStarter {

	private final static int port = 2828;
	public RmiDeleteHostStarter() {
		super(DelHost.class);
	}

	@Override
	public void start() {
		try {
			DelHost engine = new RmiDeleteHost();
			
			DelHost engineStub = (DelHost) UnicastRemoteObject.exportObject(engine, 0);
			LocateRegistry.createRegistry(RmiDeleteHostStarter.port);  
			Naming.rebind("rmi://"+StartRmi.ipaddress +":" + RmiDeleteHostStarter.port + "/"+DelHost.SERVICE_NAME, engineStub); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}