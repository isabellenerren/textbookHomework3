/**
 * Class: Triangle
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 8, 2023
 *
 * Description: This class calculates the perimeter of a triangle if the input is valid
 */
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of first side: ");
        double sideOne = input.nextDouble();
        System.out.print("Enter length of second side: ");
        double sideTwo = input.nextDouble();
        System.out.print("Enter length of third side: ");
        double sideThree = input.nextDouble();

        boolean b = ((sideOne + sideThree) > sideTwo);
        boolean a = ((sideTwo + sideThree) > sideOne);
        boolean c = ((sideTwo + sideOne) > sideThree);
        boolean b1 = (a == true) && (c == true);
        boolean b2 = (b == true) && (b1 == true);
        if (b2 == true)
        {
            double perimeter = sideOne + sideTwo + sideThree;
            System.out.println("Perimeter = " + perimeter);
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
