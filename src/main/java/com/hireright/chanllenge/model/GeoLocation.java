package com.hireright.chanllenge.model;

public class GeoLocation {

    private String zip;
    private String timeZone;

    public GeoLocation(String zip, String timeZone) {
        this.zip = zip;
        this.timeZone = timeZone;
    }

    public GeoLocation() {
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
