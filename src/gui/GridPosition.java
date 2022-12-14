package gui;

import java.util.ArrayList;

/**
 * GridPosition class contain all the positon of the squares.
 * 
 * @author taftan@usi.ch & sardoa@usiu.ch
 * @version 24/05/2022
 */
public class GridPosition {

    ArrayList<Position> positionSquare = new ArrayList<>();

    /**
     * Constructor of the GridPosition class.
     * 
     */
    public GridPosition() {

        setPositionSquare();

    }

    /**
     * SetPositonSquare method set the position of the squares.
     */
    public void setPositionSquare() {

        positionSquare.add(new Position(909, 909));
        positionSquare.add(new Position(800, 909));
        positionSquare.add(new Position(720, 909));
        positionSquare.add(new Position(640, 909));
        positionSquare.add(new Position(565, 909));
        positionSquare.add(new Position(485, 909));
        positionSquare.add(new Position(410, 909));
        positionSquare.add(new Position(330, 909));
        positionSquare.add(new Position(250, 909));
        positionSquare.add(new Position(170, 909));
        positionSquare.add(new Position(65, 909));
        positionSquare.add(new Position(65, 808));
        positionSquare.add(new Position(65, 720));
        positionSquare.add(new Position(65, 640));
        positionSquare.add(new Position(65, 565));
        positionSquare.add(new Position(65, 485));
        positionSquare.add(new Position(65, 410));
        positionSquare.add(new Position(65, 330));
        positionSquare.add(new Position(65, 250));
        positionSquare.add(new Position(65, 170));
        positionSquare.add(new Position(65, 65));
        positionSquare.add(new Position(170, 65));
        positionSquare.add(new Position(250, 65));
        positionSquare.add(new Position(330, 65));
        positionSquare.add(new Position(410, 65));
        positionSquare.add(new Position(485, 65));
        positionSquare.add(new Position(565, 65));
        positionSquare.add(new Position(640, 65));
        positionSquare.add(new Position(720, 65));
        positionSquare.add(new Position(800, 65));
        positionSquare.add(new Position(909, 65));
        positionSquare.add(new Position(909, 170));
        positionSquare.add(new Position(909, 250));
        positionSquare.add(new Position(909, 330));
        positionSquare.add(new Position(909, 410));
        positionSquare.add(new Position(909, 485));
        positionSquare.add(new Position(909, 565));
        positionSquare.add(new Position(909, 640));
        positionSquare.add(new Position(909, 720));
        positionSquare.add(new Position(909, 808));

    }


    /**
     * GetPositionSquare method return the position of the squares.
     * @param index index of the square
     * @return the position of the squares
     */
    public Position getPosition(int index) {

        return positionSquare.get(index);

    }

}
