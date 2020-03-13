package com.company;

public class sredballCity {
    private double sredmat, sredrus, sredinf, sredball; //хранит средние баллы по городу

    public double getSredmat() {
        return sredmat;
    }

    public double getSredrus() {
        return sredrus;
    }

    public double getSredinf() {
        return sredinf;
    }

    public double getSredball() {
        return sredball;
    }

    public sredballCity(double sredmat, double sredrus, double sredinf, double sredball) { //конструктор для добавления среднего балла по городу
        this.sredmat = sredmat;
        this.sredrus = sredrus;
        this.sredinf = sredinf;
        this.sredball = sredball;
    }

}
