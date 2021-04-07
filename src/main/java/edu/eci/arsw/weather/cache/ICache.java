package edu.eci.arsw.weather.cache;

import edu.eci.arsw.weather.entities.City;

import java.util.Date;

public interface ICache {
    void put(String name, City city);

    Tuple<City, Date> get(String city);

    long getTime(String city);
}
