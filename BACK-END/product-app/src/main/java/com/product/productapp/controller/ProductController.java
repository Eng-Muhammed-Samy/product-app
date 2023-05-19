package com.product.productapp.controller;

import com.product.productapp.controller.base.BaseController;
import com.product.productapp.model.ProductModel;
import com.product.productapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("products")
public class ProductController implements BaseController<ProductModel> {

    private final ProductService productService;


    @Override
    public List<ProductModel> list() {
        return productService.list();
    }

    @Override
    public ProductModel getById(Long id) {
        return productService.getById(id);
    }

    @Override
    public void create(ProductModel object) {

    }

    @Override
    public void update(Long id, ProductModel object) {

    }

    @Override
    public void delete(Long id) {

    }
}
