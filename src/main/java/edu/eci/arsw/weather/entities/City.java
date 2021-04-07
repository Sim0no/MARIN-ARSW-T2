package edu.eci.arsw.weather.entities;

import org.apache.catalina.Cluster;

public class City {
    private Coor coor;
    private Weather weather;
    private String base, name;
    private Main main;
    private Integer visibility, dt, timezone, id, cod;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;


    public City(){

    }

    public City(Coor coor, Weather weather, String base, Main main, Integer visibility, Wind wind, Clouds clouds, Integer dt, Sys sys, Integer timezone, Integer id, String name, Integer cod ){
        this.coor = coor;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        //this.dt = dt;
        //this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        //this.cod = cod;

    }

    public Coor getCoor() {
        return coor;
    }

    public void setCoor(Coor coor) {
        this.coor = coor;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public void setRelevantStatistics(String name, Coor coor, Weather weather, Main main, Wind wind, Clouds clouds){
        this.name = name;
        this.coor = coor;
        this.weather = weather;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;

    }
}
