package com.example.dto.bye;


import static org.apache.commons.lang3.StringUtils.isBlank;

public class ByeRequest {
    private final String name;
    private final String email;

    public ByeRequest(final String name, final String email) {
        this.name = isBlank(name) ? "annoymous" : name;
        this.email = isBlank(email) ? "annoymous@mail.com" : email;
    }

    @Override
    public String toString() {
        return "ByeRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
