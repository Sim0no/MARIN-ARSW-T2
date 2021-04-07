package edu.eci.arsw.weather.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.entities.City;

public interface IWeatherDataService {
    City getDataByCity(String city) throws UnirestException;
}
