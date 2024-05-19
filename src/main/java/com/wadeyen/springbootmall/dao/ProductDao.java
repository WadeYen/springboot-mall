package com.wadeyen.springbootmall.dao;

import com.wadeyen.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
