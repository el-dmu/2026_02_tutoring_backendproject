package com.dongyang.BackendProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="products")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 아무런인자를 받지않은 기본 생성자
public class Product {

    @Builder
    public Product(String name, Integer price, Integer stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB에서 autoincreament랑 같음
    private Long id;
    //정수형으로 하는 이유는 DB에서 index로 만들어 이진탐색 형식으로 찾기쉽게하려고
    //ex) id = 1, 2, 3, 4... 식으로 있다면 10번을 찾으려할떄 이진탐색으로 탐색

    @Column(name="name", nullable=false, length=100)
    private String name;

    @Column(nullable=false)
    private Integer price;

    @Column(nullable=false)
    private Integer stock;
}
