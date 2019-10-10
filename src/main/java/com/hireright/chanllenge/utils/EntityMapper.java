package com.hireright.chanllenge.utils;

import com.hireright.chanllenge.controller.dto.GeoLocationDto;
import com.hireright.chanllenge.controller.dto.WeatherDto;
import com.hireright.chanllenge.model.GeoLocation;
import com.hireright.chanllenge.model.Weather;

public class EntityMapper {

    public static WeatherDto toWeatherDto(Weather weather){
        if (weather == null) return null;
        return new WeatherDto(weather.getCityCode(),weather.getTemperature(), weather.getCityName());
    }

    public static GeoLocationDto toGeoLocationDto(GeoLocation geoLocation){
        if (geoLocation == null) return null;
        return new GeoLocationDto(geoLocation.getZip(), geoLocation.getTimeZone());
    }
}
