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

    private final ProductService productService;

    @PostMapping("/create")
    public void addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
    }

}
