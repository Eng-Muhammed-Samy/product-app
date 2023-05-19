package com.product.productapp.service.impl;

import com.product.productapp.mapper.CategoryMapper;
import com.product.productapp.model.CategoryModel;
import com.product.productapp.repository.CategoryRepository;
import com.product.productapp.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryModel> list() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryModel getById(Long id) {
        return categoryMapper.toModel(categoryRepository.findById(id).orElseThrow());
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
