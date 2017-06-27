package com.prasnottar.cor;

/**
 * Created by bibek on 6/27/17.
 */
public class ManagerPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}