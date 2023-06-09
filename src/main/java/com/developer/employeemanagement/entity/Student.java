package com.developer.employeemanagement.entity;

public class Student {

    int a;
    class Inner{
        int a = 95;
        

    }
    private int age;
    private String name;
    private String surname;
    public Student(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!name.equals(student.name)) return false;
        return surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }
}
