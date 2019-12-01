package org.oscar.algo.link03;

import org.junit.Before;
import org.junit.Test;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-11-29
 */
public class SimplySingleLinkTest {

    private SimplySingleLink<Integer> link;

    @Before
    public void setUp() {
        link = new SimplySingleLink<>();
    }

    @Test
    public void testPrintAll() {
        link.insertTail(0);
        link.insertTail(1);
        link.insertTail(2);
        link.insertTail(3);
        link.printAll();
        System.out.println("--------------------");
        link.printAll();
    }

    @Test
    public void insertHead() {
        link.insertHead(3);
        link.insertHead(2);
        link.insertHead(1);
        link.insertHead(0);
        link.printAll();
    }

    @Test
    public void insertHeadWrong() {
        link.insertHeadWrong(3);
        link.insertHeadWrong(2);
        link.insertHeadWrong(1);
        link.insertHeadWrong(0);
        link.printAll();
    }
}