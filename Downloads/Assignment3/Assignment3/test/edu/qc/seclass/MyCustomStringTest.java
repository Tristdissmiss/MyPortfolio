package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers2() {
        mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    }
    @Test
    public void testCountNumbers3() {
        mycustomstring.setString("T415T4N L0U1S");
        assertEquals(4, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("i love coding in cs370");
        assertEquals(1, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("especially at 9:30");
        assertEquals(2, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers6() {
        mycustomstring.setString("K33P 5TUDY1NG");
        assertEquals(3, mycustomstring.countNumbers());
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.setString("T415T4N L0U1S");
        assertEquals("14L1", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        mycustomstring.setString("i love coding in cs370");
        assertEquals("ocnn3", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        mycustomstring.setString("especially at 9:30");
        assertEquals("seilya :0", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString("K33P 5TUDY1NG");
        assertEquals("3P5UYN", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        mycustomstring.setString("My professor is Andy Aubreau");
        assertEquals("ypoesri nyAbeu", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.setString("I love coding at 9:30 am");
        assertEquals("vda3", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        mycustomstring.setString("K33P 5TUDY1NG");
        assertEquals("35Y", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("This is a test string for CS370");
        assertEquals("iiae rgoC7", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("I need to graduate in 2025");
        assertEquals("e ui2", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        mycustomstring.setString("GitHub is a platform for version control");
        assertEquals("Hi tmrrnnl", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        mycustomstring.setString("This project is not so long");
        assertEquals("Tsre  too", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(15, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("");
        mycustomstring.convertDigitsToNamesInSubstring(0, 0);
        assertEquals("", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("T415T4N L0U1S");
        mycustomstring.convertDigitsToNamesInSubstring(0, 13);
        assertEquals("TFourOneFiveTFourN LZeroUOneS", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString("I love coding in cs370");
        mycustomstring.convertDigitsToNamesInSubstring(18, 21);
        assertEquals("I love coding in csThreeSeven0", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString("especially at 9:30");
        mycustomstring.convertDigitsToNamesInSubstring(11, 16);
        assertEquals("especially at Nine:30", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.setString("K33P 5TUDY1NG");
        mycustomstring.convertDigitsToNamesInSubstring(0, 13);
        assertEquals("KThreeThreeP FiveTUDYOneNG", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
        mycustomstring.setString("My professor is Andy Aubreau");
        mycustomstring.convertDigitsToNamesInSubstring(0, 27);
        assertEquals("My professor is Andy Aubreau", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("11411");
        mycustomstring.convertDigitsToNamesInSubstring(0, 5);
        assertEquals("OneOneFourOneOne", mycustomstring.getString());
    }

}
