package com.mini.spring.cloud.ribbon.service.impl;

import com.mini.spring.cloud.ribbon.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;

	public String createOrder(Long productId, Long userId, Integer stockCount) {
        System.out.println("创建订单成功");
        String url = String.format("http://stock-service/stock/deduct/%s/%s", productId, stockCount);
        this.restTemplate.getForObject(url, String.class);
		return "success";
	}

}