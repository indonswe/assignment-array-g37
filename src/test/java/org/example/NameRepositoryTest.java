package org.example;

import junit.framework.TestCase;

public class NameRepositoryTest extends TestCase {
    NameRepository dB = new NameRepository();
    public void setUp() throws Exception {
        super.setUp();

        String[] arrayOfNames = {"A B", "C D"};

        dB.setNames(arrayOfNames);
    }

    public void testGetSize() {
        int elementNames = dB.getSize();
        int expected = 2;
        assertEquals(expected,elementNames);
    }

    public void testSetNames() {
    }

    public void testClear() {
    }

    public void testAdd() {
    }

    public void testFind() {
    }

    public void testFindAll() {
    }

    public void testUpdate() {
    }

    public void testFindByFirstName() {
    }

    public void testFindByLastName() {
    }

    public void testRemove() {
    }
}