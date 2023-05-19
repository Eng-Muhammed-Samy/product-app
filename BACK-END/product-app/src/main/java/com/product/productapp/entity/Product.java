package com.product.productapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PRODUCTS")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nameAr;
    private String nameEn;
    private String longDescription;
    private Double price;
    private int quantity;
    private String image;
    private String shortDescriptionAr;
    private String shortDescriptionEn;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
