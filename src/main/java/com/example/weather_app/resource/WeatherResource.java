package com.example.weather_app.resource;


import com.example.weather_app.resource.domain.WeatherRequestDetails;
import com.example.weather_app.resource.entity.WeatherResponse;
import com.example.weather_app.resource.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WeatherResource {

    private WeatherService weatherService;

    @Autowired
    public WeatherResource (final WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public @ResponseBody WeatherResponse weather(@PathVariable("city") String city) {
        final WeatherRequestDetails weatherRequestDetails = WeatherRequestDetails.builder().city(city).build();

        return weatherService.getWeather(weatherRequestDetails);
    }
}
