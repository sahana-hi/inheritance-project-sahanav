public class CollegeStudent extends Student{
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String m) {
        major = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public String toString() {
        return super.toString() + "year : " + year + ", major : " + major;
    }
}