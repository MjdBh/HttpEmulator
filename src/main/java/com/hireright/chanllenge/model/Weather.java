package com.hireright.chanllenge.model;

public class Weather {

    private String cityCode;
    private String temperature;
    private String cityName;

    public Weather() {
    }

    public Weather(String cityCode, String temperature, String cityName) {
        this.cityCode = cityCode;
        this.temperature = temperature;
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
