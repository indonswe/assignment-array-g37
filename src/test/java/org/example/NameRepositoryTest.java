package org.example;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class NameRepositoryTest extends TestCase {
    NameRepository dB = new NameRepository();
    public void setUp() throws Exception {
        super.setUp();

        dB.clear();
        String[] arrayOfNames = {"A B", "C D", "A C", "A D"};
        dB.setNames(arrayOfNames);
    }

    public void testGetSize() {
        int elementNames = dB.getSize();
        int expected = 4;
        assertEquals(expected,elementNames);
    }

    public void testSetNames() {
    }

    public void testClear() {
    }

    public void testAdd() {
        boolean success = dB.add("E F");
        boolean notSuccess = dB.add("A B");
        String expected = "E F";

        String exist = dB.find("E F");

        assertEquals(expected, exist);
        assertTrue(success);
        assertFalse(notSuccess);
    }

    public void testFind() {
        String exist = dB.find("C D");
        String neverExisted = dB.find("G H");

        String expected = "C D";
        String neverExpected = null;

        assertEquals(expected, exist);
        assertEquals(neverExpected, neverExisted);
    }

    public void testFindAll() {
        String[] allNames = dB.findAll();
        String[] expected = {"A B", "C D", "A C", "A D"};

        assertArrayEquals(expected, allNames);
    }

    public void testUpdate() {
        String newName = "I J";
        String oldName = "A B";


        boolean notUpdated = dB.update(newName, oldName);
        boolean noCloneAllowed = dB.update(oldName, "C D");
        boolean upDated = dB.update(oldName,newName);

        assertFalse(notUpdated);
        assertFalse(noCloneAllowed);
        assertTrue(upDated);




    }

    public void testFindByFirstName() {
        String[] exist = dB.findByFirstName("A");
        String[] expected = {"A B", "A C", "A D"};
        assertArrayEquals(expected, exist);
    }

    public void testFindByLastName() {
        String[] exist = dB.findByLastName("D");
        String[] expected = {"C D", "A D"};
        assertArrayEquals(expected, exist);
    }

    public void testRemove() {
        String toBeRemoved = "A B";
        String exist = dB.find(toBeRemoved);
        int elementNames = dB.getSize();
        int expected = 4;

        assertEquals(exist, "A B");
        assertEquals(expected,elementNames);
        boolean erase = dB.remove(toBeRemoved);

        expected = 3;
        elementNames = dB.getSize();
        assertEquals(expected,elementNames);

        exist = dB.find(toBeRemoved);
        assertNull(exist);
        assertTrue(erase);

    }
}