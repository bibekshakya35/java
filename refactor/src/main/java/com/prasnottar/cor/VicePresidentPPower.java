package com.prasnottar.cor;

/**
 * Created by bibek on 6/27/17.
 */
public class VicePresidentPPower  extends PurchasePower {

    protected double getAllowable() {
        return BASE * 40;
    }

    protected String getRole() {
        return "Vice President";
    }
}
