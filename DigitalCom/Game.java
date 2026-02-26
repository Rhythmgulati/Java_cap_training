package DigitalCom;

public class Game {
	private String gameName;
	private String authorName;
	private float price;
	
	
	public Game() {
        this.gameName = "";
        this.authorName = "";
        this.price = 0.0f;
    }
    
    
    public Game(String gameName, String authorName, float price) {
        this.gameName = gameName;
        this.authorName = authorName;
        this.price = price;
    }
    
    public String getAuthorName() {
        return authorName;
    }
    
    public String getGameName() {
    	return gameName;
    }
    
    @Override
    public String toString() {
        return gameName + " | " + authorName + " | $" + price;
    }
}
