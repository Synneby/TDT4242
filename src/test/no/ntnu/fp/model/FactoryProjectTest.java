package no.ntnu.fp.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class FactoryProjectTest {

    @Test
    public void getVehicleCount() {
        FactoryProject f = new FactoryProject();
        assertEquals(0, f.getVehicleCount());

        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();

        FactoryProject f1 = new FactoryProject(arr, arr1, arr2);
        assertEquals(0, f1.getVehicleCount());

    }

    @Test
    public void getSoftwareCount() {
        FactoryProject f = new FactoryProject();
        assertEquals(0, f.getSoftwareCount());
    }

    @Test
    public void getVehicle() {
        FactoryProject f = new FactoryProject();
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();

        f.addVehicle(v);
        f.addVehicle(v1);

        assertEquals(v1, f.getVehicle(1));
    }

    @Test
    public void getSoftware() {
        FactoryProject f = new FactoryProject();
        Software s = new Software();
        Software s1 = new Software();

        f.addSoftware(s);
        f.addSoftware(s1);

        assertEquals(s1, f.getSoftware(1));
    }

    @Test
    public void getEcuCount() {
        SimpleEcu s = new SimpleEcu(1);
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();
        arr2.add(s);
        FactoryProject f = new FactoryProject(arr, arr1, arr2);
        assertEquals(1, f.getEcuCount());
    }

    @Test
    public void getLatestSoftware() {
        FactoryProject f = new FactoryProject();
        Software s = new Software();
        Software s1 = new Software();

        f.addSoftware(s);
        f.addSoftware(s1);

        assertEquals(s1, f.getLatestSoftware());
    }

    @Test
    public void getLatestVehicle() {
        FactoryProject f = new FactoryProject();
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();

        f.addVehicle(v);
        f.addVehicle(v1);

        assertEquals(v1, f.getLatestVehicle());
    }

    @Test
    public void getLatestEcu() {
        FactoryProject f = new FactoryProject();
        SimpleEcu e = new SimpleEcu();
        SimpleEcu e1 = new SimpleEcu();

        f.addEcu(e);
        f.addEcu(e1);

        assertEquals(e1, f.getLatestEcu());

    }

    @Test
    public void getSoftwareIndex() {
        ArrayList arr = new ArrayList();
        FactoryProject f = new FactoryProject(arr, arr, arr);
        Software s = new Software();
        Software s1 = new Software();

        f.addSoftware(s);
        f.addSoftware(s1);

        assertEquals(1, f.getSoftwareIndex(s1));
    }

    @Test
    public void getEcu() {
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();
        FactoryProject f = new FactoryProject(arr, arr1, arr2);
        SimpleEcu e = new SimpleEcu();
        SimpleEcu e1 = new SimpleEcu();

        f.addEcu(e);
        f.addEcu(e1);
        assertEquals(e1, f.getEcu(1));
    }

    @Test
    public void getVehicleIndex() {
        FactoryProject f = new FactoryProject();
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();

        v.setVehicleID("right");
        v1.setVehicleID("wrong");

        f.addVehicle(v);
        f.addVehicle(v1);

        assertEquals(0, f.getVehicleIndex("right"));
        assertEquals(-1, f.getVehicleIndex("index does not exist"));
    }

    @Test
    public void indexOf() {
        FactoryProject f = new FactoryProject();
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();

        f.addVehicle(v);
        f.addVehicle(v1);

        assertEquals(0, f.indexOf(v));

    }

    @Test
    public void iterator() {
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();

        FactoryProject f = new FactoryProject(arr, arr1, arr2);
        Iterator itr = arr.iterator();

        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();

        f.addVehicle(v);
        f.addVehicle(v1);
        System.out.println(itr.hasNext());
        assertEquals(true, itr.hasNext());

        System.out.println(f.toString());
        System.out.println(f.iterator().toString());
    }

    @Test
    public void addVehicle() {
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();
        FactoryProject f = new FactoryProject(arr, arr1, arr2);
        Vehicle v = new Vehicle();
        f.addVehicle(v);
        assertEquals(v, f.getLatestVehicle());
    }

    @Test
    public void addVehicleTest() {
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();
        FactoryProject f = new FactoryProject(arr, arr1, arr2);
        Vehicle v = new Vehicle();
        f.addVehicle(v);
        assertEquals(v, f.getLatestVehicle());
    }

    @Test
    public void addSoftware() {
        ArrayList arr = new ArrayList();
        FactoryProject f = new FactoryProject(arr, arr, arr);
        Software s = new Software();
        f.addSoftware(s);
        assertEquals(s, f.getLatestSoftware());

    }

    @Test
    public void addEcu() {
        ArrayList arr = new ArrayList();
        FactoryProject f = new FactoryProject(arr, arr, arr);
        SimpleEcu e = new SimpleEcu();
        f.addEcu(e);
        assertEquals(e, f.getLatestEcu());
    }

    @Test
    public void removeVehicle() {
        ArrayList arr = new ArrayList();
        FactoryProject f = new FactoryProject(arr, arr, arr);
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();

        f.addVehicle(v);
        f.addVehicle(v1);
        f.removeVehicle(v);
        assertEquals(v1, f.getVehicle(0));
    }

    @Test
    public void addPropertyChangeListener() {
        FactoryProject f = new FactoryProject();
    }

    @Test
    public void removePropertyChangeListener() {
        FactoryProject f = new FactoryProject();
    }

    @Test
    public void propertyChange() {
        FactoryProject f = new FactoryProject();
    }

    @Test
    public void equals() {
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();
        FactoryProject f = new FactoryProject(arr, arr1, arr2);
        FactoryProject f1 = new FactoryProject(arr, arr1, arr2);
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();
        f.addVehicle(v);
        f1.addVehicle(v);

        assertEquals(true, f.equals(f1));
    }

    @Test
    public void notEquals() {
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList<SimpleEcu> arr2 = new ArrayList<SimpleEcu>();
        FactoryProject f = new FactoryProject(arr, arr1, arr2);
        FactoryProject f1 = new FactoryProject(arr1, arr1, arr2);
        Vehicle v = new Vehicle();
        f.addVehicle(v);

        assertEquals(false, f.equals(f1));
    }
    @Test
    public void notEquals1() {
        ArrayList arr = new ArrayList();
        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();
        ArrayList<SimpleEcu> arr3 = new ArrayList<SimpleEcu>();
        FactoryProject f = new FactoryProject(arr, arr2, arr3);
        FactoryProject f1 = new FactoryProject(arr1, arr2, arr3);
        Vehicle v = new Vehicle();
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        f.addVehicle(v);
        f.addVehicle(v1);
        f1.addVehicle(v);
        f1.addVehicle(v2);

        assertEquals(false, f.equals(f1));
    }

    @Test
    public void notEquals2() {
        FactoryProject f = new FactoryProject();
        Vehicle v = new Vehicle();
        assertEquals(false, f.equals(v));
    }

}