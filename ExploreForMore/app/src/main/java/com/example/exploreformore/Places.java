package com.example.exploreformore;

import java.util.List;

public class Places {
    private String name, address, latitude, longitude, email, tel, web, category;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Places(){};

    public Places(String name, String address, String latitude, String longitude, String email, String tel, String web, String category) {
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude= longitude;
        this.email = email;
        this.tel = tel;
        this.web = web;
        this.category = category;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String  getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getWeb() {
        return web;
    }

    public String getCategory() {
        return category;
    }

    public void add(Places p) {
    }
}