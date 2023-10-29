package done.pr_9;

public class Student {
    int id;
    double gpa;
    String name;
    public Student(int id, double gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;

    }

    public Student(){

    }

    public int getId() {
        return id;

    }

    public double getGpa() {
        return gpa;
    }
    public String getName() {
        return name;
    }



}