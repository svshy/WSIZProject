package projekt.wsiz;

import java.util.Arrays;
import java.util.Objects;

public abstract class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private Sex sex;
    private int salary;
    private String[] skills;

    public Employee(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(firstname, employee.firstname) && Objects.equals(lastname, employee.lastname) && sex == employee.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age, sex);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + age + " " + sex.getSex() + " " + salary + " " + Arrays.toString(skills);

    }
}
