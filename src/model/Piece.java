package model;
import java.util.ArrayList;
import java.util.Random;
 import java.awt.Color;

public class Piece {

    Random rand = new Random();
    private float r = rand.nextFloat();
    private float g = rand.nextFloat();
    private float b = rand.nextFloat();
    Color randomColor;

    ArrayList<Player> players = new ArrayList<>();



    public Piece(){

        generatePiece();
        checkPiece();

    }



    public void generatePiece(){
        r = rand.nextFloat();
        g = rand.nextFloat();
        b = rand.nextFloat();
    }


    public void checkPiece(){
        
        for(Player x: players){
            if(x.getPiece() == this){
                generatePiece();
                checkPiece();
                break;
            }
        }
        this.setPiece();

    }



    public void setPiece(){
        randomColor = new Color(r, g, b);

    }


    public Color getColor(){
        return randomColor;
    }
    
}