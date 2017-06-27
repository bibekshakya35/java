package com.prasnottar.cor;

/**
 * Created by bibek on 6/27/17.
 */
public class PresidentPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 60;
    }

    protected String getRole() {
        return "President";
    }
}