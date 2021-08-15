package projekt.wsiz;

public class Developer extends Employee {

    public Developer(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    private Developer() {
        super();
    }


    static Developer read(){
        Developer developer = new Developer();
        developer.readFields();

        return developer;
    }
}

