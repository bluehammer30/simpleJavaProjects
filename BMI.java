import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("What is your height in meters? ");
Scanner scanner = new Scanner(System.in);
double bmi = scanner.nextDouble();
System.out.println("What is your weight in kg? ");
double Bmi = scanner.nextDouble();
double BMI = (Bmi/(bmi*bmi));
System.out.println("Your BMI is "+BMI);
if (BMI >= 30) {
	System.out.println("According to the data, you are obese ");
}
	else if (BMI <= 18.9 ) {
System.out.println("According to the data, you are underweight");
	}
	else if ((BMI >= 19 )|| (BMI <= 24.9)) {
System.out.println("According to the data, you are a normal weight");
	}
	else if ((BMI >= 25 )|| (BMI <=29.9)) {
		System.out.println("According to the data, you are overweight");
	}
}
}
