package com.chrisweatherproject.weatherproject.dto;

import lombok.Data;

@Data
public class WeatherDTO {
    private String city_name;

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
