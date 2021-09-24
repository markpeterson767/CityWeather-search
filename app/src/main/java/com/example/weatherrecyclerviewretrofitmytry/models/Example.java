package com.example.weatherrecyclerviewretrofitmytry.models;

import com.google.gson.annotations.SerializedName;

// This is the parent model class
public class Example {

    @SerializedName("dt")
    long dt;

    @SerializedName("id")
    long id;

    @SerializedName("name")
    String name;

    //
    @SerializedName("coord")
    Coords coord;
    //
    @SerializedName("main")
    Main main;
    //
    @SerializedName("wind")
    Wind wind;
    //
    @SerializedName("sys")
    Sys sys;


    @Override
    public String toString() {
        return "Example{" +
                "dt=" + dt +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", coord=" + coord +
                ", main=" + main +
                ", wind=" + wind +
                ", sys=" + sys +
                '}';
    }

    //
    //
    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //
    public Coords getCoord() {
        return coord;
    }
    public void setCoord(Coords coord) {
        this.coord = coord;
    }
    //
    public Main getMain() {
        return main;
    }
    public void setMain(Main main) {
        this.main = main;
    }
    //
    public Wind getWind() {
        return wind;
    }
    public void setWind(Wind wind) {
        this.wind = wind;
    }
    //
    public Sys getSys() {
        return sys;
    }
    public void setSys(Sys sys) {
        this.sys = sys;
    }
    //

}
