package game.boardgame.chess.pieces;

import game.boardgame.chess.Board;
import game.boardgame.chess.Place;
import game.boardgame.chess.pieces.Piece;

public class King implements Piece {
    int color;
    @Override
    public void setColor(int color) {
        this.color=color;
    }

    @Override
    public boolean move(Board board, Piece piece, Place start, Place end) {
        return false;
    }
}
