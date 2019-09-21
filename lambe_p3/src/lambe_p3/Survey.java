package lambe_p3;

import java.util.Scanner;

public class Survey {

	public static void main(String[] args) {
		String topics[] = { "Money", "TimeAlone", "Sushi", "Tailgating", "Sports" };

		int ratings[][] = new int[5][11];
		int numOfPeople;
		int rating;
		int i;
		int j;
		for (i = 0; i < ratings.length; i++) {
			ratings[i] = new int[10];
			for (j = 0; j < ratings[i].length; j++)
				ratings[i][j] = 0;
		}

		Scanner scnr = new Scanner(System.in);

		System.out.print("How many people will be taking the Survey?: ");
		numOfPeople = scnr.nextInt();

		for (i = 0; i < numOfPeople; i++) {
			System.out.println("Please rate each topic (1-10) ");
			for (j = 0; j < topics.length; j++) {
				System.out.print("Enter rating for - " + topics[j] + ": ");
				rating = scnr.nextInt();

				while (rating < 1 || rating > 10) {
					System.out.println("Please only enter ratings 1-10");
					System.out.print("Enter rating for - " + topics[j] + ": ");
					rating = scnr.nextInt();
				}
				ratings[j][rating - 1]++;
			}
		}

		int averageRating[] = new int[topics.length];
		String highestPointIssue = "";
		String lowestPointIssue = "";
		int highestPointTotal = 0;
		int lowestPointTotal = 0;

		for (i = 0; i < ratings.length; i++)

		{
			averageRating[i] = 0;

			for (j = 0; j < ratings[i].length; j++)
				averageRating[i] += (ratings[i][j] * (j + 1));

			if (i == 0) {
				highestPointTotal = averageRating[i];
				lowestPointTotal = averageRating[i];
				highestPointIssue = topics[i];
				lowestPointIssue = topics[i];

			} else {
				if (averageRating[i] > highestPointTotal) {
					highestPointIssue = topics[i];
					highestPointTotal = averageRating[i];
				}

				if (averageRating[i] < lowestPointTotal) {
					lowestPointIssue = topics[i];
					lowestPointTotal = averageRating[i];
				}

			}

			averageRating[i] = averageRating[i] / numOfPeople;

		}
		System.out.println("\nBelow are the results of the survey: ");
		System.out.printf("\n%-12s", "");

		for (i = 0; i < 10; i++)
			System.out.printf("%-5d", (i + 1));

		System.out.printf("%12s", "Avg. Rating");

		System.out.println();

		for (i = 0; i < ratings.length; i++) {
			System.out.printf("\n%-12s", topics[i]);
			for (j = 0; j < ratings[i].length; j++)
				System.out.printf("%-5d", ratings[i][j]);
			System.out.printf("%12d", averageRating[i]);

		}
		System.out.println("\n");

		System.out.println("Highest Point Total: " + highestPointTotal);
		System.out.println("Highest Rated Topic: " + highestPointIssue);

		System.out.println("");

		System.out.println("Lowest Point Total: " + lowestPointTotal);
		System.out.println("Lowest Rated Topic: " + lowestPointIssue);

		scnr.close();

	}

}