package no.ntnu.fp.model;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EcuTest {

    @Test
    public void addPropertyChangeListener() {
        Ecu ecu = new Ecu(666);
    }

    @Test
    public void removePropertyChangeListener() {
        Ecu ecu = new Ecu(666);

    }

    @Test
    public void getEcuId() {
        Ecu ecu = new Ecu(666);
        assertEquals(666, ecu.getEcuId());
    }

    @Test
    public void setEcuId() {
        Ecu ecu = new Ecu(666);
        ecu.setEcuId(777);
        assertEquals(777, ecu.getEcuId());
        assertNotEquals(666, ecu.getEcuId());
    }

    @Test
    public void getSwId() {
        Ecu ecu1 = new Ecu(1, 1, 1);
        assertEquals(1, ecu1.getEcuId());

        Ecu ecu = new Ecu(666);
        assertEquals(0, ecu.getSwId());
    }

    @Test
    public void setSwId() {
        Ecu ecu = new Ecu(666);
        ecu.setSwId(123);
        assertEquals(123, ecu.getSwId());
        assertNotEquals(0, ecu.getSwId());
    }

    @Test
    public void getSubSwId() {
        Ecu ecu = new Ecu(666);
        assertEquals(0, ecu.getSubSwId());
    }

    @Test
    public void setSubSwId() {
        Ecu ecu = new Ecu(666);
        ecu.setSubSwId(122);
        assertEquals(122, ecu.getSubSwId());
        assertNotEquals(0, ecu.getSubSwId());
    }

    @Test
    public void isNewest() {
        Ecu ecu = new Ecu(1, 1, 1, true, 1);
        assertEquals(true, ecu.isNewest());
    }

    @Test
    public void setNewest() {
        Ecu ecu = new Ecu(666);
        ecu.setNewest(true);
        assertEquals(true, ecu.isNewest());
    }

    @Test
    public void getECUID_PROPERTY_NAME() {
        Ecu ecu = new Ecu(666);
        assertEquals("ecuId", ecu.getECUID_PROPERTY_NAME());
    }

    @Test
    public void getNewestSub() {
        Ecu ecu = new Ecu(666);
        assertEquals(0, ecu.getNewestSub());
    }

    @Test
    public void setNewestSub() {
        Ecu ecu = new Ecu(666);
        ecu.setNewestSub(2);
        assertEquals(2, ecu.getNewestSub());

    }
}