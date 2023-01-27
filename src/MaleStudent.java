/**
 * @Class: MaleStudent
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: January 26, 2023
 * Description: Assume that there are 389 students in a small middle school. There are 175 female students.
 * Write a program named MaleStudent.java to compute how many students are male in this middle school.
 */
public class MaleStudent {
    public static void main(String[] args) {
        int totalStudents = 389;
        int totalFemaleStudents = 175;
        int totalMaleStudents = totalStudents - totalFemaleStudents; //formula for the total number of male students
        System.out.println("There is a total of " + totalMaleStudents + " male students.");
    }
}
