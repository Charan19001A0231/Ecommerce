package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("hp/{name}")
    public HelloWorld hello(@PathVariable String name) {
        return new HelloWorld("Hello world"+ name);
    }
    @PostMapping("/hello")
    public  String hellopost(@RequestBody String name){
        return "post request came from "+ name + " !";
    }
}
