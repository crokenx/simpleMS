package com.orders.crx.simpleMS.orderController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.orders.crx.simpleMS.order.Order;
import com.orders.crx.simpleMS.services.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@JsonIgnoreProperties(ignoreUnknown = true)
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public Flux<Order> getAll(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Mono<Order> getById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @PostMapping
    public Mono<Order> createOrder(@Valid @RequestBody Order order){
        return orderService.createOrder(order);
    }
}
