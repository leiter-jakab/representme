package me.represent.controller.dto;

import me.represent.data.entities.DemoEntity;

public class Demo {

    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public Demo(DemoEntity demoEntity) {
        this.name = demoEntity.getName();
    }

    public String getName() {
        return name;
    }
}
