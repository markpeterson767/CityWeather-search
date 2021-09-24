package com.example.weatherrecyclerviewretrofitmytry.models;

import com.google.gson.annotations.SerializedName;

public class Coords {

    @SerializedName("lon")
    double lon;

    @SerializedName("lat")
    double lat;

    @Override
    public String toString() {
//        return "Coords{" +
//                "lon=" + lon +
//                ", lat=" + lat +
//                '}';
        return "("+lon + "," + lat +  ")";
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
