package com.sm.controller;

import com.sm.dto.ProductDto;
import com.sm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    final private ProductService productService;

    @PostMapping("/create")
    public boolean addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }

}
