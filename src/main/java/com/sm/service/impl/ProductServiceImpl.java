package com.sm.service.impl;

import com.sm.dto.ProductDto;
import com.sm.entity.ProductEntity;
import com.sm.repository.ProductRepository;
import com.sm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final  ProductRepository repository;
    final  ObjectMapper objectMapper;

    @Override
    public boolean addProduct(ProductDto productDto) {
        ProductEntity productEntity = objectMapper.convertValue(productDto, ProductEntity.class);
        repository.save(productEntity);
        return true;
    }
}
