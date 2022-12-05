package com.example.dto.bye;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ByeController {

    @GetMapping("/bye")
    public String getHello(@Valid ByeRequest request) {
        System.out.println(request);
        return "get bye";
    }
    @PostMapping("/bye")
    public String postHello(@RequestBody @Valid ByeRequest request) {
        System.out.println(request);
        return "post bye";
    }
    @PutMapping("/bye")
    public String putHello(@RequestBody @Valid ByeRequest request) {
        System.out.println(request);
        return "put bye";
    }
    @PatchMapping("/bye")
    public String patchHello(@RequestBody @Valid ByeRequest request) {
        System.out.println(request);
        return "patch bye";
    }
    @DeleteMapping("/bye")
    public String deleteHello(@RequestBody @Valid ByeRequest request) {
        System.out.println(request);
        return "delete bye";
    }
}
