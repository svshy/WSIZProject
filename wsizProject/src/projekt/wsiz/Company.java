package projekt.wsiz;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee){
        employees.add(employee);
    }

    public void printEmployees(){
        System.out.println("------------------");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            int employeeIndex = i+1;
            System.out.println(employeeIndex + "  " + employee);

        }
        System.out.println("------------------");
    }
}
