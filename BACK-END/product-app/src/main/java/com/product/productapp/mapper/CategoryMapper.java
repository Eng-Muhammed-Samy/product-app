package com.product.productapp.mapper;

import com.product.productapp.entity.Category;
import com.product.productapp.model.CategoryModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toEntity(CategoryModel model);

    CategoryModel toModel(Category category);

}
