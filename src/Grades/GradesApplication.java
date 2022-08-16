// Complete - Java II - Collections Exercises (did not do GroceryList)
// Refactor into smaller methods
package Grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        Student John = new Student("John");
        John.addGrade(89);
        John.addGrade(85);
        John.addGrade(99);
        John.recordAttendance("8/15/22", "A");
        John.recordAttendance("8/16/22", "P");
        John.recordAttendance("8/17/22", "A");
        John.recordAttendance("8/18/22", "P");
        Student Chris = new Student("Chris");
        Chris.addGrade(34);
        Chris.addGrade(89);
        Chris.addGrade(99);
        Chris.recordAttendance("8/15/22", "A");
        Chris.recordAttendance("8/16/22", "A");
        Chris.recordAttendance("8/17/22", "A");
        Chris.recordAttendance("8/18/22", "P");
        Student Chase = new Student("Chase");
        Chase.addGrade(66);
        Chase.addGrade(67);
        Chase.addGrade(90);
        Chase.recordAttendance("8/15/22", "A");
        Chase.recordAttendance("8/16/22", "A");
        Chase.recordAttendance("8/17/22", "A");
        Chase.recordAttendance("8/18/22", "A");
        Student Sam = new Student("Sam");
        Sam.addGrade(66);
        Sam.addGrade(76);
        Sam.addGrade(99);
        Sam.recordAttendance("8/15/22", "P");
        Sam.recordAttendance("8/16/22", "P");
        Sam.recordAttendance("8/17/22", "P");
        Sam.recordAttendance("8/18/22", "P");
        students.put("Johncode", John);
        students.put("Greenbean", Chris);
        students.put("Chase-Forestello", Chase);
        students.put("SamueB", Sam);

        // Array that holds all students usernames for iterating through
        // a proper list of usernames using length while still having access
        // to the Student object for grabbing students names

        // Program is set up this way because hashmap key-value pairs have no way to iterate through them
        // without passing in the desired key for each iteration. So if you want to iterate through
        // each key then you must create a key-set variable that holds all the hashmap keys to serve
        // as a guide for which key-values to iterate through and grab
        String[] keySet = students.keySet().toArray(new String[0]);

        // Confirmation for do-while to continue prompting to see a new
        // students grades

        // Command Line Interface begins
//        boolean confirmation;
        do {
            System.out.println("Which user would you like more information on?");
            System.out.println(students.keySet() + " or [ALL]" + " or [Class AVG]" + " or [CSV]");
            String userResponse = input.getString("User:");
            System.out.println("---------------------------------------------------------");
            // Condition for showing individual student entries
            if (students.containsKey(userResponse)) {
                System.out.println("Name: " + students.get(userResponse).getName());
                System.out.println("GitHub Username: " + userResponse);
                System.out.println("Current grades: " + students.get(userResponse).getGrades());
                double gradeAvg = students.get(userResponse).getGradeAverage();
                System.out.format("Current Average: " + "%.1f%n", gradeAvg);
                System.out.println("Attendance Percentage: " + students.get(userResponse).attendancePercentage() + "%");
                System.out.println("Days missed: ");
                students.get(userResponse).getDaysMissed();
                System.out.println("---------------------------------------------------------");
                // Condition for showing all student entries
            } else if (userResponse.equalsIgnoreCase("all")) {
                for (int i = 0; i < keySet.length; i++) {
                    double gradeAvg = students.get(keySet[i]).getGradeAverage();
                    if (i < keySet.length - 1) {
                        getAllStudents(students, keySet, i, gradeAvg);
                        System.out.println("-----------------------------------");
                        // Fencepost condition to stop printing horizontal divider on last student
                    } else if (i >= keySet.length - 1) {
                        getAllStudents(students, keySet, i, gradeAvg);
                    }
                }
                System.out.println("---------------------------------------------------------");
                // Condition to show entire class average
            } else if (userResponse.equalsIgnoreCase("Class AVG")) {
                int avg = 0;
                for (String s : keySet) {
                    avg += students.get(s).getGradeAverage();
                }
                System.out.println("Overall Class Average:" + avg / keySet.length);
                // Condition to output a CSV of all student entries
            } else if (userResponse.equalsIgnoreCase("CSV")) {
                System.out.println("name,github_username,average,attendance_percentage");
                for (String s : keySet) {
                    System.out.print(students.get(s).getName() + ",");
                    System.out.print(s + ",");
                    double gradeAvg = students.get(s).getGradeAverage();
                    System.out.format("%.1f", gradeAvg);
                    System.out.print(",");
                    System.out.println(students.get(s).attendancePercentage() + "%");
                }
                System.out.println("---------------------------------------------------------");
                // Else condition for overall if-else loop if user input is not a valid
                // student entry
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + "\"" + userResponse + "\"" + ".");
            }
            System.out.println();
            // Do-while confirmation to continue or exit loop
        } while (confirmation());
        System.out.println("Thank you!");
    }

    // Get all students method
    public static void getAllStudents(HashMap<String, Student> students, String[] keySet, int i, double gradeAvg) {
        System.out.println("Name: " + students.get(keySet[i]).getName());
        System.out.println("GitHub Username: " + keySet[i]);
        System.out.println("Current grades: " + students.get(keySet[i]).getGrades());
        System.out.format("Current Average: " + "%.1f%n", gradeAvg);
        System.out.println("Attendance Percentage: " + students.get(keySet[i]).attendancePercentage() + "%");
        System.out.println("Days missed: ");
        students.get(keySet[i]).getDaysMissed();
    }

    // Confirmation method
    public static boolean confirmation() {
        Input input = new Input();
        String userInput = input.getString("See another student? [ y , n ]:");
        if (userInput.equalsIgnoreCase("y")) {
            return true;
        } else if (userInput.equalsIgnoreCase("n")) {
            return false;

        } else {
            System.out.println("Invalid input.");
            return confirmation();
        }
    }
}