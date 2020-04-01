package org.dlibj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DlibTest {

    @Test
    public void GetNativeVersion() {
        assertEquals(System.getProperty("DlibDotNetVersion"), Dlib.GetNativeVersion());
    }

}
