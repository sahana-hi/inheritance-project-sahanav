public class Teacher extends Person{
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, int subject, int salary)
    {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // TODO Add methods

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", is a teacher!";
    }
}
