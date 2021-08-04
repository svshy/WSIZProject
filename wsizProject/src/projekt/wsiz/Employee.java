package projekt.wsiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private Sex sex;
    private int salary;
    private String[] skills;



    //utowrzenie obiektu przez konstruktor
    public Employee(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    public Employee() {

    }

    //utworzenie obiektu i wczytanie danych przez metodę statyczną
    public static Employee createAndReadEmployee() {
        Employee employee = new Employee();
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        employee.setFirstname(scan.nextLine());
        System.out.print("Podaj nazwisko: ");
        employee.setLastname(scan.nextLine());
        System.out.print("Podaj wiek: ");
        employee.setAge(scan.nextInt());
        System.out.print("Podaj płeć: ");
        char sexChar = scan.next().toUpperCase().charAt(0);
        employee.setSex(sexChar == 'K' ? Sex.FEMALE:Sex.MALE);
        System.out.print("Podaj zarobki: ");
        employee.salary = scan.nextInt();
        scan.nextLine();
        System.out.println("Podaj umiejętności: ");
        String[] skills = scan.nextLine().split(",");
        employee.setSkills(skills);
        return employee;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

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

    // nadpisana metoda toString zwracająca informacje o pracowniku


    @Override
    public String toString() {
        return firstname + " " + lastname + " " + age + " " + sex.getSex() + " " + salary + " " + Arrays.toString(skills);

    }
}
