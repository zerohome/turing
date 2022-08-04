package com.mini.spring.cloud.ribbon.controller;

import com.mini.spring.cloud.ribbon.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping(value = "/deduct/{productId}/{stockCount}")
    public String deductStock(@PathVariable("productId") Long productId,
                              @PathVariable("stockCount") Integer stockCount) {
        return stockService.deductStock(productId, stockCount);
    }
}
