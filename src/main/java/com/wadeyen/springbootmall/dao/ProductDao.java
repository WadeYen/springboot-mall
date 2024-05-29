package com.wadeyen.springbootmall.dao;

import com.wadeyen.springbootmall.dto.ProductRequest;
import com.wadeyen.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
