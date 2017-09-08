package com.company;

import java.util.Comparator;
import java.lang.String;

public class SpeedSortByName implements Comparator <Speed> {
    public int compare(Speed ob1,Speed ob2){
       if(ob1.unit.ordinal()<ob2.unit.ordinal()){
           return -1;
       }
        else if (ob1.unit.ordinal()>ob2.unit.ordinal()){
           return 1;
       }
        else return 0;
    }

}
