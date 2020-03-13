package com.company;

import java.util.ArrayList;

public class Sredball implements Comparable<Sredball> {
    private double sredmat,sredrus,sredinf,sredall;// хранят средние баллы по мат,рус,информ,и общий средний
    private int schoolnumber;// номер школы

    public double getSredmat() {
        return sredmat;
    }

    public double getSredrus() {
        return sredrus;
    }

    public double getSredinf() {
        return sredinf;
    }

    public double getSredall() {
        return sredall;
    }

    public int getSchoolnumber() {
        return schoolnumber;
    }

    public Sredball(double sredmat, double sredrus, double sredinf, int schoolnumber, double sredall) { //конструктор для школы с номером и средних баллов в этой школе
        this.schoolnumber = schoolnumber;
        this.sredmat = sredmat;
        this.sredrus = sredrus;
        this.sredinf = sredinf;
        this.sredall = sredall;
    }
    public int compareTo(Sredball o){ //Comparator : В случае равенства среднего балла, школы сортируются по среднему баллу по предметам с приоритетами 1 для математики, 2 для русского языка, 3 для информатики
        if (this.sredall==o.sredall){
            if(this.sredmat == o.sredmat){
                if(this.sredrus == o.sredrus){
                    if(this.sredinf == o.sredinf) {
                        return o.schoolnumber - this.schoolnumber;
                    }
                    else return (int) (o.sredinf-this.sredinf);
                }
                else return (int) ( o.sredrus - this.sredrus);
            }
            return (int) (o.sredmat-this.sredmat);
        }
        return (int) (o.sredall-this.sredall);
    }

}