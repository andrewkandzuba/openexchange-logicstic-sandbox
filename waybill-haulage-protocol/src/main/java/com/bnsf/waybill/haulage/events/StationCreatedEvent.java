package com.bnsf.waybill.haulage.events;

import java.util.Objects;

public class StationCreatedEvent {
    private String code;

    public StationCreatedEvent() {
    }

    public StationCreatedEvent(String code) {
        this.code = Objects.requireNonNull(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
