package com.hireright.chanllenge.controller.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GeoLocationDto {
    private String zip;
    private String timeZone;

    public GeoLocationDto(String zip, String timeZone) {
        this.zip = zip;
        this.timeZone = timeZone;
    }

    public GeoLocationDto() { }
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
