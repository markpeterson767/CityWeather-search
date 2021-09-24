package com.example.weatherrecyclerviewretrofitmytry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.example.weatherrecyclerviewretrofitmytry.models.Example;
import com.example.weatherrecyclerviewretrofitmytry.models.WeatherResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    ImageView search;
    EditText textField;
    // ids of the widgets
    TextView nameCity, id, dt, coord;
    TextView temp, feelsLike, tempMin, tempMax, pressure, humidity;
    TextView speed, direction;
    TextView country, timezone, sunrise, sunset;
    TextView idWeather, main, description, icon;

    //
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        search = findViewById(R.id.search);
        textField = findViewById(R.id.textField);

        nameCity = findViewById(R.id.textView);
        id = findViewById(R.id.textView2);
        dt = findViewById(R.id.textView3);
        coord = findViewById(R.id.textView4);
        //
        temp = findViewById(R.id.mainTv1);
        feelsLike = findViewById(R.id.mainTv2);
        tempMin = findViewById(R.id.mainTv3);
        tempMax = findViewById(R.id.mainTv4);
        pressure = findViewById(R.id.mainTv5);
        humidity = findViewById(R.id.mainTv6);
        //
        speed = findViewById(R.id.windTv1);
        direction = findViewById(R.id.windTv2);
        //
        country = findViewById(R.id.sysTv1);
        timezone = findViewById(R.id.sysTv2);
        sunrise = findViewById(R.id.sysTv3);
        sunset = findViewById(R.id.sysTv4);
        //


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getWeatherData(textField.getText().toString().trim());

            }
        });
    }

    private void getWeatherData(String name) {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<Example> call = apiInterface.getWeatherData(name);

        call.enqueue(new Callback<Example>() {

            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                // instance of Model class
                Example weatherResponse = response.body();

                try {
                    nameCity.setText( " " + weatherResponse.getName());
                    id.setText(" Id : " + weatherResponse.getId());
                    dt.setText("Dt : " + " " + weatherResponse.getDt());
                    coord.setText("Coord : " + weatherResponse.getCoord());
                    //
                    temp.setText("Temperature : " + weatherResponse.getMain().getTemp());
                    feelsLike.setText("Feels Like : " + weatherResponse.getMain().getFeels_like());
                    tempMin.setText("Minimum Temp : " + weatherResponse.getMain().getTemp_min());
                    tempMax.setText("Max Temp : " + weatherResponse.getMain().getTemp_max());
                    pressure.setText("Pressure : " + weatherResponse.getMain().getPressure());
                    humidity.setText("Humidity : " + weatherResponse.getMain().getHumidity());
                    //
                    speed.setText("Speed : " + weatherResponse.getWind().getSpeed());
                    direction.setText("Direction : " + weatherResponse.getWind().getDeg());
                    //
                    country.setText("Country : " + weatherResponse.getSys().getCountry());
                    timezone.setText("Time-zone : " + weatherResponse.getSys().getTimezone());
                    sunrise.setText(" " + weatherResponse.getSys().getSunrise());
                    sunset.setText(" " + weatherResponse.getSys().getSunset());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //
                //Log.d("DATA", response.body().getMain().getTemp());

            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }




}


