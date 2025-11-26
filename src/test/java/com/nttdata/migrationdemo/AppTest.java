package com.nttdata.migrationdemo;

import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testEncodeBase64() {
        String encoded = App.encodeBase64("NTTData");
        assertEquals("TlRURGF0YQ==", encoded);
    }

    @Test
    public void testOldCollectionExample() {
        Vector<String> v = App.oldCollectionExample();
        assertEquals(2, v.size());
        assertEquals("hola", v.get(0));
        assertEquals("mundo", v.get(1));
    }

    @Test
    public void testLegacyDateNotEmpty() {
        String date = App.formatLegacyDate(new java.util.Date());
        assertTrue(date.length() > 0);
    }
}
