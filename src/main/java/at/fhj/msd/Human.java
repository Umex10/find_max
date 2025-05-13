package at.fhj.msd;

public class Human implements Comparable<Human> {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", this.name, this.age);
    }

    @Override
    public int compareTo(Human other) {

        if (this.age > other.age) {
            return 1;
        }
        if (this.age < other.age) {
            return -1;
        }

        return 0;
    }

}
