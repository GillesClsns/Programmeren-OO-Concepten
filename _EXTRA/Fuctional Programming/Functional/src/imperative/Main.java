package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Gilles", MALE),
                new Person("Rosalie", FEMALE),
                new Person("Alice", FEMALE),
                new Person("Blake", MALE)
        );

        System.out.println("Imperative approach");

        List<Person> females = new ArrayList<>();

        for (Person person : people) {

            if (FEMALE.equals(person.gender)) {
                females.add(person);

            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Declarative approach (Streams with Collections)");

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .toList();

        females2.forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}
