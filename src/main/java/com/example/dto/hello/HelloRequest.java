package com.example.dto.hello;

import static org.apache.commons.lang3.StringUtils.isBlank;

public record HelloRequest(
        String name,
        String email) {
    public HelloRequest(final String name, final String email) {
        this.name = isBlank(name) ? "annoymous" : name;
        this.email = isBlank(email) ? "annoymous@mail.com" : email;
    }
}
