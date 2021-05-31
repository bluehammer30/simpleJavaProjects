
//Isaac Rowaiye
import java.util.*;

public class rollerdice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create arrays to hold the count for each side and each percentage
		String[] sides = { "Ones", "Twos", "Threes", "Fours", "Fives", "Sixes", "Sevens", "Eights" };
		double[] count = new double[8];
		double[] percentage = new double[8];
	
		//allow us to generate random numbers
		Random rand = new Random();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Roller Dice!");
		System.out.println("How many rolls of the dice do you want?");
		int rolls = scanner.nextInt();

		System.out.println("Calculating for " + rolls + " rolls...");
		System.out.println("Results:");

		//for loop to generate random numbers for as many times as user said to roll
		//for each time the random number lands on a side we will add one to the side
		for (int i = 0; i < rolls; i++) {
			//generating random numbers from 1-8
			int num = rand.nextInt(8) + 1;
			if (num == 1) {
				count[0] += 1;
			}
			if (num == 2) {
				count[1] += 1;
			}
			if (num == 3) {
				count[2] += 1;
			}
			if (num == 4) {
				count[3] += 1;
			}
			if (num == 5) {
				count[4] += 1;
			}
			if (num == 6) {
				count[5] += 1;
			}
			if (num == 7) {
				count[6] += 1;
			}
			if (num == 8) {
				count[7] += 1;
			}
		}

		//printing out the individual sides, count, and percentage
		for (int i = 0; i < count.length; i++) {
			percentage[i] = (double) ((count[i] / rolls) * 100);
			System.out.println("Side of the dice: " +sides[i] + " Count: " + count[i] + " Percentage: " +String.format("%.2f", percentage[i]));
		}

		scanner.close();
	}

}
