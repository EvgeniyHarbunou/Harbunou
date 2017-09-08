package com.company;

import java.util.Comparator;

/**
 * Created by gamur on 06.09.2017.
 */

public class SpeedSortByMs implements Comparator<Speed> {
    public int compare (Speed ob1, Speed ob2){
       if(ob1.getMs()<ob2.getMs()){
           return -1;
       }
       else if(ob1.getMs()>ob2.getMs()){
           return 1;
       }
       else return 0;

    }
}
