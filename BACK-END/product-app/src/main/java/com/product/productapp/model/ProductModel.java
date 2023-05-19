package com.product.productapp.model;

import com.product.productapp.entity.Category;
import com.product.productapp.model.base.BaseModel;
import lombok.Data;

@Data
public class ProductModel extends BaseModel {
    private Double price;
    private int quantity;
    private String image;
    private String shortDescriptionAr;
    private String shortDescriptionEn;
    private Category category;
}
