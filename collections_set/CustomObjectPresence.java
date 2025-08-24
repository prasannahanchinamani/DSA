package dsa.collections.collections_set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CustomObjectPresence {
    public boolean isPresent(Person checkPerson) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Alice", 30));

        if (personSet.contains(checkPerson)) {
            System.out.println(checkPerson + " is present .");
            return true;
        } else {
            System.out.println(checkPerson + " is NOT present");
            return false;
        }
    }

    public static void main(String[] args) {
        CustomObjectPresence customObjectPresence = new CustomObjectPresence();
        Person checkPerson = new Person("Alice", 30);
        customObjectPresence.isPresent(checkPerson);
    }
}
