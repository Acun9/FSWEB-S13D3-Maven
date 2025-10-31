package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("-------------------------------------");

        Person person = new Person("John", "Doe", 20);
        Person person1 = new Person("Murat", "Acun", 29, false, 0, 0);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Is this person a teenager?: " + person1.isTeen());

        System.out.println("-------------------------------------");

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }
}
