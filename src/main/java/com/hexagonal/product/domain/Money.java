package com.hexagonal.product.domain;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Money {
    private int value;

    public Money(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("price amount have to be equal or greater than 0");
        }
        this.value = amount;
    }
}
