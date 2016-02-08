package escape;

import model.*;
import controller.*;
import view.*;

public class Escape {
    
    public static void main(String[] args) {
        Escape game = new Escape();
        game.beginGame();
    }

    public void beginGame(){
        TheGameEngine gEngine = new TheGameEngine();
        gEngine.startGame();
    }
    
}
