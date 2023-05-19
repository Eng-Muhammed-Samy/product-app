package com.product.productapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "CATEGORIES")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nameAr;
    private String nameEn;
    private String longDescription;
    private String image;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
