/**
 * @Class: Cycle
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: January 26, 2023
 * Description: In the Cycle shop, there are 10 bicycles and X numbers of tricycles. Assume that you count
 * the number of wheels of the bicycles and there are 47 wheels of the bicycles and tricycles.
 * How many of tricycle does this Cycle shop have? Write a program named Cycle.java and compute the total
 * number tricycles at the shop.
 */
public class Cycle {
    public static void main(String[] args) {
        int bicycle = 10;
        int totalWheels = 47;
        int bicycleWheels = bicycle * 2; //Calculates the total number of bicycle wheels
        int tricycleWheels = totalWheels - bicycleWheels; //Calculates the total number of tricycle wheels
        int tricycle = tricycleWheels / 3; //Calculates the total number of tricycle
        System.out.println("There is a total of " + tricycle + " tricycles.");
    }
}
