package com.example.weather_app.resource.service;

import com.example.weather_app.resource.domain.CityCoordinates;
import com.example.weather_app.resource.domain.WeatherRequestDetails;
import com.example.weather_app.resource.entity.WeatherResponse;
import com.example.weather_app.resource.provider.GeocodingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private GeocodingProvider geocodingProvider;

    @Autowired
    public WeatherService(final GeocodingProvider geocodingProvider) {
        this.geocodingProvider = geocodingProvider;
    }
    public WeatherResponse getWeather(final WeatherRequestDetails weatherRequestDetails) {

        final CityCoordinates cityCoordinates = geocodingProvider.getCoordinates(weatherRequestDetails);
    }
}
