package com.itschool;

public class Main {

    public static void main(String[] args) {
        Students students = new Students();
        students.Add(student);
        students.Add(new Student("ОНПУ", "ИБЕИТ", "2 курс", "Новиков П.П.", 2017, 2021, 19  ));
        students.Add(new Student("ОНПУ", "ИКС", "1 курс", "Иванов И.И.", 2018, 2022, 18 ));
        students.Add(new Student("ОНПУ", "ИКС", "3 курс", "Сухих Д.И.", 2016, 2020, 20 ));
        System.out.println(students.toString());

        students.Save("./students.ser");

        // ---------deserialize -----------

        students.Clear();
        students.Load("./students.ser");
        System.out.println("\n\nDeserialized students: ...");
        System.out.println(students.toString());
    }
}
