package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This class rapresent the main of the game, here all the principals
 * methods of monopoly are stored
 *
 * @author Nicolo' Tafta & Alberto Sardo
 * @version 11/05/2022
 */

public class JailSquareTest {

    Player Nico = new Player("Nico");
    JailSquare Jail = new JailSquare("Lo stampino", "red");

    @Test
    public void getDaysTest() {
        assertEquals(3, JailSquare.getDays());
    }

    @Test
    public void getFineTest() {
        new JailSquare("Via delle Aie", "blue");
        assertEquals(50, JailSquare.getFine());
    }

    @Test
    public void isPerfectPairTest() {
        assertTrue(new Dice(5, 5).isPerfectPair());
    }

    // @Test
    // public void decreaseDayInJailTest() {
    // JailSquare Jail1 = new JailSquare("Lo stampino", "blue");
    // }
    // public void getPair1Test(){
    // Jail.getPair1();
    // assertEquals(6, new Dice(5, 6).getDie2());
    // } testare i valori in un intervallo
    // assertTrue( die1 >= )

    // @Test
    // public void getPair2Test(){
    // assertEquals(6, new Dice(5, 6).getDie2());

    // @Test
    /*
     * public void payFineTest() {
     * Jail.payFine(Nico);
     * assertEquals(1445, Nico.getMoney());
     * }
     * 
     * @Test
     * public void freeFromJailTest() {
     * Jail.freeFromJail(Nico);
     * assertEquals(-1, Nico.getTurnsInJail());
     * }
     * 
     * }
     */
}