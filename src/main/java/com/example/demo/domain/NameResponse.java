package com.example.demo.domain;

public class NameResponse {
    private int status;

    public NameResponse(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
