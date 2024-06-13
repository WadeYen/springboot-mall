package com.wadeyen.springbootmall.service;

import com.wadeyen.springbootmall.dto.CreateOrderRequest;
import com.wadeyen.springbootmall.dto.OrderQueryParams;
import com.wadeyen.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
