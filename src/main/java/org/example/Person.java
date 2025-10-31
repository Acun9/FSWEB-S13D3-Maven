package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    boolean isMarried;
    int childCount;
    double salary;

    public Person(String firstName, String lastName, int age,
                  boolean isMarried, int childCount, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
        this.childCount = childCount;
        this.salary = salary;
    }

    public Person(String firstName, String lastName, int age){
        this(firstName, lastName, age, false, 0, 0);
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age < 19;
    }
}
