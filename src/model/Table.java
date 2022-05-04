
package model;

import model.BonusSquare;
import model.BonusSquareTest;

/**
 * this class rapresent the table composed by the square and wher ethe player will play
 *
 * @author Nicolo' Tafta & Alberto Sardo
 * @version 28/04/2022
 */
public class Table
{
    
    static private final int size = 40;
    
    Square[] cell = new Square[size];


    public void newtable(){
        cell[0] = new BonusSquare("Start","white", "The start for every player.",200);

        cell[1] = new PropertySquare(60,2, "via", "brown");

        cell[2] = new BonusSquare("Community Chest", "white", "You won at lottery you got +100", 100 );

        cell[3] = new PropertySquare(60,2, "via", "brown");

        cell[4] = new BonusSquare( "Income Tax", "white", "Income tax you have to pay 200", 200);

        cell[5] = new PropertySquare(200,2, "via", "special");

        cell[6] = new PropertySquare(100,6, "via", "blue");

        cell[7] = new BonusSquare("bonus", "white", "You won lottery you got 75", 75);

        cell[8] = new PropertySquare(100,6, "via", "blue");

        cell[9] = new PropertySquare(120, 8 , "via", "blue");

        cell[10] = new BonusSquare("Go to Jail!", "white", "now you go to the jail!", -1);

        cell[11] = new PropertySquare(140, 10, "via", "pink");

        cell[12] = new PropertySquare(150, 66 , "eletric", "white");

        cell[13] = new PropertySquare(140,10, "via", "pink");
        
        cell[14] = new PropertySquare(160,12, "via", "pink");
        
        cell[15] = new PropertySquare(200,25, "via", "white");
        
        cell[16] = new PropertySquare(180,14, "via", "orange");
        
        cell[17] = new BonusSquare("bonus", "white", "get 100", 100);

        cell[18] = new PropertySquare(180,14, "via", "orange");
        
        cell[19] = new PropertySquare(200,16, "via", "orange");
        
        cell[20] = new BonusSquare("Empty square, do nothing", "white", "Nothing, square only to sit in peace", 0);

        cell[21] = new PropertySquare(220, 18 , "via", "red");

        cell[22] = new BonusSquare("bonus supposed to be cards", "white", "pick a card but in this case money", 120);

        cell[23] = new PropertySquare(220, 18 , "via", "red");

        cell[24] = new PropertySquare(240, 20 , "via", "red");

        cell[25] = new PropertySquare(200, 25 , "via train", "white");

        cell[26] = new PropertySquare(260, 22 , "via", "yellow");

        cell[27] = new PropertySquare(260, 22 , "via", "yellow");

        cell[28] = new PropertySquare(150, 66 , "via", "white");

        cell[29] = new PropertySquare(280, 24 , "via", "yellow");

        cell[30] = new BonusSquare("JAIL!", "white", "This is the jail", -1);

        cell[31] = new PropertySquare(300,26, "via", "green");

        cell[32] = new PropertySquare(300,26, "via", "green");

        cell[33] = new BonusSquare("bonus", "white", "you won 150", 150);

        cell[34] = new PropertySquare(320, 28,  "via", "green");

        cell[35] = new PropertySquare(200,25, "via", "white");

        cell[36] = new BonusSquare("bonus", "white", "you got a malus -200", 200);

        cell[37] = new PropertySquare(350,35, "via", "blue"); 

        cell[38] = new BonusSquare("tax!", "white", "you have to pay 100", 100);

        cell[39] = new PropertySquare(400,50, "via", "blue"); 


    }

    public Square getSquare(int pos){
        return cell[pos];
    }

}




/**
 *  start (+200)
 * Via la Santa
 * bonus
 * Via Zurigo
 * malus (-200)
 * Parco Florida
 * Via Giuseppe Bagutti
 * bonus
 * Convento dei Cappucini
 * Via delle Aie
 * Penitenziario Lo Stampino
 * Viale Cassarate
 * Via delle Rose
 * Parco Tassino
 * Piazza Molino Nuovo
 * Lugano Arte e Cultura (LAC)
 * Via Maggio
 * bonus
 * Piazzale Stazione
 * Giardino Belvedere
 * NULL (do nothing)
 * Chiesa Santa Maria degli Angeli
 * bonus/malus
 * Lido di Lugano
 * Corso Elvezia
 * Viale Serafino Balestra
 * Piazza della Riforma
 * Via Nassa
 * Riva Paradiso 
 * Via alla Vetta
 * GO back TO JAIL
 * Riva Vincenzo Vela
 * Via Riviera
 * bonus
 * Viale Castagnola
 * Parco San Michele
 * bonus/malus
 * Villa Favorita 
 * malus (-100)
 * Parco Ciani
 * 
 * 
 */








 