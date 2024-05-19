package com.wadeyen.springbootmall.service.impl;

import com.wadeyen.springbootmall.dao.ProductDao;
import com.wadeyen.springbootmall.model.Product;
import com.wadeyen.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
