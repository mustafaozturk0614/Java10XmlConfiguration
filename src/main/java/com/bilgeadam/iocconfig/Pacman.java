package com.bilgeadam.iocconfig;

import org.springframework.stereotype.Component;



public class Pacman implements IRunable {

    public void up(){
        System.out.println("Yukarı");
    }
    public void down(){
        System.out.println("Asagı");
    }
    public void left(){
        System.out.println("Sola");
    }
    public void  right(){
        System.out.println("Sağa");
    }
}
