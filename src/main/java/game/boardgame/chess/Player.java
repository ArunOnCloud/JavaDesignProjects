package game.boardgame.chess;

import game.boardgame.chess.pieces.Piece;
import lombok.Data;

import java.util.Random;

@Data
public class Player {
    private  String name;
    private Integer id;
    private int color;
    private Board board;

    Player(String name,Integer color){
        this.name=name;
        this.color=color;
        Random random=new Random();
        this.id=random.nextInt();
    }
    boolean move(Piece piece,Place des){

        //piece.move(board,piece,)
        return false;
    }
}
