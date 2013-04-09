package rmiBase;

import java.util.ArrayList;

import model.GameRoom;

public interface Task<T> {
    ArrayList<GameRoom> execute(ArrayList<GameRoom> knownHosts);
}