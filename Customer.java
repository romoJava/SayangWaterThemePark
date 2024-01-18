/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sayangwaterthemepark;

/**
 *
 * @author abimg
 */
public class Customer {
    private String fullName;
    private int phoneNum;
    private String chargeRate;
    private int age;
    private double discount;

    public Customer(String fullName, int phoneNum, String chargeRate, int age, double discount) {
        this.fullName = fullName;
        this.phoneNum = phoneNum;
        this.chargeRate = chargeRate;
        this.age = age;
        this.discount = discount;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getChargeRate() {
        return chargeRate;
    }

    public int getAge() {
        return age;
    }

    public double getDiscount() {
        return discount;
    }
    
}
