/**
 * @Class: SpeedLight
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: January 26, 2023
 * Description: The speed of sound is approximately 340 meter per second. Assume that you just saw a lightning flash
 * and you heard the sound of thunder 5 seconds later. Write a program named SpeedLight.java that calculate the
 * distance to a lightning strike based on the time elapsed between the flash and the sound of thunder.
 */
public class SpeedLight {
    public static void main(String[] args) {
        int speedOfSound = 340;
        int soundOfThunder = 5;
        int distance = speedOfSound * soundOfThunder; //Calculates the distance of the lightning strike
        System.out.println("Based on the time elapsed between the flash and the sound of thunder, the distance is "
                + distance + " meters.");
    }
}
