package com.erikmisencik.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public HelloResponse sayHelloParam(@PathVariable String name) {
        return new HelloResponse("Hello, "+ name + "!");
    }

    @GetMapping("/hello")
    public HelloResponse sayHello() {
        return new HelloResponse("Hello, World!");
    }

    @PostMapping("/hello")
    public HelloResponse sayHelloPost(@RequestBody String name) {
        return new HelloResponse( "Hello, " + name + "!");
    }

}
