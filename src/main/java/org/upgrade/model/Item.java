package org.upgrade.model;

import java.math.BigDecimal;

public class Item {
    private String name;
    private int age;
    private BigDecimal i;

    public Item(String name, int age, BigDecimal i) {
        this.name = name;
        this.age = age;
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
