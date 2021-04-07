package edu.eci.arsw.weather.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.services.IHttpWeatherDataService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class HttpWeatherDataServiceImpl implements IHttpWeatherDataService {
    @Override
    public JSONObject getWeatherDataByCity(String city) throws UnirestException {
        HttpResponse<String> ans = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=3048f7fb6a05421591dd45542cc1480a").asString();
        return  new JSONObject(ans.getBody());

    }

}
