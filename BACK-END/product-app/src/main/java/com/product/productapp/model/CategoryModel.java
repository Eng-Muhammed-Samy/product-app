package com.product.productapp.model;

import com.product.productapp.entity.Product;
import com.product.productapp.model.base.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class CategoryModel extends BaseModel {
    private List<Product> products;
}
