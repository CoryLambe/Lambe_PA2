package Encrypt_Decrypt;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter a four digit number: ");

		int numToEncrypt;

		numToEncrypt = scnr.nextInt();

		int firstDigit = numToEncrypt / 1000;
		int secondDigit = (numToEncrypt % 1000) / 100;
		int thirdDigit = (numToEncrypt % 100) / 10;
		int fourthDigit = (numToEncrypt % 10);

		firstDigit = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;

		System.out.println("Your encrypted number is : " + thirdDigit + fourthDigit + firstDigit + secondDigit);

	}

}
