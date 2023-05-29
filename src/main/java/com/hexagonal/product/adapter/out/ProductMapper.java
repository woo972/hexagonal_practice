package com.hexagonal.product.adapter.out;

import com.hexagonal.product.domain.Money;
import com.hexagonal.product.domain.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductMapper {

    public Product mapToDomainEntity(ProductEntity productEntity){
        long id = productEntity.getId();
        String name = productEntity.getName();
        long stock = productEntity.getStock();
        Money price = new Money(new BigDecimal(productEntity.getPrice()));
        return new Product(id, name, stock, price);
    }
}
