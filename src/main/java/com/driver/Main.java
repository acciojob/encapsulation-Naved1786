package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("John Doe");
        System.out.println("Name: " + obj.getName());
    }
  
}