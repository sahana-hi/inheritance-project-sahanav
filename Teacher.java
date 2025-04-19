public class Teacher extends Person{
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary)
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

    public void setSubject(String s) {
        subject = s;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    // TODO Add methods

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", is a teacher who teaches the subject" + subject + "and earns $" + salary + "each year";
    }
}
