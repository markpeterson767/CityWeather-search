package com.example.weatherrecyclerviewretrofitmytry;

import com.example.weatherrecyclerviewretrofitmytry.models.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=60793f8c34e42fd440f886dbb2baccc9&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);


}
