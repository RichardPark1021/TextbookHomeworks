/**
 * @Class: Circle
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: January 26, 2023
 * Description: Write a program named Circle.java that displays the area and perimeter of a Circle that has a
 * radius of 9.5 using the following formula:
 *area = radius * radius * Math.PI
 *perimeter = 2 * radius * Math.PI
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 9.5;
        double area = radius * radius * Math.PI; //formula for the area of the circle
        double perimeter = 2 * radius * Math.PI; //formula for the perimeter of the circle
        System.out.println("The area of the circle is " + area + " and the perimeter of the circle is " + perimeter + ".");
    }
}
