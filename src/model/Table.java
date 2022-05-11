
package model;

/**
 * this class rapresent the table composed by the square and wher ethe player
 * will play
 *
 * @author Nicolo' Tafta & Alberto Sardo
 * @version 28/04/2022
 */
public class Table {

    static private final int sizeTable = 40;

    Square[] cell = new Square[sizeTable];

    public Table() {
        newtable();
    }

    public void newtable() {
        cell[0] = new BonusSquare("Start", "bonus", "The start for every player.", 200);

        cell[1] = new PropertySquare(60, 2, "Via Zurigo", "brown");

        cell[2] = new BonusSquare("Pick a card!", "cards", "pick a card and discover if it's good or not", -1);

        cell[3] = new PropertySquare(60, 2, "Via Giuseppe Bagutti", "brown");

        cell[4] = new BonusSquare("Income Tax", "malus", "Income tax you have to pay 200", 200);

        cell[5] = new PropertySquare(200, 2, "Parco Florida", "park");

        cell[6] = new PropertySquare(100, 6, "Via la Santa", "blue");

        cell[7] = new BonusSquare("Casino' Lugano", "bonus", "You won at blackjack you gain  75 chf", 75);

        cell[8] = new PropertySquare(100, 6, "Convento dei Cappuccini", "blue");

        cell[9] = new PropertySquare(120, 8, "Via delle Aie", "blue");

        cell[10] = new BonusSquare("Go to the jail!", "goto", "now you go to the jail!", -1);

        cell[11] = new PropertySquare(140, 10, "Viale Cassarate", "pink");

        cell[12] = new PropertySquare(150, 66, "Centrale Elettrica AIL", "company");

        cell[13] = new PropertySquare(140, 10, "Via delle Rose", "pink");

        cell[14] = new PropertySquare(160, 12, "Piazza Molino Nuovo", "pink");

        cell[15] = new PropertySquare(200, 25, "Villa Favorita ", "Park");

        cell[16] = new PropertySquare(180, 14, "Lugano Arte e Cultura (LAC)", "orange");

        cell[17] = new BonusSquare("USI Campus West", "bonus", "You the best Student free schoolarship of 100 chf", 100);

        cell[18] = new PropertySquare(180, 14, "Via Maggio", "orange");

        cell[19] = new PropertySquare(200, 16, "Chiesa Santa Maria degli Angeli", "orange");

        cell[20] = new BonusSquare("Empty square, do nothing", "empty", "Nothing, square only to sit in peace", 0);

        cell[21] = new PropertySquare(220, 18, "Piazzale Stazione ", "red");

        cell[22] = new BonusSquare("Pick a card", "cards", "Pick a card and discover if it's good or not",
                120);

        cell[23] = new PropertySquare(220, 18, "Corso Elvezia", "red");

        cell[24] = new PropertySquare(240, 20, "Lido", "red");

        cell[25] = new PropertySquare(200, 25, "Parco San Michele", "park");

        cell[26] = new PropertySquare(260, 22, "Viale Serafino Balestra", "yellow");

        cell[27] = new PropertySquare(260, 22, "Lido di Lugano", "yellow");

        cell[28] = new PropertySquare(150, 66, "Universita' di Lugano", "company");

        cell[29] = new PropertySquare(280, 24, "Via Nassa", "yellow");

        cell[30] = new JailSquare("Penitenziario lo Stampino!", "jail");

        cell[31] = new PropertySquare(300, 26, "Riva Paradiso", "green");

        cell[32] = new PropertySquare(300, 26, "Via alla Vetta", "green");

        cell[33] = new BonusSquare("USI Campus East", "bonus", "You the best Student free schoolarship of 150 chf", 150);

        cell[34] = new PropertySquare(320, 28, "Riva Vincenzo Vela", "green");

        cell[35] = new PropertySquare(200, 25, "Parco Ciani", "Park");

        cell[36] = new BonusSquare("Bar Oops", "malus", "You spent a lot of money in drinks, pay the bill of 200 chf", 200);

        cell[37] = new PropertySquare(350, 35, "Via Pessina", "blue");

        cell[38] = new BonusSquare("Dogana Chiasso!", "malus", "You brought to much food, you have been caugh and pay 100 chf of fine",
                100);

        cell[39] = new PropertySquare(400, 50, "Piazza della Riforma", "blue");

    }

    public Square getSquare(int pos) {
        return cell[pos];
    }






    public String getSquareName(int pos) {
        return this.getSquare(pos).getName();
    }

    public int getSquarePrice(int pos) {
        Object obj = this.getSquare(pos);
        if (obj instanceof PropertySquare) {
            PropertySquare s = (PropertySquare) obj;
            return s.getPrice();
        }
        return 0;
    }

    public int getSquarePriceTax(int pos) {
        Object obj = this.getSquare(pos);
        if (obj instanceof PropertySquare) {
            PropertySquare s = (PropertySquare) obj;

            return s.getPriceTax();
        }
        return 0;
    }



    public static int getSizeofTable() {
        return sizeTable;
    }

    public String getDescriptionProperty(int pos) {
        return "Name: " + getSquareName(pos) + "\n" + "Price: " + getSquarePrice(pos) + "\n" + "Rent value: "
                + getSquarePriceTax(pos) + "\n Owner: " + getSquareOwner(pos) + "\n";

    }


    public String getSquareOwner(int pos) {
        Object obj = this.getSquare(pos);
        if (obj instanceof PropertySquare) {
            PropertySquare s = (PropertySquare) obj;
            return s.getOwner();
        }
        return "not a property";
    }






    public void setSquareOwner(Player player) {
        Object obj = this.getSquare(player.getPosition());
        if (obj instanceof PropertySquare) {
            PropertySquare s = (PropertySquare) obj;
            s.changeOwner(player);
        }
        

    }



    public int getSquareBonusPrice(Player player){
        Object obj = this.getSquare(player.getPosition());
        if (obj instanceof BonusSquare) {
            BonusSquare s = (BonusSquare) obj;
            return s.getMoney();
        }
        return -1;
        
    }

    public String getSquareBonusDescr(int pos){
        Object obj = this.getSquare(pos);
        if (obj instanceof BonusSquare) {
            BonusSquare s = (BonusSquare) obj;
            return s.getDescription();
        }
        return "";
        
    }


    public PropertySquare getPropertySquare(int pos){
        Object obj = this.getSquare(pos);
        
        if (obj instanceof PropertySquare) {
            PropertySquare s = (PropertySquare) obj;
            return s;
        }
        return null;
        
    }








}

/**
 * start (+200)
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
