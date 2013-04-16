package rmiServer;
import model.GameRooms;

public class StartRmi {
	
	public final static String ipaddress = "145.97.185.24";
	
	public static void main(String[] args) {
		new GameRooms();
		new SendHostStarter();
		new RmiDeleteHostStarter();
		new RmiSendNewHostStarter();
	}

}
