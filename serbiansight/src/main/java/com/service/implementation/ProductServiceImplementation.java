package com.service.implementation;

import com.model.Product;
import com.repository.ProductRepository;
import com.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.beans.ConstructorProperties;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private final ProductRepository productRepository;


    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Page<Product> findAllProductPageable(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
