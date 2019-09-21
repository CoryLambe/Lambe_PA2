package lambe_p2;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int height;
		int weight;
		double bmi;

		System.out.println("************Welcome to the BMI calculator!***********");
		System.out.println("To have your BMI caculated , respond to the following.");

		System.out.println("Please enter your body weight in pounds: ");
		weight = scnr.nextInt();

		System.out.println("Please enter your height in inches: ");
		height = scnr.nextInt();

		bmi = (703 * weight) / (height * height);
		System.out.println("Your BMI is : " + bmi);
		System.out.println("");
		System.out.println("The BMI categories and their values are listed below.");
		System.out.println("");
		System.out.println("Underweight = less than 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");

	}

}