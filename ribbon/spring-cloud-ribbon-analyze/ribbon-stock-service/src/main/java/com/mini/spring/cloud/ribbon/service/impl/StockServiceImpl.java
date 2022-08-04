package com.mini.spring.cloud.ribbon.service.impl;

import com.mini.spring.cloud.ribbon.service.StockService;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {

	public String deductStock(Long productId, Integer stockCount) {
		System.out.println("商品productId=" + productId + "：扣减库存" + stockCount);
		return "success";
	}

}