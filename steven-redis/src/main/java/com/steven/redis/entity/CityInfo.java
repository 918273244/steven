package com.steven.redis.entity;

import java.io.Serializable;

/**
 * Created by Steven on 2017/5/17.
 */
public class CityInfo implements Serializable{

    private int id;
    private String city;

    public CityInfo() {

    }
    public CityInfo(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
