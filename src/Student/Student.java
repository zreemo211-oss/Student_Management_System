 
package Student;

public class Student {

    private String nationalId;
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String nationalId, String name, int age, double grade) {
        this.nationalId = nationalId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    
    
 // Display student information
    public void displayInfo() {
        System.out.println("ID: " + nationalId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + getStatus());
        System.out.println("Evaluation: " + getEvaluation());
    }

    // Determine student status
    public String getStatus() {
        if (grade >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    // Determine student evaluation
    public String getEvaluation() {
        if (grade >= 90) {
            return "Excellent";
        } else if (grade >= 80) {
            return "Very Good";
        } else if (grade >= 70) {
            return "Good";
        } else if (grade >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    
    
 // Getters
    public String getNationalId() {
        return nationalId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
