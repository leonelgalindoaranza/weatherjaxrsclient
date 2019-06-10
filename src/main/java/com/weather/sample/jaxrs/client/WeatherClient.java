package com.weather.sample.jaxrs.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WeatherClient {

    @GET
    @Path(value = "/country/{countryCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getWeatherByCountryId();
}
