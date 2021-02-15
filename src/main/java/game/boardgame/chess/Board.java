package game.boardgame.chess;

public class Board {
    Place[][] places;

    Board(){
        places=new Place[8][8];
        int f=0;
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++) {
                Place place = new Place();
                if (f % 2 == 0) {
                    place.setColor(0);
                } else {
                    place.setColor(1);
                }
                places[i][j] = place;
                f++;
            }
        }

    }

}
