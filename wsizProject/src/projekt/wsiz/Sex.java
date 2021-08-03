package projekt.wsiz;

public enum Sex {
    FEMALE("K"), MALE("M");

    public final String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
