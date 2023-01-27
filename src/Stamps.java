/**
 * @Class: Stamps
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: January 26, 2023
 * Description: Susan and Jean just started collecting stamps as a hobby. Susan has 8 endangered animal
 * collection stamps and Jean has 40 racing car collection stamps. How many more does Jean have than Susan?
 * Write a program named Stamps.java that compute the difference between Jean’s and Susan’s collections of the stamps.
 */
public class Stamps {
    public static void main(String[] args) {
        int susan = 8;
        int jean = 40;
        int stampDifference = jean - susan; //Compute the difference between Jean and Susan
        System.out.println("Jean has " + stampDifference + " more stamps than Susan.");
    }
}
