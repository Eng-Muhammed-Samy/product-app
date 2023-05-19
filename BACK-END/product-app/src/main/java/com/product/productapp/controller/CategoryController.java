package com.product.productapp.controller;

import com.product.productapp.controller.base.BaseController;
import com.product.productapp.model.CategoryModel;
import com.product.productapp.service.CategoryService;
import com.product.productapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("categories")
public class CategoryController implements BaseController<CategoryModel> {

    private final CategoryService categoryService;

    @Override
    public List<CategoryModel> list() {
        return categoryService.list();
    }

    @Override
    public CategoryModel getById(Long id) {
        return categoryService.getById(id);
    }

    @Override
    public void create(CategoryModel object) {

    }

    @Override
    public void update(Long id, CategoryModel object) {

    }

    @Override
    public void delete(Long id) {

    }
}
