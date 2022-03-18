package com.example.openweatherapp;

import java.io.Serializable;
import java.util.List;

public class Daily implements Serializable {
    long dt;
    Forecast temp;
    List<Weatherdata> weather;
    int pop;
    int uvi;

    public Daily() {
    }

    public Daily(long dt, Forecast temp, List<Weatherdata> weather, int pop, int uvi) {
        this.dt = dt;
        this.temp = temp;
        this.weather = weather;
        this.pop = pop;
        this.uvi = uvi;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Forecast getTemp() {
        return temp;
    }

    public void setTemp(Forecast temp) {
        this.temp = temp;
    }

    public List<Weatherdata> getWeather() {
        return weather;
    }

    public void setWeather(List<Weatherdata> weather) {
        this.weather = weather;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getUvi() {
        return uvi;
    }

    public void setUvi(int uvi) {
        this.uvi = uvi;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "dt=" + dt +
                ", temp=" + temp +
                ", weather=" + weather +
                ", pop=" + pop +
                ", uvi=" + uvi +
                '}';
    }
}