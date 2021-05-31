import java.util.Random;

public class prog1 {

   static double[] initArray(double[] aln) {
      
	   Random rand = new Random();
       
       for (int i = 0; i < aln.length; i++) {
          
    	   int value = rand.nextInt(1000);
          
    	   aln[i] = value;
       }
       return aln;
   }

   static double[] statsArray(double[] aIn) {
      
	   double aOut[] = new double[3];
      
	   double min = aIn[0];
      
	   double max = min;
      
	   double sum = min; // first value
      
	   for (int i = 1; i < aIn.length; i++) {
         
		   double val = aIn[i];
         
		   if (max < val) {
            
			   max = val;
         
		   } else if (min > val) {
          
			   min = val;
           }
          
		   sum += val;
       }
       aOut[0] = min;
       aOut[1] = max;
       aOut[2] = sum / aIn.length;

       return aOut;
   }

   static double findArray(double[] aIn, double start, double stop) {
    
	   double sum = 0;
     
	   int count = 0;
     
	   for (int i = 0; i < aIn.length; i++) {
      
		   if (aIn[i] >= start && aIn[i] <= stop) {
             
			   count += 1;
             
			   sum += aIn[i];
           }
       }
       return sum;
   }

   public static void main(String[] args) {
    
	   double[] rA = new double[100];
     
	   rA = initArray(rA);
     
	   double stats[] = statsArray(rA);
      
	   System.out.println("Minimum value in array is: " + stats[0]);
      
	   System.out.println("Maximum value in array is: " + stats[1]);
      
	   System.out.println("Average value in array is: " + stats[2]);

	   double s1 = findArray(rA, 0, 1000);
      
	   double s2 = findArray(rA, 0, 500);
      
	   System.out.println(s1);
       
	   System.out.println(s2);

   }

}