package com.company;

import java.io.*;
import java.util.*;


public class Main {
    public static final String FILE_PATH = "src/com/company/speedText.txt";

    public static void main(String[] args) {
        boolean flag = false;
        ArrayList<Speed> speedlist=new ArrayList<>();
        try {
            Scanner in = new Scanner(new File(FILE_PATH));
            while (in.hasNext()) {
                speedlist.add(new Speed(in.nextInt(),in.next()));
            }
            //1 вывод скоростей с переводом в мс
            for(int i=0;i<speedlist.size();++i) {
                System.out.println(speedlist.get(i));
            }
            System.out.print("\n");
            //2 сортировка массива по фактической скорости
            Collections.sort(speedlist, new SpeedSortByMs());
            for(int i=0;i<speedlist.size();i++){
                System.out.println(speedlist.get(i).getValue()+" "+speedlist.get(i).getUnit());
            }
            System.out.print("\n");
            //3 проверка значения скорости в массиве
            for (int i = 0; i < speedlist.size(); i++) {

                if (speedlist.get(i).getMs() == 0.5555555555555556 || flag) {
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
            for(int i=0;i<speedlist.size();i++){
                System.out.println(speedlist.get(i).getValue()+" "+speedlist.get(i).getUnit());
            }

        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
