package com.orders.crx.simpleMS.order;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
public class Order {

    @Id
    private long id;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
}
