package projekt.wsiz;

import java.util.Scanner;

enum EmployeeType{
    DEVELOPER,
    MANAGER
}

public class EmployeeReader {

    static Employee createAndReadEmployee(EmployeeType type) {

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
        if(type==EmployeeType.DEVELOPER)
            return new Developer(firstname, lastname, age, sex, salary, skills);
        else
            return new Manager(firstname, lastname, age, sex, salary, skills);

    }

}
