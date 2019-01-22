package com.itschool;

import java.io.*;
import java.util.ArrayList;

public class Students {
    public ArrayList<Student> students;

    public Students() {
        students = new ArrayList<>();
    }

    public void Add (Student student){
        this.students.add(student);
    }

    public void Save (String filename){
        try
        {
            FileOutputStream fileOut = new FileOutputStream(filename); // Выходной поток для записи в файл
            ObjectOutputStream out = new ObjectOutputStream(fileOut); // Выходной поток для объектов
            out.writeObject(students);
            out.flush();
            out.close();
            fileOut.flush();
            fileOut.close();
            System.out.println("Serialized data is saved in file: " + filename);
        }
        catch (IOException exc)
        {
        exc.printStackTrace();
        }
    }

    public void Load (String filename){
        try {
            File file;
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.students = (ArrayList<Student>) in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException exc){
            exc.printStackTrace();
        } catch (ClassNotFoundException c)
        {
            System.out.println("Student class not found");
            c.printStackTrace();
        }
    }

    public void Clear()
    {
     this.students.clear();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Student s : this.students)
        {
            result.append(s.toString());
        }

        return result.toString();
    }
}
