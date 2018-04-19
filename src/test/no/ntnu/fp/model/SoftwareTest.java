package no.ntnu.fp.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoftwareTest {

    @Test
    public void addPropertyChangeListener() {

    }

    @Test
    public void removePropertyChangeListener() {

    }

    @Test
    public void getSwVersion() {
        Software s = new Software(0, 2, "hola");
        assertEquals(0, s.getSwVersion());
    }

    @Test
    public void setSwVersion() {
        Software s = new Software(0, 2, "hola");
        assertEquals(0, s.getSwVersion());
        s.setSwVersion(1);
        assertEquals(1, s.getSwVersion());

    }

    @Test
    public void getMinorVersion() {
        Software s = new Software(1, 2, "hola");
        assertEquals(2, s.getMinorVersion());
    }

    @Test
    public void setMinorVersion1() {
        Software s = new Software(1, 2, "hola");
        assertEquals(2, s.getMinorVersion());
        s.setMinorVersion(-1);
        assertEquals(-1, s.getMinorVersion());
    }

    @Test
    public void getUrl() {
        Software s = new Software(0, 2, "hola");
        assertEquals("hola", s.getUrl());
    }

    @Test
    public void setUrl() {
        Software s = new Software();
        assertEquals("", s.getUrl());
        s.setUrl("https://www.url.com");
        assertEquals("https://www.url.com", s.getUrl());
    }
    @Test
    public void setUrl1() {
        Software s = new Software();
        assertEquals("", s.getUrl());
        s.setUrl(null);
        assertEquals(null, s.getUrl());
    }
}