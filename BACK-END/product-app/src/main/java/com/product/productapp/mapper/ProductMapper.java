package com.product.productapp.mapper;

import com.product.productapp.entity.Product;
import com.product.productapp.model.ProductModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(ProductModel model);

    ProductModel toModel(Product category);

}
