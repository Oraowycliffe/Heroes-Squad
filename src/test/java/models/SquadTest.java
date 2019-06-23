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
    public void instance_intanciatesCorrectly_true(){
        Squad testSquad = new Squad("Furious-Four", 4, "Defence");
        assertEquals(true, testSquad instanceof  Squad);

    }
    @After
    public void tearDown() throws Exception {
    }

}