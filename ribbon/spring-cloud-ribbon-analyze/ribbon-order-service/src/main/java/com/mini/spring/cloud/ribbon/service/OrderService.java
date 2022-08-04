package com.mini.spring.cloud.ribbon.service;


public interface OrderService {

	String createOrder(Long productId, Long userId, Integer stockCount);

}