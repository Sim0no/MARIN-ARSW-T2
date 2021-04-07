package edu.eci.arsw.weather.services.impl;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.cache.ICache;
import edu.eci.arsw.weather.entities.*;
import edu.eci.arsw.weather.services.IHttpWeatherDataService;
import edu.eci.arsw.weather.services.IWeatherDataService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class WeatherDataServiceImpl implements IWeatherDataService {


    @Autowired
    private IHttpWeatherDataService apiService;

    @Autowired
    private ICache cache;

    @Override
    public City getDataByCity(String city) throws UnirestException {
        if(cache.get(city)!= null &&  new Date().getTime() - cache.get(city).getY().getTime() <= 50000){
            return cache.get(city).getX();
        }
        City cty = new City();
        Gson gson = new Gson();
        JSONObject info = apiService.getWeatherDataByCity(city);
        String name = gson.fromJson(String.valueOf(info.get("name")), String.class);
        Coor coor = gson.fromJson(String.valueOf(info.getJSONObject("coord")), Coor.class);
        Weather weather = gson.fromJson(String.valueOf(info.getJSONArray("weather").getJSONObject(0)), Weather.class);
        Main main = gson.fromJson(String.valueOf(info.getJSONObject("main")), Main.class);
        Wind wind = gson.fromJson(String.valueOf(info.getJSONObject("wind")), Wind.class);
        Clouds clouds = gson.fromJson(String.valueOf(info.getJSONObject("clouds")), Clouds.class);
        cty.setRelevantStatistics(name,coor,weather,main,wind,clouds);
        cache.put(city,cty);
        return cty;


    }



}
