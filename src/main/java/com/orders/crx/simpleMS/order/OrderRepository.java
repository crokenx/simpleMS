package com.orders.crx.simpleMS.order;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

// TODO: Why this is a repository???

// CrudRepository creates a full crud operations based on what with put inside the <T, ID> Person in this case, spring data rest is responsible for this

@Repository
public interface OrderRepository extends ReactiveCrudRepository<Order, Long> {}
