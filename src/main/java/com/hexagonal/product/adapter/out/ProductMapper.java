package com.hexagonal.product.adapter.out;

import com.hexagonal.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product mapToDomainEntity(ProductEntity productEntity){
        return new Product(productEntity.getId(),
                productEntity.getName(),
                productEntity.getStock(),
                productEntity.getPrice());
    }
}
