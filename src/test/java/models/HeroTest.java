package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void initiates_initiatesNew_true(){
        Hero testHero = new Hero("spiderman",20,"Web","shy");
        assertEquals(true, testHero instanceof Hero);
    }

    @After
    public void tearDown() throws Exception {
    }
}