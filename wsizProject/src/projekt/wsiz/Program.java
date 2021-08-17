package projekt.wsiz;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Company company = new Company();

        Scanner scan = new Scanner(System.in);

        boolean isWorking = true;
        while (isWorking) {
            System.out.println("Lista operacji:\n");
            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj programistę");
            System.out.println("3 - dodaj kierownika");
            System.out.println("4 - usuń pracownika");
            System.out.println("9 - zakończ program\n");
            System.out.print("Podaj numer operacji: ");

            int selectOption = scan.nextInt();
            switch (selectOption) {
                case 1:
                    company.printEmployees();
                    break;
                case 2:
                    company.addDeveloper();
                    break;
                case 3:
                    company.addManager();
                    break;
                case 4:
                    company.removeEmployee();
                    break;
                case 9:
                    isWorking = false;
                    break;
                default:
                    System.err.println("Operacja o podanym numerze nie istnieje");
            }

        }
    }

}
