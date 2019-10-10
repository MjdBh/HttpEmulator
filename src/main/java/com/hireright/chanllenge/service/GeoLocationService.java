package com.hireright.chanllenge.service;

import com.hireright.chanllenge.data.GeoLocationDao;
import com.hireright.chanllenge.model.GeoLocation;

public class GeoLocationService {

    private GeoLocationDao geoLocationDao = new GeoLocationDao();

    public GeoLocation findByZip(String zip) {

        if (zip == null || zip.equals("")) throw new IllegalArgumentException();

        return geoLocationDao.get(zip);
    }
}
