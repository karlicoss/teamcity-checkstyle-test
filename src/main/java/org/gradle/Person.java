package org.gradle;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        this.name = String.valueOf(12312312);
    }

    public String getName() {
        return name;
    }
}
