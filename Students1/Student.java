package com.company;

public class Student {
    private String secname,name;
    private int number, mat, rus, inf;

    public String getSecname() {
        return secname;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getMat() {
        return mat;
    }

    public int getRus() {
        return rus;
    }

    public int getInf() {
        return inf;
    }

    public Student(String secname, String name, int number, int mat, int rus, int inf) {
        this.secname = secname;
        this.name = name;
        this.number = number;
        this.mat = mat;
        this.rus = rus;
        this.inf = inf;
    }
}
