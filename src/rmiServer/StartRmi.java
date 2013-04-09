package rmiServer;

import model.GameRooms;

public class StartRmi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new GameRooms();
		new SendHostStarter();
		new RmiSendNewHostStarter();
	}

}
