package edu.eci.arsw.weather.entities;

public class Wind {

    private Double speed,deg;

    public Wind(){

    }
    public Wind(Double speed, Double deg){
        this.speed = speed;
        this.deg = deg;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDeg() {
        return deg;
    }

    public void setDeg(Double deg) {
        this.deg = deg;
    }

}
