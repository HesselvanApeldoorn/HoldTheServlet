package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import model.GameRoom;
import model.GameRooms;

import javax.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class OpinionServlet
 */
@WebServlet("/GameRoomServlet")
public class GameRoomServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public GameRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        String stringId = request.getParameter("id");
        int id = Integer.parseInt(stringId);
        GameRoom gameRoom = GameRooms.rooms.get(id);
        String output = "";
        output += "<html>";
            output += "<head>";
            output += "</head>";
            output += "<body>";
                output += "<h1>Game information</h1>";
                output += "<bold>host: </bold>" + gameRoom.getHost() + "</br>";
                output += "<bold> max points: </bold>" + gameRoom.getMax_points() + "</br>";
    	        output += "<table border='1'> <tr><th>Name</th><th>Score</th></tr>";
    	        for(int j=0; j<gameRoom.getScores().length; j++) {
    	        	output += "<tr><td>" + gameRoom.getNames().get(j) + "</td><td>" + gameRoom.getScores()[j] + "</td></tr>";
    	        }
    	        output += "</table><br><br>";
    	        output += "<a hr``ef='/rest/HighScores/'>Show the highscores</a>";
            output += "</body>";
        output += "</html>";
        out.println(output);
    }

}
