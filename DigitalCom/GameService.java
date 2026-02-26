/**
 * 
 */
package DigitalCom;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class GameService {
    static ArrayList<Game> glist = new ArrayList<Game>();
	
	public GameService() {
    glist.add( new Game("SnowBird","Danny",300));
    glist.add( new Game("FreshFood","Ram",450));
    glist.add( new Game("Batsman","Kate",400));
    glist.add( new Game("Pokiman","Steeve",600));
	}
	
	
	public ArrayList<Game> viewAll(){
		return glist;
	}
	
	public String authorSearch(String author) {
		for(Game game : glist) {
			  if(game.getAuthorName().equalsIgnoreCase(author)) {
	                return game.getGameName();
	            }
        }
		return "NO BOOKS FOUND";
	}
	
	
}
