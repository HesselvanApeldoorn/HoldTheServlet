package rmiServer;
import model.GameRooms;

public class StartRmi {
	
	public final static String ipaddress = "129.125.157.86";
	
	public static void main(String[] args) {
		new GameRooms();
		new SendHostStarter();
		new RmiSendNewHostStarter();
	}

}
