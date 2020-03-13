package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matim = 0, russ = 0, inform = 0; // создаем нулевые переменные для хранения суммы баллов студентов
        double count = 0;
        School school = new School();
        ArrayList<Sredball> sredballs = new ArrayList<>(); //создаем массив где будут храниться средние значения для каждой школы
        Student[] students = new Student[in.nextInt()];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()); // Заполняем массив студентами;
        }
        for (int i = 0; i <students.length ; i++) { // считаем сумму баллов по всем предметам в городе
            matim += students[i].getMat();
            russ += students[i].getRus();
            inform += students[i].getInf();
            count++;
        }
        sredballCity sredballCity = new sredballCity(matim/count, russ/count, inform/count , (matim/count + russ/count + inform/count)/3); // находим среднее число по каждому предмету и общий средний балл в городе добавляя в класс sredballCity
        for (int i = 0; i <students.length ; i++) { // добавляем в TreeMap методом addstudent
            school.addstudent(students[i]);
        }
        for (Integer number : school.getSchools().keySet()) { // находим средний балл для каждой школы. и добавляем в ArrayList sredballs в классе Sredball
            matim = 0; russ = 0; inform = 0; count = 0;
            for (Student student : school.getSchools().get(number)) {
                matim+=student.getMat();
                russ+=student.getRus();
                inform +=student.getInf();
                count++;
            }
            Sredball sredball= new Sredball(matim/count,russ/count,inform/count,number,(matim/count + russ/count + inform/count)/3); // создаем новую школу и добавляем в неё средние баллы
            sredballs.add(sredball); //добавляем в массив по номеру школы
        }
        for (int i = 0; i <students.length ; i++) { // находим максимум по каждому из предметов и добавляем в Arraylist Методами getbest
            school.getbestmat(students[i]);
            school.getbestrus(students[i]);
            school.getbestinf(students[i]);
        }
        //Далее выводим результаты!!!!
        System.out.printf("Отчет по городу: математика - "+ String.format("%.1f",sredballCity.getSredmat()).replace(',', '.') + ", русский язык - "+String.format("%.1f",sredballCity.getSredrus()).replace(',', '.') + ", информатика - "+String.format("%.1f",sredballCity.getSredinf()).replace(',', '.') + ", общий средний балл - "+ String.format("%.1f",sredballCity.getSredball()).replace(',', '.'));
        System.out.println();
        Collections.sort(sredballs);
        System.out.println("Отчет по школам:");
        Collections.sort(school.getBestmat(), (o1, o2) -> o1.getSecname().compareTo(o2.getSecname()) );
        Collections.sort(school.getBestrus(), (o1, o2) -> o1.getSecname().compareTo(o2.getSecname()) );
        Collections.sort(school.getBestinf(), (o1, o2) -> o1.getSecname().compareTo(o2.getSecname()) );
        for (int i = 0; i <sredballs.size() ; i++) {
            System.out.println("Школа № "+sredballs.get(i).getSchoolnumber() + ": математика - " + String.format("%.1f",sredballs.get(i).getSredmat()).replace(',', '.') + ", русский язык - " + String.format("%.1f",sredballs.get(i).getSredrus()).replace(',', '.') + ", инфрматика - " + String.format("%.1f",sredballs.get(i).getSredinf()).replace(',', '.') +  ", общий средний балл - "+ String.format("%.1f", sredballs.get(i).getSredall()).replace(',', '.'));
        }
        for (int i = 0; i <school.getBestmat().size() ; i++) {
            System.out.println("Лучший результат по математике - "+ school.getBestmat().get(i).getSecname()+ " "+school.getBestmat().get(i).getName() + " - " + school.getBestmat().get(i).getMat());
        }
        for (int i = 0; i <school.getBestrus().size() ; i++) {
            System.out.println("Лучший результат по русскому языку - "+ school.getBestrus().get(i).getSecname()+ " "+school.getBestrus().get(i).getName() + " - " + school.getBestrus().get(i).getRus());
        }
        for (int i = 0; i <school.getBestinf().size() ; i++) {
            System.out.println("Лучший результат по информатике - "+ school.getBestinf().get(i).getSecname()+ " "+school.getBestinf().get(i).getName() + " - " + school.getBestinf().get(i).getInf());
        }

        }
    }



