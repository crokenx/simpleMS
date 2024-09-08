package com.orders.crx.simpleMS.orderController;

import com.orders.crx.simpleMS.order.Order;
import com.orders.crx.simpleMS.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
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
    public Mono<Order> createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
}
