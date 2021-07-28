package projekt.wsiz;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee){
        employees.add(employee);
    }
}
