package com.example.weatherrecyclerviewretrofitmytry.models;

import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    double temp;

    @SerializedName("feels_like")
    double feels_like;

    @SerializedName("temp_min")
    double temp_min;

    @SerializedName("temp_max")
    double temp_max;

    @SerializedName("pressure")
    int pressure;

    @SerializedName("humidity")
    int humidity;


    //
    //
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}

