package game.boardgame.chess.pieces;

import game.boardgame.chess.Board;
import game.boardgame.chess.Place;

public interface Piece {
    public void setColor(int color);
    boolean move(Board board,Piece piece, Place start,Place end);

}
