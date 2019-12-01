package org.oscar.algo.link03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-11-29
 */
public class SbSingleLinkTest {

    private SbSingleLink<Integer> link;

    @Before
    public void setUp() {
        link = new SbSingleLink<>();
    }

    @Test
    public void add() {
        link.add(0);
        link.add(1);
        link.add(2);
        link.add(3);

    }
}