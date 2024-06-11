package com.wadeyen.springbootmall.service;

import com.wadeyen.springbootmall.dto.CreateOrderRequest;
import com.wadeyen.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
