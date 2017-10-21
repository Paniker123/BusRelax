package com.yellow_space.busrelax.Models;

/**
 * Created by Zver on 12.10.2017.
 */

public class BusItem {
    private int id;
    private String name;
    private double X;
    private double Y;

    public BusItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
}
