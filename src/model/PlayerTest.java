package model;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * The test class PlayerTest.
 *
 * @author Nicolò Tafta & Alberto Sardo
 * @version 13/05/2022
 */
public class PlayerTest {

    private int money;
    //private final String nickname;
    private int position;
    private int turn = 0;
    int inJail = -1;
    Player Nico = new Player("Nico");
    Player None = new Player("");
    private ArrayList<PropertySquare> listofPropertySquares = new ArrayList<PropertySquare>();
    PropertySquare ViadelleAie = new PropertySquare(200, 100, "ViadelleAie", "blue", 100, position);

    @Test 
    public void getPlayerTest(){
        assertEquals("Nico", Nico.getPlayer());
    }

    @Test 
    public void getNicknameTest1(){
        assertEquals("Nico", Nico.getNickname());
    }
    public void getNicknameTest2(){
        assertEquals("", None.getNickname());
    }
    @Test 
    public void getTurnTest(){
        assertEquals(0, Nico.getTurn());
    }

    @Test 
    public void turnIncrementTest(){
        Nico.turnIncrement();
        assertEquals(1, Nico.getTurn());
    }

    @Test
    public void deleteCardtest(){
        Nico.deleteCard("desc");
    }

    @Test
    public void stillinJailTest(){
        assertFalse(Nico.stillInJail());
    }

    @Test
    public void stillinJailTest2(){
        Nico.setJail(1);
        assertTrue(Nico.stillInJail());
    }

    @Test
    public void buyPropertySquareTest(){
        Nico.buyPropertySquare(ViadelleAie);
    }

    @Test
    public void sellPropertySquareTest(){
        Nico.setJail(0);
        Nico.sellPropertySquare(0, ViadelleAie);
    }

    @Test 
    public void setPositionTest(){
        Nico.setPosition(1);
    }

    @Test 
    public void getPropertySquareTest(){
        assertEquals(listofPropertySquares, Nico.getPropertySquare());
    }

}

