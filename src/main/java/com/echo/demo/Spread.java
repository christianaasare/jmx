package com.echo.demo;

public class Spread implements SpreadMBean {
    private String userName;

    @Override public void printUserInfo() {
        System.out.println("MahiFx");
    }
}