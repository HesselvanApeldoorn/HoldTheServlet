package rmiServer;
import model.GameRooms;

public class StartRmi {
	
	public final static String ipaddress = "129.125.74.37";
	
	public static void main(String[] args) {
		new GameRooms();
		new SendHostStarter();
		new RmiDeleteHostStarter();
		new RmiSendNewHostStarter();
	}

}
