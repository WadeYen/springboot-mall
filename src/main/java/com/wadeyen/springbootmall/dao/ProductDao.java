package com.wadeyen.springbootmall.dao;

import com.wadeyen.springbootmall.constant.ProductCategory;
import com.wadeyen.springbootmall.dto.ProductRequest;
import com.wadeyen.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
