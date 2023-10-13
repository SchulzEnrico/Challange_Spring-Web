package de.es.challange_springweb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "Hello world!";
    }

    @PostMapping("/{greeting}/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public String greetMe(@PathVariable String greeting, @PathVariable String name){
        return  greeting + " " + name;
    }
}
