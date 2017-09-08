package com.company;

/**
 * Created by gamur on 05.09.2017.
 */
public class Speed  {
    public int value;
    public Speedtype unit;
    public String strunit;
    private double ms;




    public Speed(int value,String stunit) {
        this.value=value;
        this.strunit=stunit;
        if(stunit.equals("kmh")){
            this.unit=Speedtype.kmh;
            this.ms = (double) getValue() / 3600 * 1000;
        }
        else if(strunit.equals("mph")){
            this.unit=Speedtype.mph;
            this.ms=(double)getValue()/3600*1609;
        }
        else if(strunit.equals("kn")){
            this.unit=Speedtype.kn;
            this.ms=(double)getValue()/3600*1852;
        }
        else if(strunit.equals("ms")){
            this.unit=Speedtype.ms;
            this.ms=value;

        }

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setUnit(Speedtype unit) {
        this.unit = unit;
    }

    public Speedtype getUnit() {
        return unit;
    }


    public double getMs() {
        return ms;
    }


    @Override
    public String toString() {

        return value+" "+unit+" = "+Math.ceil(ms*1000)/1000+" ms";

    }


}

