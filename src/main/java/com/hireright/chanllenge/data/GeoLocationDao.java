package com.hireright.chanllenge.data;


import com.hireright.chanllenge.model.GeoLocation;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class GeoLocationDao implements BaseDao<GeoLocation> {

    private static Map<String, GeoLocation> repository;

    static {
        repository = new HashMap<String, GeoLocation>();
        repository.put("Ta", new GeoLocation("Ta", "+3:00"));
        repository.put("Ah", new GeoLocation("Ah", "+3:00"));
    }

    public void create(GeoLocation geoLocation) {
        throw new NotImplementedException();
    }

    public GeoLocation update(GeoLocation geoLocation) {
        throw new NotImplementedException();    }

    public void delete(GeoLocation geoLocation) {
        throw new NotImplementedException();
    }

    public GeoLocation get(String zip) {
        if (repository == null)
            throw new IllegalStateException();

        return repository.get(zip);    }
}
