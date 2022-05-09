package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * The test class TableTest.
 *
 * @author Nicolo' Tafta & Alberto Sardo
 * @version 9/05/2022
 */
public class TableTest {

    static private final int sizeTable = 40;
    Square[] cell = new Square[sizeTable];

    @Test
    public void newtabletest(){
        Table table = new Table();
    }

    @Test
    public void getSquareTest(){
        Table table = new Table();
        assertTrue(new PropertySquare(400, 50, "Piazza della Riforma", "blue").getName().equals(table.getSquare(39).getName()));
    }

    @Test 
    public void getDescriptionPropertyTest(){
        assertEquals(expected,  getDescriptionProperty(39));
    }
}
