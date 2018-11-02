package com.bnsf.waybill.haulage.events;

import org.junit.Assert;
import org.junit.Test;

public class StationCreatedEventTest {

    @Test
    public void constructorSuccess() {
        StationCreatedEvent e = new StationCreatedEvent("FTW");
        Assert.assertEquals("FTW", e.getCode());
    }
}
