/**
 * @Class: FindX
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: January 26, 2023
 * Description: Write a program named FindX.java to compute the number X based on the
 * following formula: 5 + 19 + X + 47 = 194
 */
public class FindX {
    public static void main(String[] args) {
        int formula1 = 5 + 19 + 47; //Calculates the left side of the formula
        int formula2 = 194;
        int x = formula2 - formula1; //Calculates the formula to find x
        System.out.println("The number X based on the formula is " + x + ".");
    }
}
