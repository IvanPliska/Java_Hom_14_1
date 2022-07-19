package ru.netology.javaqa38.Homework_13_1;

import java.util.Objects;

public class Smartphone extends Product {
    protected String producer;

    public Smartphone(int id, String name, int price) {
        super(id, name, price);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
