// Complete - Java II - Collections Exercises (did not do GroceryList)
package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>(0);
        this.attendance = new HashMap<>(0);
    }

    // Returns the student's name
    public String getName() {
        return name;
    }

    // Adds the given grade to the grades property
    public void addGrade(int... grade) {
        for (int i = 0; i < grade.length; i++) {
            grades.add(grade[i]);

        }
    }

    // Adds the given date and presence to the attendance property
    public void recordAttendance(String date, String presence) {
        if (presence.equalsIgnoreCase("A") || presence.equalsIgnoreCase("P")) {
            attendance.put(date, presence);
        } else {
            System.out.println("Invalid value input (\"A\" or \"P\" only)");
        }
    }

    // Returns a given students' attendance percentage
    public double attendancePercentage() {
        String[] entrySet = attendance.values().toArray(new String[0]);
        double absences = 0;
        for (int i = 0; i < this.attendance.size(); i++) {
            if (entrySet[i].equalsIgnoreCase("A")) {
                absences++;
            }
        }
        return (attendance.size() - absences) / attendance.size() * 100;
    }

    public void getDaysMissed() {
        String[] entrySet = attendance.values().toArray(new String[0]);
        for (int i = 0; i < entrySet.length; i++) {
            if (entrySet[i].equalsIgnoreCase("A")) {
                String[] keys = (attendance.keySet()).toArray(new String[0]);
                System.out.println(keys[i]);
            }
        }
    }

    // Returns the average of the students grades
    public double getGradeAverage() {
        double avg = 0;
        for (Integer grade : grades) {
            avg += grade;
        }
        return avg / grades.size();
    }

    // Could not get array list to print out without doing this. Must be setting up
    // constructor incorrectly.
    @Override
    public String toString() {
        return "" + grades + attendance;
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    //returns grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
