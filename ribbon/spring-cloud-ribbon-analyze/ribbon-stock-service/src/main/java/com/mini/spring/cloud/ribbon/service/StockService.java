package com.mini.spring.cloud.ribbon.service;

public interface StockService {

	String deductStock(Long productId, Integer stockCount);

}