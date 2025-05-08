package com.chrisweatherproject.weatherproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Weather {

    @Id
    @GeneratedValue
    private Integer id;
    private String city_name;
    private String current_weather;
    private String weather_forecast;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCurrent_weather() {
        return current_weather;
    }

    public void setCurrent_weather(String current_weather) {
        this.current_weather = current_weather;
    }

    public String getWeather_forecast() {
        return weather_forecast;
    }

    public void setWeather_forecast(String weather_forecast) {
        this.weather_forecast = weather_forecast;
    }
}
