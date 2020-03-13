package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class School {
    private TreeMap<Integer, ArrayList<Student>> schools = new TreeMap<>(); //создаем Treemap куда будем добавлять Integer=номер школы, Arraylist Массив с студентами через метод приведенный ниже
    private ArrayList<Student> bestmat = new ArrayList<>();// массив со студентами лучшими по математике
    private ArrayList<Student> bestrus = new ArrayList<>();// массив со студентами  лучшими по русскому
    private ArrayList<Student> bestinf = new ArrayList<>();// массив со студентами  лучшими по информатике
    private int bestmatint, bestrusint, bestinfint; // переменные в которых хранятся максимумы, с ними сравнивать будем баллы студентов и перезаписывать если больше

    public ArrayList<Student> getBestmat() {
        return bestmat;
    }

    public ArrayList<Student> getBestrus() {
        return bestrus;
    }

    public ArrayList<Student> getBestinf() {
        return bestinf;
    }

    public TreeMap<Integer, ArrayList<Student>> getSchools() {
        return schools;
    }

    public void addstudent(Student student){ // метод добавления в Treemap студентов
        if (schools.containsKey(student.getNumber())){
            schools.get(student.getNumber()).add(student);
        }
        else {
            ArrayList<Student> set = new ArrayList<>();
            set.add(student);
            schools.put(student.getNumber(), set);
        }

    }
    public void getbestmat(Student student){ // метод добавления максимума по математике
        if ( bestmatint<student.getMat()){
            bestmat.clear();
            bestmat.add(student);
            bestmatint = student.getMat();
        }
        else if (bestrusint == student.getMat()) {
            bestmat.add(student);
        }
    }
    public void getbestrus(Student student){ // метод добавления максимума по русскому
        if ( bestrusint<student.getRus()){
            bestrus.clear();
            bestrus.add(student);
            bestrusint = student.getRus();
        }
        else if (bestrusint == student.getRus()){
            bestrus.add(student);
        }
    }
    public void getbestinf(Student student){ // метод добавления максимума по информатике
        if ( bestinfint<student.getInf()){
            bestinf.clear();
            bestinf.add(student);
            bestinfint = student.getInf();
        }
        else if (bestinfint == student.getInf()){
            bestinf.add(student);
        }
    }
}

