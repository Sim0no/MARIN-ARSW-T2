package edu.eci.arsw.weather.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public interface IHttpWeatherDataService {
    public JSONObject getWeatherDataByCity(String city) throws UnirestException;
}
