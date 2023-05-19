package com.product.productapp.controller.base;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseController<T> {
    @GetMapping
    List<T> list();

    @GetMapping("{id}")
    T getById(@PathVariable final Long id);

    @PostMapping
    void create(@RequestBody final T object);

    @PutMapping("{id}")
    void update(@PathVariable final Long id, @RequestBody final T object);

    @DeleteMapping("{id}")
    void delete(@PathVariable final Long id);

}
