package Encrypt_Decrypt;

import java.util.Scanner;

public class decryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter a four digit number: ");

		int numToDecrypt;

		numToDecrypt = scnr.nextInt();

		int firstDigit = numToDecrypt / 1000;
		int secondDigit = (numToDecrypt % 1000) / 100;
		int thirdDigit = (numToDecrypt % 100) / 10;
		int fourthDigit = (numToDecrypt % 10);

		firstDigit = (firstDigit + 3) % 10;
		secondDigit = (secondDigit + 3) % 10;
		thirdDigit = (thirdDigit + 3) % 10;
		fourthDigit = (fourthDigit + 3) % 10;

		System.out.println("Your decrypted number is : " + firstDigit + secondDigit + thirdDigit + fourthDigit);

	}

}
