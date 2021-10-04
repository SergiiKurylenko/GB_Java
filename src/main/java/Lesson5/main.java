package Lesson5;

public class main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Jhon","Smith", "Manager", "jhon.smith@gmail.com", "+712345678", 2000.50, 35);
        people[1] = new Person("James","Bond", "SCRAM Master", "jhon.smith@gmail.com", "+723456789", 1060.80, 55);
        people[2] = new Person("Julia","Capoletty", "Team Leader", "jhon.smith@gmail.com", "+734567891", 1200.50, 25);
        people[3] = new Person("Tomas","King", "Tester", "jhon.smith@gmail.com", "+745678912", 1010.70, 31);
        people[4] = new Person("Henry","Russell", "Developer", "jhon.smith@gmail.com", "+756789123", 1500.50, 28);


        for (Person person: people) {
            if (person.getAGE()>40)
            System.out.println(person);
        }
    }
}
