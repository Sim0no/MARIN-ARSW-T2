package edu.eci.arsw.weather.controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.weather.entities.City;
import edu.eci.arsw.weather.services.IWeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WeatherDataController {
    @Autowired
    private IWeatherDataService weatherDataService;

    @GetMapping("/weather/{city}")
    public ResponseEntity<?> getWeatherDataByCity(@PathVariable String city){
        try {
            City cty = weatherDataService.getDataByCity(city);
            return new ResponseEntity<>(cty,HttpStatus.OK);
        } catch (UnirestException e) {
            return  new ResponseEntity<>(e, HttpStatus.FORBIDDEN);
        }
    }

}
