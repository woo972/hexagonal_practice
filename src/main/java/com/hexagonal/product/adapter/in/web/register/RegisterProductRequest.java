package com.hexagonal.product.adapter.in.web.register;

import com.hexagonal.product.domain.Money;
import lombok.Getter;

@Getter
class RegisterProductRequest {
    private String name;
    private int stock;
    private int price;

}
