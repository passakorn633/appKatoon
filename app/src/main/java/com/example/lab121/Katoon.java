package com.example.lab121;

public class Katoon {
    private String name;
    private int price;
    private String url;

    public Katoon(){
    }

    public Katoon(String name, int price, String url) {
        this.name = name;
        this.price = price;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
