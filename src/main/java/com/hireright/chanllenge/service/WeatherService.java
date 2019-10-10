package com.hireright.chanllenge.service;

import com.hireright.chanllenge.data.WeatherDao;
import com.hireright.chanllenge.model.Weather;

public class WeatherService {

    private WeatherDao weatherDao = new WeatherDao();

    public Weather findByCityCode(String cityCode) {

        if (cityCode == null || cityCode.equals("")) throw new IllegalArgumentException();

        return weatherDao.get(cityCode);
    }
}
