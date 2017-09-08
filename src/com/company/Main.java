package com.company;

import java.io.*;
import java.util.*;


public class Main {

    public static final String FILE_PATH = "src/com/company/speedText.txt";

    public static void main(String[] args) {
        boolean flag = false;
        double twokmh=0.5555555555555556;
        ArrayList<Speed> speedlist=new ArrayList<>();
        try {
            Scanner in = new Scanner(new File(FILE_PATH));
            while (in.hasNext()) {
                speedlist.add(new Speed(in.nextInt(),in.next()));
            }
            //1 вывод скоростей с переводом в мс
            for(Speed p:speedlist) {
                System.out.println(p);
            }
            System.out.print("\n");
            //2 сортировка массива по фактической скорости.
            Collections.sort(speedlist, new SpeedSortByMs());
            for(Speed p:speedlist){
                System.out.println(p.getValue()+" "+p.getUnit());
            }
            System.out.print("\n");
            //3 проверка значения скорости в массиве
            for (Speed p:speedlist) {

                if (p.getMs() == twokmh) {
                    System.out.println("yes");
                    flag = true;
                    break;
                }
            }
            if(!flag){System.out.println("no");
            }
            System.out.print("\n");
            //4 вывод массива отсортированого по ед. изм.
            Collections.sort(speedlist,new SpeedSortByMs().reversed());
            Collections.sort(speedlist,new SpeedSortByName());
            for(Speed p:speedlist){
                System.out.println(p.getValue()+" "+p.getUnit());
            }

        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
