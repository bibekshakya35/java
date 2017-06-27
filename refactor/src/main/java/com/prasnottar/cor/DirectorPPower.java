package com.prasnottar.cor;

/**
 * Created by bibek on 6/27/17.
 */
public class DirectorPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }
}