/**
 * Class: BMI
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 8, 2023
 *
 * Description: This class calculates the BMI of a person given their weight in pounds and height in inches
 * and then returns the interpretation of that BMI.
 */

import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double kg = pounds * 0.4536;
        double m = inches * 0.0254;

        double BMI = (kg / (m * m));

        boolean a = (BMI < 18.5);
        boolean b = (BMI >= 18.5) && (BMI < 25.0);
        boolean c = (BMI >= 25.0) && (BMI < 30.0);
        if (a == true)
        {
            String interpretation = "Underweight";
            System.out.println("BMI Interpretation = " + interpretation);
        }
        else if (b == true)
        {
            String interpretation = "Normal";
            System.out.println("BMI Interpretation = " + interpretation);
        }
        else if (c == true)
        {
            String interpretation = "Overweight";
            System.out.println("BMI Interpretation = " + interpretation);
        }
        else
        {
            String interpretation = "Obese";
            System.out.println("BMI Interpretation = " + interpretation);
        }
    }
}
