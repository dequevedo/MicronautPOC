package com.mocronautpoc;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class MainController {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public Person index() {
        return new Person("Daniel", 22, "Male");
    }
}
