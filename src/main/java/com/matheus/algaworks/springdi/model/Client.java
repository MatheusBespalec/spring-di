package com.matheus.algaworks.springdi.model;

public class Client {
    private String name;
    private Boolean active = false;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void active() {
        this.active = true;
    }
}
