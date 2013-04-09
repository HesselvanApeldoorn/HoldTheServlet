package rmiServer;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmiBase.RetrieveHost;
import rmiBase.RmiStarter;


/**
 * start the server component. this exposes the an implementation of the Compute
 * interface as a service over RMI An RMI server program needs to create the
 * initial remote objects and export them to the RMI runtime, which makes them
 * available to receive incoming remote invocations.
 * 
 * @author srasul
 * 
 */
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
			Naming.rebind("rmi://129.125.41.178:2525/"+RetrieveHost.SERVICE_NAME, engineStub); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SendHostStarter();
	}
}