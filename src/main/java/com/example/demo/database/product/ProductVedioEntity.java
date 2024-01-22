package com.example.demo.database.product;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.example.demo.common.base.ProductBase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product_vedio_list")
public class ProductVedioEntity extends ProductBase {

    @Column(name = "test")
    private String test;
}
