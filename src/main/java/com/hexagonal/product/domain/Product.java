package com.hexagonal.product.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/* 도메인 엔티티를 먼저 만들고, 도메인을 중심으로 유즈케이스를 구현한다
 * 입력 유효성 검증과 달리 비즈니스 규칙은 도메인 모델의 상태에 접근해야하기 때문에 도메인 엔티티에서 구현한다.
 * 도메인 엔티티 내에서 비즈니스 규칙 검증이 어려운 경우에는 유즈케이스 레벨에서 한다.
 */
@Getter
@AllArgsConstructor
public class Product {
    private long id;
    private String name;
    private int stock;
    private int price;

    public int takeOut(int quantity) {
        int remainStock = this.stock - quantity;
        if (remainStock < 0) {

        }
        return remainStock;
    }

    public boolean isSoldOut() {
        return this.stock == 0;
    }

}
