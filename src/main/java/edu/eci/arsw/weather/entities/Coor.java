package edu.eci.arsw.weather.entities;

public class Coor {
    private Double lon,lat;

    public Coor(){

    }

    public Coor(Double lon, Double lat){
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}
