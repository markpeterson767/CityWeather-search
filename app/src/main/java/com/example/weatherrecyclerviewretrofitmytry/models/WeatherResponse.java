package com.example.weatherrecyclerviewretrofitmytry.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResponse {

    @SerializedName("cnt")
    int cnt;

    @SerializedName("list")
    List<Example> listData;

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<Example> getListData() {
        return listData;
    }

    public void setListData(List<Example> listData) {
        this.listData = listData;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "cnt=" + cnt +
                ", listData=" + listData +
                '}';
    }
}