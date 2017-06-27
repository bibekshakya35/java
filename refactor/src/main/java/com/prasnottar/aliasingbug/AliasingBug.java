package com.prasnottar.aliasingbug;

import java.util.Date;

/**
 * Created by bibek on 6/26/17.
 */
public class AliasingBug {
    public static void main(String[] args){

        Date retirement = new Date(Date.parse("Tue 1 Nov 2016"));
        Date party = retirement;
        party.setDate(5);
        System.out.println(retirement);
    }
}
