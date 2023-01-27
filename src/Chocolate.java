/**
 * @Class: Chocolate
 * @Author: Richard Park
 * @Course: ITEC 2140 - 04, Spring 2023
 * @Written: January 26, 2023
 * Description: Assume there are 9 bags of chocolate bars. Each bag has two chocolate bars.
 * The bag is big enough to have three chocolate bars. If you want to take all the chocolates out of each
 * bag and add three chocolate bars to each bag, how many bags will you need? Write a program to compute the
 * number of bags you will need to add three chocolates instead of two chocolates.
 */
public class Chocolate {
    public static void main(String[] args) {
        int bagsOfChocolate = 9;
        int totalChocolate = bagsOfChocolate * 2; //Calculate the total number of chocolate bars
        int threeChocolate = totalChocolate / 3; //Calculate the total number of bags to fit three chocolate bars
        System.out.println("You will need " + threeChocolate + " bags to fit three chocolate bars for each bag.");
    }
}