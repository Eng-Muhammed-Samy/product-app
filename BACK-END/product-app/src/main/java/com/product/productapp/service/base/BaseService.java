package com.product.productapp.service.base;

import java.util.List;

public interface BaseService<T> {

    List<T> list();

    T getById(Long id);

    void create(T object);

    void update(Long id, T object);

    void delete(Long id);
}
