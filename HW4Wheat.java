
public class HW4Wheat {

	public static float sumItFor(int start, int stop) {

		float sum = 0;
		if (stop < start) {
			for (int i = stop; i <= start; i++) {
				sum = sum + i;
			}
		} else {

			for (int i = start; i <= stop; i++) {
				sum = sum + i;
			}
		}
		return sum;
	}

	static float sumItWhile(int start, int stop) {
float sum = 0;

		if (stop < start) {
			while (stop <= start) {
				int stopFinal = stop++;
				sum = sum + stopFinal;
			}
		} else {
			while (start <= stop) {
				int startFinal = start++;
				sum = sum + startFinal;
			}
		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For loop sums: ");
		System.out.println();
		System.out.println("The sum from 0 to 5 is " + sumItFor(0, 5));
		System.out.println("The sum from 5 to 0 is " + sumItFor(5, 0));
		System.out.println("The sum from 1 to -1 is " + sumItFor(1, -1));
		System.out.println("The sum from -1, to 1 is " + sumItFor(-1, 1));
		System.out.println("The sum from 10 to 50 is " + sumItFor(10, 50));
		System.out.println("The sum from -80 to 80 is " + sumItFor(-80, 80));
		System.out.println("The sum from 50 to -50 is " + sumItFor(50, -50));
		
		System.out.println();
		System.out.println("While loop sums: ");
		System.out.println("The sum from 0 to 5 is " + sumItWhile(0, 5));
		System.out.println("The sum from 5 to 0 is " + sumItWhile(5, 0));
		System.out.println("The sum from 1 to -1 is " + sumItWhile(1, -1));
		System.out.println("The sum from -1, to 1 is " + sumItWhile(-1, 1));
		System.out.println("The sum from 10 to 50 is " + sumItWhile(10, 50));
		System.out.println("The sum from -80 to 80 is " + sumItWhile(-80, 80));
		System.out.println("The sum from 50 to -50 is " + sumItWhile(50, -50));

	}
}