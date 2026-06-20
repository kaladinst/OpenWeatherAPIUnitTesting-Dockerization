package com.example.weather_app.resource.provider;


import com.example.weather_app.resource.domain.WeatherRequestDetails;
import com.example.weather_app.resource.entity.GeocodingCoordinatesEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GeocodingProvider {
    @Value("${api.key}")
    private String apiKey;

    @Value("${geocoding.url}")
    private String apiUrl;

    public GeocodingCoordinatesEntity getCoordinates(final WeatherRequestDetails weatherRequestDetails) {

        RestTemplate restTemplate = new RestTemplate();

        final ResponseEntity<GeocodingCoordinatesEntity[]> responseEntity;

        HttpEntity<String> requestEntity = new HttpEntity<>(null, (HttpHeaders) null);

        UriComponents uriBuilder = UriComponentsBuilder.fromHttpUrl(apiKey);


    }
}
