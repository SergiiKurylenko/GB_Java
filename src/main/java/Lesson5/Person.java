package Lesson5;

public class Person {
    private final String NAME;
    private final String SURNAME;
    private final String POSITION;
    private final String EMAIL;
    private final String TELEFON;
    private final double SALARY;
    private final int AGE;

    public Person(String NAME, String SURNAME, String POSITION, String EMAIL, String TELEPHONE, double SALARY, int AGE) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.POSITION = POSITION;
        this.EMAIL = EMAIL;
        this.TELEFON = TELEPHONE;
        this.SALARY = SALARY;
        this.AGE = AGE;
    }

    @Override
    public String toString() {
        return "Person{" +
                "NAME='" + NAME + '\'' +
                ", SURNAME='" + SURNAME + '\'' +
                ", POSITION='" + POSITION + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", TELEPHONE='" + TELEFON + '\'' +
                ", SALARY=" + SALARY +
                ", AGE=" + AGE +
                '}';
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getTELEPHONE() {
        return TELEFON;
    }

    public double getSALARY() {
        return SALARY;
    }

    public int getAGE() {
        return AGE;
    }
}
