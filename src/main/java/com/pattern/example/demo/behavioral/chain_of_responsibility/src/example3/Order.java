package com.pattern.example.demo.behavioral.chain_of_responsibility.src.example3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(int value) {
        items.add(new Item(value));
    }

    public List<Item> getItems() {
        return items;
    }

    public BigDecimal getTotal() {
        return BigDecimal.valueOf(items.stream().mapToInt(Item::getPrice).sum());
    }
}
