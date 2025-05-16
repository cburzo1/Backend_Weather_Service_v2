package com.chrisweatherproject.weatherproject.controller;

import com.chrisweatherproject.weatherproject.dto.x_DTO;
import com.chrisweatherproject.weatherproject.model.x_;
import com.chrisweatherproject.weatherproject.service.x_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/...")
public class x_Controller {

    //@Autowired
    /*private x_Service weatherService;

    @PostMapping("/add")
    public String addWeather(@RequestBody x_ weather){
        weatherService.addWeather(weather);

        System.out.println(weather);

        return "success add weather";
    }

    @GetMapping
    public List<x_> getWeather(){
        return weatherService.getWeather();
    }

    @GetMapping("/get")
    public x_ getWeather(@RequestParam Integer id){
        return weatherService.getWeather(id);
    }

    //What is a Response Enitity?
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateWeather(@PathVariable Integer id, @RequestBody x_ weather){
        weatherService.updateWeather(id, weather);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteWeather(@PathVariable Integer id){
        weatherService.deleteWeather(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/update-.../{id}")
    public ResponseEntity<Void> updateCityName(@PathVariable Integer id, @RequestBody x_DTO weatherDTO ){
        weatherService.updateCityName(id, weatherDTO);

        return ResponseEntity.noContent().build();
    }*/
}
