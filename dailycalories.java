import java.util.Scanner;
public class dailycalories {



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
			System.out.println("What is your age");
			int age = scanner.nextInt();
			System.out.println("What is your activity level?");
			System.out.println("Press 1 for Sedentary, 2 for Low Active, 3 for Moderately active, 4 for very active, 5 for Extremely Active");
			int ALF = scanner.nextInt();
			switch (ALF) {
			case 1: 
				double ALF1 = 1.2;
				int cal = (int) (ALF1*((6.25*weight)+(12.7*height)-(6.76*age)+66));
				System.out.println("Your daily caloric expenditure is  " + cal);
				break;
			case 2: 
				double ALF2 = 1.375;
				int cal1 = (int) (ALF2*((6.25*weight)+(12.7*height)-(6.76*age)+66));
				System.out.println("Your daily caloric expenditure is  " + cal1);
				break;
			case 3: 
				double ALF3 = 1.55;
				int cal2 = (int) (ALF3*((6.25*weight)+(12.7*height)-(6.76*age)+66));
				System.out.println("Your daily caloric expenditure is  " + cal2);
				break;
			case 4:
				double ALF4 = 1.725;
				int cal3 = (int) (ALF4*((6.25*weight)+(12.7*height)-(6.76*age)+66));
				System.out.println("Your daily caloric expenditure is  " + cal3);
				break;
			case 5: 
				double ALF5 = 1.9;
				int cal4 = (int) (ALF5*((6.25*weight)+(12.7*height)-(6.76*age)+66));
				System.out.println("Your daily caloric expenditure is  " + cal4);
				break;
				
			}
		
		break; 
		case 2: 
			System.out.println("What is your height in inches? ");
			int heightf = scanner.nextInt();
			System.out.println("What is your weight in pounds? ");
			int weightf = scanner.nextInt();
			System.out.println("What is your age");
			int agef = scanner.nextInt();
			System.out.println("What is your activity level?");
			System.out.println("Press 1 for Sedentary, 2 for Low Active, 3 for Moderately active, 4 for very active, 5 for Extremely Active");
			int ALFf = scanner.nextInt();
			switch (ALFf) {
			case 1: 
			double ALf = 1.2;
			int fcal = (int) (ALf * ((4.35 * weightf) + (4.7* heightf ) -(4.68 * agef)+655));
			System.out.println("Your daily caloric expenditure is  " + fcal);
			break; 
			case 2: 
				double ALf1 = 1.375;
				int fcal2 = (int) (ALf1 * ((4.35 * weightf) + (4.7* heightf ) -(4.68 * agef)+655));
				System.out.println("Your daily caloric expenditure is  " + fcal2);
				break; 
			case 3: 
				double ALf2 = 1.55;
				int fcal3 = (int) (ALf2 * ((4.35 * weightf) + (4.7* heightf ) -(4.68 * agef)+655));
				System.out.println("Your daily caloric expenditure is  " + fcal3);
				break;
			case 4: 
				double ALf3 = 1.725;
				int fcal4 = (int) (ALf3 * ((4.35 * weightf) + (4.7* heightf ) -(4.68 * agef)+655));
				System.out.println("Your daily caloric expenditure is  " + fcal4);
				break;
			case 5: 
				double ALf11 = 1.9;
				int fcal21 = (int) (ALf11 * ((4.35 * weightf) + (4.7* heightf ) -(4.68 * agef)+655));
				System.out.println("Your daily caloric expenditure is  " + fcal21);
				break;
			}
		
			/*double fcal = ALf * ((4.35 * weightf) + (4.7* heightf ) -(4.68 * agef)+655);
			System.out.println("Your daily caloric expenditure is  " + fcal);
		break; */
		}
	}
	}
