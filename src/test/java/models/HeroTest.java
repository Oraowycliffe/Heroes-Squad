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
    public void RetrieveTheName_getsName_name(){
        Hero testHero = new Hero("Spiderman", 20, "Speed","Shy");
        assertEquals("Spiderman", testHero.getName());
    }
    @Test
    public void RetrieveTheAge_getsAge_Age(){
        Hero testHero = new Hero("Spiderman", 20, "Speed","Shy");
        assertEquals(20, testHero.getAge());
    }
    @Test
    public void RetrieveTheStrength_getsStrength_Strength(){
        Hero testHero = new Hero("Spiderman", 20, "Speed","Shy");
        assertEquals("Speed", testHero.getStrength());
    }
    @Test
    public void RetrieveTheWeakness_getsWeakness_Weakness(){
        Hero testHero = new Hero("Spiderman", 20, "Speed","Shy");
        assertEquals("Shy", testHero.getWeakness());
    }

    @After
    public void tearDown() throws Exception {
    }
}