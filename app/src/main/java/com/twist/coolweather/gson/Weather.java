package com.twist.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * File description
 *
 * @author twist
 * @date 2020/4/16 15 32
 * @email twistonidea@gmail.com
 */
public class Weather {

    public String status;

    public String msg;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
