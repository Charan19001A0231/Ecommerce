package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.RestController;


public class HelloWorld {
    private String mesaage;

    public String getMesaage() {
        return mesaage;
    }

    public void setMesaage(String mesaage) {
        this.mesaage = mesaage;
    }

    public HelloWorld(String mesaage) {
        this.mesaage = mesaage;
    }
}
