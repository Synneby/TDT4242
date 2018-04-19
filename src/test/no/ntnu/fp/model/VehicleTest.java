package no.ntnu.fp.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VehicleTest {

    @Test
    public void getEcuCount() {
        ArrayList arr= new ArrayList();
        Vehicle v = new Vehicle("id", "hlog",arr ,"series");
        assertEquals(0, v.getEcuCount());
    }

    @Test
    public void getEcu() {
        Vehicle v = new Vehicle();
        Ecu ecu = new Ecu(1);
        v.addEcu(ecu);
        assertEquals(ecu, v.getEcu(0));
    }

    @Test
    public void addEcu() {
        Vehicle v = new Vehicle();
        Ecu ecu = new Ecu(1);

        assertEquals(0, v.getEcuCount());
        v.addEcu(ecu);
        assertEquals(1, v.getEcuCount());
    }

    @Test
    public void removeEcu() {
        Vehicle v = new Vehicle();
        Ecu ecu = new Ecu(1, 2, 3, true, 4);

        v.addEcu(ecu);
        assertEquals(1, v.getEcuCount());
        v.removeEcu(ecu);
        assertEquals(0, v.getEcuCount());
    }

    @Test
    public void getLargestEcuId() {
        Vehicle v = new Vehicle();
        Ecu ecu1 = new Ecu(998);
        Ecu ecu2 = new Ecu(999);

        v.addEcu(ecu1);
        v.addEcu(ecu2);

        assertEquals(999, v.getLargestEcuId());
    }

    @Test
    public void getLargestEcuId1() {
        Vehicle v = new Vehicle();
        Ecu ecu2 = new Ecu(999);
        assertEquals(0, v.getLargestEcuId());
    }

    @Test
    public void contains() {
        Vehicle v = new Vehicle();
        Ecu ecu = new Ecu(1);

        v.addEcu(ecu);

        assertTrue(v.contains(ecu));
    }

    @Test
    public void addPropertyChangeListener() {
        // no idea what i'm trying to do here, just delete this method
       /* PropertyChangeSupport pcs = new PropertyChangeSupport(this);
        PropertyChangeListener pcl = new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {

            }
        };

        SimpleEcu ecu = new SimpleEcu();
        ecu.addPropertyChangeListener(pcl);
        assertEquals("[]", Arrays.toString(pcs.getPropertyChangeListeners("evt")));
   */
    }

    @Test
    public void removePropertyChangeListener() {
        // idk
    }

    @Test
    public void getVehicleID() {
        Vehicle v = new Vehicle();
        v.setVehicleID("999");
        assertEquals("999", v.getVehicleID());
    }

    @Test
    public void findDot() {
        Vehicle v = new Vehicle();
        String dot3 = "---.---."; // dot in pos 3
        String dot6 = "------."; // dot in pos 6
        assertEquals(3, v.findDot(dot3));
        assertEquals(6, v.findDot(dot6));
    }

    @Test
    public void findDot1() {
        Vehicle v = new Vehicle();
        String dot3 = "------"; // dot in pos 3
        String dot6 = "------."; // dot in pos 6
        assertEquals(-1, v.findDot(dot3));
        assertEquals(6, v.findDot(dot6));
    }

    @Test
    public void setVehicleID() {
        Vehicle v = new Vehicle();
        assertEquals("", v.getVehicleID());
        v.setVehicleID("123");
        assertEquals("123", v.getVehicleID());
    }

    @Test
    public void getHistoryLog() {
        Vehicle v = new Vehicle();
        assertEquals("", v.getHistoryLog());
    }

    @Test
    public void setHistoryLog() {
        Vehicle v = new Vehicle();
        assertEquals("", v.getHistoryLog());
        v.setHistoryLog("history");
        assertEquals("history", v.getHistoryLog());
    }

    @Test
    public void getEcus() {
        Vehicle v = new Vehicle();
        Ecu ecu1 = new Ecu(1);
        Ecu ecu2 = new Ecu(2);
        ArrayList<Ecu> expectedEcus = new ArrayList<>();

        v.addEcu(ecu1);
        v.addEcu(ecu2);
        expectedEcus.add(ecu1);
        expectedEcus.add(ecu2);

        assertEquals(expectedEcus, v.getEcus());
    }

    @Test
    public void setEcus() {
        Vehicle v = new Vehicle();
        Ecu ecu1 = new Ecu(1);
        Ecu ecu2 = new Ecu(2);
        ArrayList<Ecu> ecuList = new ArrayList<>();

        ecuList.add(ecu1);
        ecuList.add(ecu2);

        v.setEcus(ecuList);

        assertEquals(ecuList, v.getEcus());
    }

    @Test
    public void indexOf() {
        Vehicle v = new Vehicle();
        Ecu ecu = new Ecu(1);
        assertEquals(-1, v.indexOf(ecu));
        v.addEcu(ecu);
        assertEquals(0, v.indexOf(ecu));
    }

    @Test
    public void getSeries() {
        Vehicle v = new Vehicle();
        assertEquals("", v.getSeries());
    }

    @Test
    public void setSeries() {
        Vehicle v = new Vehicle();
        assertEquals("", v.getSeries());
        v.setSeries("series");
        assertEquals("series", v.getSeries());
    }

    @Test
    public void propertyChange() {
        Vehicle v = new Vehicle();

    }

    @Test
    public void iterator() {
        Vehicle v = new Vehicle();

    }
}