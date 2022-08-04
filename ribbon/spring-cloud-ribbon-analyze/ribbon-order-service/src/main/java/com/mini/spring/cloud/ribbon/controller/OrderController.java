package com.mini.spring.cloud.ribbon.controller;

import com.mini.spring.cloud.ribbon.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     *
     * @param productId
     * @param userId
     * @param stockCount
     * @return
     */
    @GetMapping(value = "/create")
    public String createOrder(
            @RequestParam("productId") Long productId,
            @RequestParam("userId") Long userId,
            @RequestParam("stockCount") Integer stockCount) {
        orderService.createOrder(productId, userId, stockCount);
        return "success";
    }



}
