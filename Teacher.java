public class Teacher extends Person{
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, int subject, int salary)
    {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public String setSubject(String s) {
        subject = s;
    }

    public double setSalary(double sal) {
        salary = sal;
    }

    // TODO Add methods

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", is a teacher!";
    }
}
