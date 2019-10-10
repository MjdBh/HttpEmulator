package com.hireright.chanllenge.data;

import com.hireright.chanllenge.model.Weather;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class WeatherDao implements BaseDao<Weather> {
    private static Map<String, Weather> repository;

    static {

        repository = new HashMap<String, Weather>();
        repository.put("Ta",new Weather("Ta","20","Tallinn"));
        repository.put("Ne",new Weather("Ne","50","New York"));
        repository.put("Am",new Weather("Am","10","Amsterdam"));
    }

    public void create(Weather weather) {
        throw new NotImplementedException();
    }

    public Weather update(Weather weather) {
        throw new NotImplementedException();
    }

    public void delete(Weather weather) {
        throw new NotImplementedException();
    }

    public Weather get(String cityCode) {
        if (repository == null)
            throw new IllegalStateException();
        return repository.get(cityCode);
    }
}
