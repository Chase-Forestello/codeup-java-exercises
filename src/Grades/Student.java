// Incomplete - Java II - Collections Exercises
package Grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>(0);
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double avg = 0;
        for (Integer grade : grades) {
            avg += grade;
        }
        return avg/grades.size();
    }

    // Could not get array list to print out without doing this. Must be setting up
    // constructor incorrectly.
    @Override
    public String toString() {
        return ""+grades;

    }

    //returns grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
