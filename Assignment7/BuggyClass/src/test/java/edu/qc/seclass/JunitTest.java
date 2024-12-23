package edu.qc.seclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JunitTest {
    @Test
    void testBuggyMethod1_SC1a() {
        BuggyClass buggy = new BuggyClass();
        assertEquals(1, buggy.buggyMethod1(0));
    }

    @Test
    void testBuggyMethod1_SC1b() {
        BuggyClass buggy = new BuggyClass();
        assertThrows(ArithmeticException.class, () -> buggy.buggyMethod1(1));
    }

    @Test
    void testBuggyMethod2_SC2() {
        BuggyClass buggy = new BuggyClass();
        assertEquals(1, buggy.buggyMethod2(1));
        assertEquals(0, buggy.buggyMethod2(0));
    }

    @Test
    void testBuggyMethod2_BC2() {
        BuggyClass buggy = new BuggyClass();
        assertThrows(ArithmeticException.class, () -> buggy.buggyMethod2(-1));
    }

    @Test
    void testBuggyMethod3_SC3() {
        BuggyClass buggy = new BuggyClass();
        buggy.buggyMethod3(0);
        buggy.buggyMethod3(-1);
    }

    @Test
    void testBuggyMethod3_BC3() {
        BuggyClass buggy = new BuggyClass();
        assertThrows(ArithmeticException.class, () -> buggy.buggyMethod3(1));
    }

    @Test
    void testBuggyMethod4_SC4() {
        BuggyClass buggy = new BuggyClass();
        assertThrows(ArithmeticException.class, () -> buggy.buggyMethod4(1));
    }

    @Test
    void testBuggyMethod4_BC4() {
        BuggyClass buggy = new BuggyClass();
        buggy.buggyMethod4(2);
    }

    @Test
    void testBuggyMethod5_SC5() {
        BuggyClass buggy = new BuggyClass();
        buggy.buggyMethod5(0);
    }

    @Test
    void testBuggyMethod5_unreachableFault() {
        BuggyClass buggy = new BuggyClass();
        assertThrows(ArithmeticException.class, () -> buggy.buggyMethod5(1));
    }
}

