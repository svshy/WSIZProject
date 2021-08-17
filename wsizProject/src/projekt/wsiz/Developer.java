package projekt.wsiz;

public class Developer extends Employee {

    public Developer(String firstname, String lastname, int age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    private Developer() {
        super();
    }

    //Developer z przedrostkiem "P" (Programista)
    @Override
    public String toString() {
        return "P " + super.toString();
    }


    //2% premii od wynagrodzenia bazowego za każdą umiejętność (tablica skills)
    @Override
    public int getTotalSalary() {
        return (int) (getSalary() + getSalary() * getSkills().length * 0.02);
    }


    static Developer read() {
        Developer developer = new Developer();
        developer.readFields();

        return developer;
    }


}

