package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void instance_instanciateCorrectly_true(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals(true, testSquad instanceof  Squad);
    }

    @Test
    public void getName_retrievesNameOfSquad_name(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals("Furious-Four", testSquad.getName());
    }
    @Test
    public void getSize_retrievesSizeOfSquad_size(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals(4, testSquad.getSize());
    }
    @Test
    public void getReason_retrievesReasonOfSquadFormation_reason(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals("Defence", testSquad.getReason());
    }
    @Test
    public void all_retrievesAllOfSquadInstances_true(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        Squad testSquad2 = new Squad("Hawaii-Five", 5, "Kill");
        assertEquals(true, Squad.all().contains(testSquad));
        assertEquals(true, Squad.all().contains(testSquad2));
    }
    @Test
    public void clear_clearsThArrayListContainingTheSquadInstances_0(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        Squad testSquad2 = new Squad("Hawaii-Five", 5, "Kill");
        Squad.clear();
        assertEquals(0, Squad.all().size());
    }
    @Test
    public void getId_retrievesTheIdOfSquad_1(){
        Squad.clear();
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals(1, testSquad.getId());
    }
    @Test
    public void find_retrievesAnInstanceGivenTheId_testHero(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals(testSquad, Squad.find(testSquad.getId()));
    }

    @Test
    public void getHeroes_returnsNoHeroAtStart_0(){
        Squad.clear();//removes all the instances of Squad
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals(0, testSquad.getHeroes().size());
    }
    @Test
    public void addHero_AddsNewHeroToTheSquad_1(){
        Squad.clear();
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        Hero testHero = new Hero("Spider-man", 20, "JUmping", "Shy");
        testSquad.addHero(testHero);
        assertEquals(1,testSquad.getHeroes().size());
    }
    @Test
    public void heroExist_ensuresOneHeroAtATime_true(){
        Squad.clear();
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        Hero testHero = new Hero("Spider-man", 20, "JUmping", "Shy");
        testSquad.addHero(testHero);
        assertEquals(true, testSquad.heroExist(testHero));
        
    }


    @After
    public void tearDown() throws Exception {
    }

}