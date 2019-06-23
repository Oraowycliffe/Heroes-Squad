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
        Hero testHero = new Hero("Spider-man", 20, "Speed","Shy");
        assertEquals("Spider-man", testHero.getName());
    }
    @Test
    public void RetrieveTheAge_getsAge_Age(){
        Hero testHero = new Hero("Spider-man", 20, "Speed","Shy");
        assertEquals(20, testHero.getAge());
    }
    @Test
    public void RetrieveTheStrength_getsStrength_Strength(){
        Hero testHero = new Hero("Spider-man", 20, "Speed","Shy");
        assertEquals("Speed", testHero.getStrength());
    }
    @Test
    public void RetrieveTheWeakness_getsWeakness_Weakness(){
        Hero testHero = new Hero("Spider-man", 20, "Speed","Shy");
        assertEquals("Shy", testHero.getWeakness());
    }
    @Test
    public void AddedToTheArrayList_getsAdded_true(){

        Hero testHero = new Hero("Spider-man", 20, "Speed","Shy");
        assertEquals("Shy", testHero.getWeakness());
    }
    @Test
    public void all_ReturnsAllInstances_true(){
        Hero testHero1 = new Hero("Hulk", 40, "Smashing","Afraid of ladies");
        Hero testHero2 = new Hero ("Flash",21, "Lightning","Talks a lot");
        assertEquals(true, Hero.all().contains(testHero1));
        assertEquals(true, Hero.all().contains(testHero2));

    }
    @Test
    public void clear_removesAllTheInstancesOfClassHero_0(){
        Hero testHero1 = new Hero("Hulk", 40, "Smashing","Afraid of ladies");
        Hero testHero2 = new Hero ("Flash",21, "Lightning","Talks a lot");
        Hero.clear();
        assertEquals(0, Hero.all().size());
    }
    @Test
    public void get_RetrievesSpecificIdOfAHero_1(){
        Hero.clear();
        Hero testHero2 = new Hero ("Flash",21, "Lightning","Talks a lot");
        assertEquals(1, testHero2.getId());
    }
    @Test
    public void find_RetrievesSpecificId_testHero1(){
        Hero.clear();
        Hero testHero1 = new Hero("Hulk", 40, "Smashing","Afraid of ladies");
        assertEquals(testHero1, Hero.find(testHero1.getId()));
    }
    @After
    public void tearDown() throws Exception {
    }
}