package InterfaceP;

import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Person p1=new Person("ajay",23,345666);
        Person p2=new Person("bram",24,345666);
        Person p3=new Person("bot",13,345666);
        Person p4=new Person("gattu",8,345666);

        List<Person> list= List.of(p1,p2,p3,p4);

        list.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
    }
}
