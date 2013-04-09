package rmiBase;

import model.GameRoom;



public interface SendNewHostTask<T> {
    void execute(GameRoom newRoom);
}