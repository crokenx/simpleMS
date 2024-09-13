package com.orders.crx.simpleMS.services;

import com.orders.crx.simpleMS.order.Order;
import com.orders.crx.simpleMS.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Flux<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Mono<Order> getOrderById(Long id){
        return orderRepository.findById(id);
    }

    public Mono<Order> createOrder(Order order){
        order.setOrder_date(LocalDate.now());
        return orderRepository.save(order);
    }

}
