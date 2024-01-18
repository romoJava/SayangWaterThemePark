/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sayangwaterthemepark;

/**
 *
 * @author aqila
 */
public class CustomerClass {
    private String name;
    private int number;
    private String chargeRate;
    private int numOfAdult;
    private int numOfChildren;
    private int numOfSenior;
    private double coupon;
    private double price;

    public CustomerClass(String name, int number, String chargeRate, int numOfAdult, int numOfChildren, int numOfSenior, double coupon, double price) {
        this.name = name;
        this.number = number;
        this.chargeRate = chargeRate;
        this.numOfAdult = numOfAdult;
        this.numOfChildren = numOfChildren;
        this.numOfSenior = numOfSenior;
        this.coupon = coupon;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(String chargeRate) {
        this.chargeRate = chargeRate;
    }

    public int getNumOfAdult() {
        return numOfAdult;
    }

    public void setNumOfAdult(int numOfAdult) {
        this.numOfAdult = numOfAdult;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public int getNumOfSenior() {
        return numOfSenior;
    }

    public void setNumOfSenior(int numOfSenior) {
        this.numOfSenior = numOfSenior;
    }

    public double getCoupon() {
        return coupon;
    }

    public void setCoupon(double coupon) {
        this.coupon = coupon;
    }

   
    
}
