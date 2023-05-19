package com.product.productapp.service.impl;

import com.product.productapp.entity.Product;
import com.product.productapp.mapper.ProductMapper;
import com.product.productapp.model.ProductModel;
import com.product.productapp.repository.ProductRepository;
import com.product.productapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductModel> list() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public ProductModel getById(Long id) {
        return productMapper.toModel(productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException()));
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
