package com.hireright.chanllenge.controller.dto;

import java.io.Serializable;


public class WeatherDto implements Serializable {
    private String cityCode;
    private String temperature;
    private String cityName;
    public WeatherDto() { }
    public WeatherDto(String cityCode, String temperature, String cityName) {
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
