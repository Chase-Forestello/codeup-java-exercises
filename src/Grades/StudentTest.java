package Grades;

public class StudentTest {
    public static void main(String[] args) {
        Student chase = new Student("Chase");
//        Student sam = new Student("Sam");
//        Student matthew = new Student("Matthew");
        chase.addGrade(98);
        chase.addGrade(76);
        chase.addGrade(88);
//        sam.addGrade(100);
//        sam.addGrade(100);
//        sam.addGrade(100);
//        matthew.addGrade(68);
//        matthew.addGrade(86);
//        matthew.addGrade(98);
        System.out.println(chase);
        System.out.println(chase.getGrades());
        System.out.println("Chase's avg: " + chase.getGradeAverage());
//        System.out.println("Sam's avg: " + sam.getGradeAverage());
//        System.out.println("Matthew's avg: " + matthew.getGradeAverage());

    }
}
