package com.service;

import com.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    Page<Product> findAllProductPageable(Pageable pageable);

}
