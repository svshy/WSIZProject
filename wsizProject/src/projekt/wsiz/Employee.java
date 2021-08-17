package projekt.wsiz;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public abstract class Employee {
    private String firstname;
    private String lastname;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

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

    protected Employee() {

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
        return firstname + " " + lastname + " " + age + " " + sex.getSex() + " " + getTotalSalary() + " " + Arrays.toString(skills);

    }

    protected void readFields() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        this.firstname = scan.next();
        System.out.print("Podaj nazwisko: ");
        this.lastname = scan.next();
        System.out.print("Podaj wiek: ");
        this.age = scan.nextInt();
        System.out.print("Podaj płeć: ");
        char sexChar = scan.next().toUpperCase().charAt(0);
        this.sex = sexChar == 'K' ? Sex.FEMALE : Sex.MALE;
        System.out.print("Podaj zarobki: ");
        this.salary = scan.nextInt();
        scan.nextLine();
        System.out.print("Podaj umiejętności: ");
        String[] skills = scan.nextLine().split(",");
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skills[i].trim();
        }
        this.skills = skills;
    }

    public abstract int getTotalSalary();
}
