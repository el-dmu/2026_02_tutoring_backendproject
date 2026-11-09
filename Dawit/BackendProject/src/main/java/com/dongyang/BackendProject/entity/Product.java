package com.dongyang.BackendProject.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity //JPA 관리하는 대상
@Table(name = "products")
@Getter //@Setter랑 비교
@NoArgsConstructor(access = AccessLevel.PROTECTED) // protected Product() {} 동일
public class Product {

    @Builder
    public Product(String name, Integer price, Integer stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

}
