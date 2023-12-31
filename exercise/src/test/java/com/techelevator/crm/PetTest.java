package com.techelevator.crm;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;

public class PetTest {
    @Test
    public void test_vaccinations() {
        Pet toTest = new Pet("bo", "dog");
        ArrayList<String> vaccines = new ArrayList<String>();
        assertEquals("should return empty list for no vaccines", "", toTest.listVaccinations());
        vaccines.add("mmr");
        toTest.setVaccinations(vaccines);
        assertEquals("Should return only one vaccine: ", "mmr", toTest.listVaccinations());
        vaccines.add("polio");
        vaccines.add("flu");
        toTest.setVaccinations(vaccines);
        assertEquals("Should return expected: ", "mmr, polio, flu", toTest.listVaccinations());
    }
}
