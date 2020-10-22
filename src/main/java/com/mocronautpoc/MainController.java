package com.mocronautpoc;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/microservice/")
public class MainController {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        return new Person("Daniel", 22, "Male");
    }

    @Post("/person")
    public Person postPerson(Person person) {
        return person;
    }
}
