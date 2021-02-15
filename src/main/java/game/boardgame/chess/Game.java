package game.boardgame.chess;

import lombok.Data;

@Data
public class Game {

    Player first;
    Player second;
    Board board;
    public Game(String player1,String player2){
        first=new Player(player1,0);
        second=new Player(player2,1);
        board=new Board();
    }
    boolean move(Board board,int startx,int starty,int endx,int endy){
        return  false;
    }

}
