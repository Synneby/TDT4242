package no.ntnu.fp.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProjectTest {

    @Test
    public void getPersonCount() {
        Project p = new Project();
        assertEquals(0, p.getPersonCount());
    }

    @Test
    public void getLargestCustId() {
        Project p = new Project();
        p.addPerson(new Person(998));
        p.addPerson(new Person(999));
        assertEquals(999, p.getLargestCustId());
    }

    @Test
    public void getLargestCustIdFAIL() {
        Project p = new Project();
        assertEquals(0, p.getLargestCustId());
    }

    @Test
    public void getPerson() {
        Project p = new Project();
        Person person = new Person(1);
        p.addPerson(person);

        assertEquals(person, p.getPerson(0));
    }

    @Test
    public void getPersonIndex() {
        Project p = new Project();
        Person person = new Person(1);
        person.setName("Synne Byre");
        p.addPerson(person);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);

        assertEquals(expected, p.getPersonIndex("Synne Byre"));
    }

    @Test
    public void getPersonIndex1() {
        Project p = new Project();

        Person person1 = new Person(1);
        Person person2 = new Person(2);

        person1.setVehicleID("123");
        person2.setVehicleID("456");

        p.addPerson(person1);
        p.addPerson(person2);

        assertEquals(0, p.getPersonIndex(123));
    }

    @Test
    public void getPersonIndex1FAIL() {
        Project p = new Project();
        assertEquals(-1, p.getPersonIndex(123));
    }

    @Test
    public void indexOf() {
        Project p = new Project();
        Person person = new Person(1);

        assertEquals(-1, p.indexOf(person));
        p.addPerson(person);
        assertEquals(0, p.indexOf(person));
    }

    @Test
    public void iterator() {
    }

    @Test
    public void addPerson() {
        Project p = new Project();
        assertEquals(0, p.getPersonCount());
        p.addPerson(new Person(1));
        assertEquals(1, p.getPersonCount());
    }

    @Test
    public void contains() {
        Project p = new Project();
        Person person = new Person(1);

        assertFalse(p.contains(person));
        p.addPerson(person);
        assertTrue(p.contains(person));
    }

    @Test
    public void removePerson() {
        Project p = new Project();
        Person person = new Person(1);
        p.addPerson(person);

        assertEquals(0, p.indexOf(person));
        p.removePerson(person);
        assertEquals(-1, p.indexOf(person));
    }

    @Test
    public void addPropertyChangeListener() {
        Project p = new Project();
    }

    @Test
    public void removePropertyChangeListener() {
        Project p = new Project();
    }

    @Test
    public void propertyChange() {
        Project p = new Project();
    }

    @Test
    public void equals() {
        Project p = new Project();
        Project p1 = new Project();
        p1.addPerson(new Person(1));
        assertFalse(p.equals(p1));
        assertTrue(p.equals(p));
    }

    @Test
    public void equals1() {
        Project p = new Project();
        Project p1 = new Project();
        p1.addPerson(new Person(1));
        p.addPerson(new Person(2));
        assertEquals(true, p1.equals(p));
    }

    @Test
    public void equals2() {
        Project p = new Project();
        Person mordi = new Person(1);
        assertEquals(false, p.equals(mordi));
    }

    @Test
    public void equals3() {
        Project p = new Project();
        Project p1 = new Project();
        Person pers = new Person(1);
        Person pers1 = new Person(2);
        pers.setName("Synne Byre");
        p.addPerson(pers);
        p1.addPerson(pers1);

        assertEquals(false, p.equals(p1));
    }

    @Test
    public void toStringTest() {
        Project p = new Project();
        Person pers = new Person(1);
        p.addPerson(pers);
        assertEquals("project:\nName: ; Email: ; Street: \n", p.toString());
    }
}
