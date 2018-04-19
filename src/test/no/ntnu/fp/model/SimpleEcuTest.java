package no.ntnu.fp.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleEcuTest {

    @Test
    public void addPropertyChangeListener() {
    }

    @Test
    public void removePropertyChangeListener() {
    }

    @Test
    public void getEcuId() {
        SimpleEcu ecu = new SimpleEcu();
        SimpleEcu ecu1 = new SimpleEcu(1);
        SimpleEcu ecu2 = new SimpleEcu(2, 1);
        assertEquals(0, ecu.getEcuId());
        assertEquals(1, ecu1.getEcuId());
        assertEquals(2, ecu2.getEcuId());
    }

    @Test
    public void setEcuId() {
        SimpleEcu ecu = new SimpleEcu();
        assertEquals(0, ecu.getEcuId());
        ecu.setEcuId(1);
        assertEquals(1, ecu.getEcuId());
    }

    @Test
    public void getSwId() {
        SimpleEcu ecu = new SimpleEcu();
        assertEquals(0, ecu.getSwId());
    }

    @Test
    public void setSwId() {
        SimpleEcu ecu = new SimpleEcu();
        assertEquals(0, ecu.getSwId());
        ecu.setSwId(1);
        assertEquals(1, ecu.getSwId());
    }
}