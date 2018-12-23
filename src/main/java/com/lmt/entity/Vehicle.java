package com.lmt.entity;

/**
 * Created by 热带雨林 on 2018/12/23.
 */
public class Vehicle {
    private int id;
    private String type;
    private String color;

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
