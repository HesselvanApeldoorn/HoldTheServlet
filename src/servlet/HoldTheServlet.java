package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import model.GameRoom;
import model.GameRooms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class OpinionServlet
 */
@WebServlet("/HoldTheServlet")
public class HoldTheServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public HoldTheServlet() {
        super();
        new GameRooms();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String stringId = request.getParameter("id");
        if(stringId == null) {
        	stringId="0";
        }
        int id = Integer.parseInt(stringId);
        GameRoom gameRoom = GameRooms.rooms.get(id);
        String output = "";
        output += "<html>";
            output += "<head>";
            output += "</head>";
            output += "<body>";
                output += "<h1>Game information</h1>";    	        
                if(id==0) {
    	        	output  += "<h3>Example room</h3>";
    	        }
                
                output += "<bold>host: </bold>" + gameRoom.getHost() + "</br>";
                output += "<bold> max points: </bold>" + gameRoom.getMax_points() + "</br>";
    	        output += "<table border='1'> <tr><th>Contenders</th></tr>";
    	        for(int j=0; j<gameRoom.getNames().size(); j++) {
    	        	output += "<tr><td>" + gameRoom.getNames().get(j) + "</td></tr>";
    	        }
    	        output += "</table><br><br>";
    	        output += "<a href='/HoldTheServer/rest/HighScores/'>Show the highscores</a>";
            output += "</body>";
        output += "</html>";
        out.println(output);
    }

}
