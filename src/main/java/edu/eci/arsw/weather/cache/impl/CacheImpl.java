package edu.eci.arsw.weather.cache.impl;

import edu.eci.arsw.weather.cache.ICache;
import edu.eci.arsw.weather.cache.Tuple;
import edu.eci.arsw.weather.entities.City;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CacheImpl implements ICache {


    private ConcurrentHashMap<String, Tuple<City, Date>> cache = new ConcurrentHashMap<>();;


    @Override
    public void put(String name, City city) {
        cache.put(name,  new Tuple<>(city, new Date()));


    }

    @Override
    public Tuple<City, Date> get(String city) {
        return cache.get(city);
    }

    @Override
    public long getTime(String city) {
        long d;
        if(cache.get(city) == null){
            d = new Date().getTime();
        }
        else{
            d = cache.get(city).getY().getTime();
        }

        return d;
    }
}
