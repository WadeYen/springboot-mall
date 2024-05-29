package com.wadeyen.springbootmall.service;

import com.wadeyen.springbootmall.dto.ProductRequest;
import com.wadeyen.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
