package rmiServer;
import model.GameRooms;

public class StartRmi {
	
	public final static String ipaddress = "192.168.178.11";
	
	public static void main(String[] args) {
		new GameRooms();
		new SendHostStarter();
		new RmiDeleteHostStarter();
		new RmiSendNewHostStarter();
	}

}
