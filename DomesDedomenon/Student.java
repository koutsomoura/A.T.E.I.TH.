
public class Student {
    private int AM;
    private String name;
    private String lname;
    private double age;
    private char sex;
    private int apousies;
    private double grade;

    public Student(int AM, String name, String lname, double age, char sex, int apousies, double grade) {
        this.AM = AM;
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.sex = sex;
        this.apousies = apousies;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Student{" + "AM=" + AM + ", name=" + name + ", lname=" + lname + ", age=" + age + ", sex=" + sex + ", apousies=" + apousies + ", grade=" + grade + '}';
    }

    public int getAM() {
        return AM;
    }

    public double getGrade() {
        return grade;
    }
    
    
}
