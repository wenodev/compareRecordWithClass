package com.example.dto.bts;

import java.math.BigDecimal;

import static org.apache.commons.lang3.StringUtils.isBlank;

public record Album(
        String name,
        BigDecimal price
) {
    public Album(final String name, BigDecimal price) {
        this.name = isBlank(name) ? "annoymous" : name;
        this.price = null == price ? BigDecimal.ZERO : price;
    }
}
