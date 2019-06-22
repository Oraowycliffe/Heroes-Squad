package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void initiates_initiatesNew_true(){
        Hero testHero = new Hero("Spiderman", 20, "Speed","Shy");
        assertEquals(true, testHero instanceof Hero);
    }
    @Test
    public void RetrieveThename_getsName_name(){
        Hero testHero = new Hero("Spiderman", 20, "Speed","Shy");
        assertEquals("Spiderman", testHero.getName());
    }

    @After
    public void tearDown() throws Exception {
    }
}