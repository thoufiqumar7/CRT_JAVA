import java.util.Scanner;

class Course {
    public String courseId;
    public String courseName;
    public String subject;

    public Course(String courseId, String courseName, String subject) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.subject = subject;
    }

    public void displayCourse() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Subject     : " + subject);
    }
}

class Student {
    public String name;
    public String college;
    public Course course;

    public Student(String name, String college, Course course) {
        this.name = name;
        this.college = college;
        this.course = course;
    }

    public void displayStudent() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name    : " + name);
        System.out.println("College : " + college);
        System.out.println("\n----- Course Details -----");
        course.displayCourse();
    }
}

public class collegemanagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, welcome " + name + "!");
        System.out.print("Enter your college name: ");
        String college = scanner.nextLine();
        System.out.println("\nEnter your course details:");
        System.out.print("Course ID: ");
        String courseId = scanner.nextLine();
        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        Course course = new Course(courseId, courseName, subject);
        Student student = new Student(name, college, course);
        student.displayStudent();
    }
}
