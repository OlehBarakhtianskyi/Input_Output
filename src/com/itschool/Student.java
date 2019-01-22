package com.itschool;

public class Student implements java.io.Serializable
{
    public String univer;
    public String faculty;
    public String course;
    public String name;
    public int startDate;
    public int endOfStudy;
    public transient int age;

    public Student() {
    }

    public Student(String univer, String faculty, String course, String name, int startDate, int endOfStudy, int age) {
        this.univer = univer;
        this.faculty = faculty;
        this.course = course;
        this.name = name;
        this.startDate = startDate;
        this.endOfStudy = endOfStudy;
        this.age = age;
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndOfStudy() {
        return endOfStudy;
    }

    public void setEndOfStudy(int endOfStudy) {
        this.endOfStudy = endOfStudy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" + this.univer + "\t" + this.faculty +
                "\n" + this.name + "\t"+ this.age  +
                "\n" + this.course +
                "\n" + this.startDate + "\t" + this.endOfStudy;
    }
}
