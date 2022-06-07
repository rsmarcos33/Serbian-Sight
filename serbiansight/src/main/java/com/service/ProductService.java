package com.service;

import com.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface ProductService {

    Optional<Product> findById(Long id);

    Page<Product> findAllProductPageable(Pageable pageable);

}
