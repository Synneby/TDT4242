package no.ntnu.fp.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void setName() {
        Person p = new Person(123);
        assertEquals("", p.getName());

        p.setName("Synne");
        assertEquals("Synne", p.getName());

        Person p1 = new Person(1, "Synne", "email", "Trondheim", "Trondheim", "hola");
        p1.setName("Synne");
        assertEquals("Synne", p1.getName());
    }

    @Test
    public void setEmail() {
        Person p = new Person(123);
        p.setEmail("synne.byre@gmail.com");
        assertEquals("synne.byre@gmail.com", p.getEmail());
    }

    @Test
    public void setStreet() {
        Person p = new Person(123);
        p.setStreet("Trondheim");
        assertEquals("Trondheim", p.getStreet());
    }

    @Test
    public void getName() {
        Person p = new Person(123);
        p.setName("Synne");
        assertEquals("Synne", p.getName());
    }

    @Test
    public void getEmail() {
        Person p = new Person(123);
        p.setEmail("synne.byre@gmail.com");
        assertEquals("synne.byre@gmail.com", p.getEmail());
    }

    @Test
    public void getStreet() {
        Person p = new Person(123);
        p.setStreet("Trondheim");
        assertEquals("Trondheim", p.getStreet());
    }

    @Test
    public void getId() {
        Person p = new Person(123);
        assertEquals(System.currentTimeMillis(), p.getId());
    }

    @Test
    public void addPropertyChangeListener() {
        Person p = new Person(123);
    }

    @Test
    public void removePropertyChangeListener() {
        Person p = new Person(123);
    }

    @Test
    public void equals(){
        Person p = new Person(123);
        Person p2 = new Person(124);
        //p.setStreet("Trondheim");

        assertEquals(true, p.equals(p2));
    }

    @Test
    public void equalsNameException() {
        Person p1 = new Person(1, "Synne", "email", "Trondheim", "Trondheim", "vehicle1");
        Person p2 = new Person(2, "Håkon", "email", "Trondheim", "Trondheim", "vehicle1");

        assertEquals(false, p1.equals(p2));
    }

    @Test
    public void equalsMailException() {
        Person p1 = new Person(1, "Synne", "email", "Trondheim", "Trondheim", "vehicle1");
        Person p2 = new Person(2, "Synne", "notemail", "Trondheim", "Trondheim", "vehicle1");

        assertEquals(false, p1.equals(p2));
    }

    @Test
    public void equalsStreetException() {
        Person p1 = new Person(1, "Synne", "email", "Trondheim", "Trondheim", "vehicle1");
        Person p2 = new Person(2, "Synne", "email", "nottrondheim", "Trondheim", "vehicle1");

        assertEquals(false, p1.equals(p2));
    }

    @Test
    public void testToString(){
        Person p1 = new Person(123);
        p1.setName("Synne");
        p1.setEmail("lol");
        p1.setStreet("yoyo");
        assertEquals("Name: Synne; Email: lol; Street: yoyo", p1.toString());
    }

    @Test
    public void getCity() {
        Person p = new Person(123);
        p.setCity("Trondheim");
        assertEquals("Trondheim", p.getCity());

    }

    @Test
    public void setCity() {
        Person p = new Person(123);
        p.setCity("Trondheim");
        assertEquals("Trondheim", p.getCity());

    }

    @Test
    public void getVehicleID() {
        Person p = new Person(123);
        p.setVehicleID("Trondheim");
        assertEquals("Trondheim", p.getVehicleID());

    }

    @Test
    public void setVehicleID() {
        Person p = new Person(123);
        p.setVehicleID("Trondheim");
        assertEquals("Trondheim", p.getVehicleID());

    }

    @Test
    public void getCustId() {
        Person p = new Person(123);
        assertEquals(123, p.getCustId());
    }

    @Test
    public void setCustId(){
        Person p = new Person(123);
        p.setCustId(1);
        assertEquals(1, p.getCustId());

    }

}