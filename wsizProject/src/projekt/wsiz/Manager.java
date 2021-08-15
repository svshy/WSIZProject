package projekt.wsiz;

import java.util.Scanner;

public class Manager extends Employee{

    public Manager(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    static Manager createAndReadEmployee() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String firstname = scan.next();
        System.out.print("Podaj nazwisko: ");
        String lastname = scan.next();
        System.out.print("Podaj wiek: ");
        int age = scan.nextInt();
        System.out.print("Podaj płeć: ");
        char sexChar = scan.next().toUpperCase().charAt(0);
        Sex sex = sexChar == 'K' ? Sex.FEMALE : Sex.MALE;
        System.out.print("Podaj zarobki: ");
        int salary = scan.nextInt();
        scan.nextLine();
        System.out.println("Podaj umiejętności: ");
        String[] skills = scan.nextLine().split(",");
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skills[i].trim();
        }
        return new Manager(firstname, lastname, age, sex, salary, skills);

    }
}
