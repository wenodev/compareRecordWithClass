package com.example.dto.hello;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(@Valid HelloRequest request) {
        System.out.println(request);
        return "get hello";
    }

    @PostMapping("/hello")
    public String postHello(@RequestBody @Valid HelloRequest request) {
        System.out.println(request);
        return "post hello";
    }

    @PutMapping("/hello")
    public String putHello(@RequestBody @Valid HelloRequest request) {
        System.out.println(request);
        return "put hello";
    }

    @PatchMapping("/hello")
    public String patchHello(@RequestBody @Valid HelloRequest request) {
        System.out.println(request);
        return "patch hello";
    }

    @DeleteMapping("/hello")
    public String deleteHello(@RequestBody @Valid HelloRequest request) {
        System.out.println(request);
        return "delete hello";
    }
}
