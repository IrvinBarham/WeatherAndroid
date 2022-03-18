package com.example.openweatherapp;

import java.io.Serializable;
import java.util.List;

public class Forecasthourly implements Serializable {
    long dt;
    int temp;
    List<Weatherdata> weather;
    double pop;

    public Forecasthourly() {
    }

    public Forecasthourly(long dt, int temp, List<Weatherdata> weather, double pop) {
        this.dt = dt;
        this.temp = temp;
        this.weather = weather;
        this.pop = pop;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public List<Weatherdata> getWeather() {
        return weather;
    }

    public void setWeather(List<Weatherdata> weather) {
        this.weather = weather;
    }

    public double getPop() {
        return pop;
    }

    public void setPop(double pop) {
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Forecasthourly{" +
                "dt=" + dt +
                ", temp=" + temp +
                ", weather=" + weather +
                '}';
    }
}