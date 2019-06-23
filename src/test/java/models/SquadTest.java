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



    @After
    public void tearDown() throws Exception {
    }

}