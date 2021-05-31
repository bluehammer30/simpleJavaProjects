import java.util.Scanner;
public class BodyFat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your gender? For Male enter: '1' For Female enter '2' ");
		int gender = scanner.nextInt();
		switch (gender) {
		case 1:
			System.out.println("What is your height in inches? ");
			double height = scanner.nextDouble();
			System.out.println("What is your weight in pounds? ");
			double weight = scanner.nextDouble();
			System.out.println("What is your neck circumference in inches?");
			double neck = scanner.nextDouble();
			System.out.println("What is your waist circumference in inches?");
			double waist = scanner.nextDouble();
			double bf = (86.01*(Math.log10(waist-neck))- 70.041 * Math.log10(height)+ 36.76);
			System.out.println("Your body fat percentage is " + bf);
		
		break; 
		case 2: 
			System.out.println("What is your height in inches? ");
			double heightf = scanner.nextDouble();
			System.out.println("What is your weight in pounds? ");
			double weightf = scanner.nextDouble();
			System.out.println("What is your neck circumference in inches?");
			double neckf = scanner.nextDouble();
			System.out.println("What is your waist circumference in inches");
			double waistf = scanner.nextDouble();
			System.out.println("What is your hip circumeference in inches?");
			double hipf = scanner.nextDouble();
			double fbf = (163.205*(Math.log10(waistf+hipf-neckf))- 97.684 * Math.log10(heightf)- 78.387);
			System.out.println("Your body fat percentage is " + fbf);
			break;
		}
			
		/*System.out.println("What is your height in inches? ");
		double height = scanner.nextDouble();
		System.out.println("What is your weight in pounds? ");
		double weight = scanner.nextDouble();
		System.out.println("What is your neck circumference in inches");
		double neck = scanner.nextDouble();
		System.out.println("What is your waist circumference in inches");
		double waist = scanner.nextDouble();
		double bf = (86.01*(Math.log10(waist-neck))- 70.041 * Math.log10(height)+ 36.76);
		System.out.println("Your body fat percentage is " + bf);
	*/
	}

}
