//Isaac Rowaiye
import java.util.*;
public class p2 {

	public static double dotProduct(double [] a ,double [] b) { //method 1
	  //Precondition: The arrays a & b must be the same size. 
		double value = 0;
	    double sum = 0 ;
	    
	    if (a.length == b.length) { //if statement making sure a and b are the same size
	    	
	    	for (int i = 0 ; i < a.length ; i++) { //making sure that every part of the matrix is included in the multiplication
	 	    
	    		value = a[i] * b [i]; //multiplying the array a and the array b together.
	 	        
	    		sum = sum + value ; //adding the values of the array together and allocating it to sum. 
	 	    }
	    } else { // making sure that sum is -1.0  if the arrays are not the same size. 
	    		sum = -1.0; 
	    }
//Postcondition: It will return the dot product of a & b. It will return -1.0 if precondition is not met. 

		return sum;
	}


	 public static void matTranspose(double a[][]) {  //method 2
	  // Precondition: the matrix must be square
		 int i=0;  int j=0; 
	        int n = a.length; //allocating the size of a to n.
	        
	        if (i == j) {
	        for (i = 0; i < n; i++) { 
	        	for (j = 0; j > i; j++) { 
	            	a[i][j] = a[j][i]; //making the rows and columns switch places (transpose). 
	            }
	        }
	        } else {
	        	
	        }
//Postcondition: the array a is now transposed.  
	        return; 
	        }

public static double [][] matMult(double [][]a, double [][] b){ //method 3
	//Precondition: the matrices must be the same size and square
	double [][]c = null;
	int i = 0, j = 0;
	
	// if the matrices are square and the same size
	if (a.length == b.length) { //making sure the matrices are the same size
	
		c = new double[a.length][a.length]; //making sure the matrices are square
		
		matTranspose(b); //transpose matrix b
		
		for (i=0; i < a.length; i++) {
			for (j=0; j < a.length; j++) {
				c[i][j]=dotProduct(a[i],b[j]); //storing the dot product of matrix a & b into c
				
			}
		}			
		matTranspose(b); //Transpose matrix b
			return c;
	}
	else {
		return null;
	}
//Postcondition: performs the dot product on array a & b and stores the values inside of c. If precondition is not met null is returned. 
}


public static void matIdentity(double [][] a) { //method 4
// Precondition: The matrix must be square
	int i, j;
	i = 0; j = 0;
	for (i=0; i < a.length; i++) {
		for (j = 0; j < a[i].length; j++) {
			if (i != j) {
				a[i][j] = 0.0;
			}
			else {
				a[i][j] = 1.0;
			}
		}
	}
// Postcondition: a is the identity matrix.
	}

public static double matSum(double [][]a) {  //method 5
	//Precondition: none
	int i , j;
	double sum=0;
	for (i=0; i < a.length; i++ ) {
		for (j=0; j < a.length; j++) {
			sum += a[i][j]; 
		}
	}
	//Postcondition:It returns summation of matrix values
	return sum;
}

public static void matRandom(double[][] a) { //method 6
	//Precondition: none
	Random rand = new Random(); // creating a random from the random class
	 
	 for (int i=0; i < a.length; i++ ) {
			for (int j=0; j < a.length; j++) {
				
				int upperbound = 10; //making the random
				 int x = rand.nextInt(upperbound);
				 
				  a[i][j] = x; //making the rows and columns of a random and assigning it to x. 
			}
	 }
	  return;
	 //Post condition: It assigns random values into the matrix of a. 
}

public static double [] matStats(double [][]a) { //method 7
	//Precondition: none
	double aOut[] = new double[3];
    double min = a[0][0];
    double max = a[0][0];
    double sum = 0;
    int i; 
    for ( i = 0; i < a.length; i++) {
    	for (int j = 1; j < a.length; j++) {
    	if(a[i][j] < min) {
    		min = a[i][j];
    	}else if (a[i][j] > max){
    		max = a[i][j];
    		
    }
    	 sum += a[i][j];
    }
    
    }
   
    aOut[0] = min;
    aOut[1] = max;
    aOut[2] = sum/(a.length * a.length);

    return aOut;
//Postconditon: Returns the values of min, max, and mean. 
}

 public static void main(String args[]) {
	 double[] stats = new double [3];
	 double[][]a = new double [1000][1000]; // creating matrix a with dimensions 1000x1000
	 double[][]b = new double [1000][1000]; //creating matrix b with dimensions 1000x1000
	 double [][]c = new double [1000][1000]; //creating matrix c with dimensions 1000x1000
	 
	 matRandom(a); 
	 matIdentity(b);
	 
	 double sum1 = matSum(a);
	 double sum2 = matSum(b);
	 System.out.println("sum 1 is  " + sum1 +" " + "sum 2 is " + sum2);
	 
	 c = matMult(a,b);
	 double sum3 = matSum(c);
	 System.out.println("sum 1 is equal to sum 3: " + (sum1 == sum3)); //verification that sum1 equals sum3
	 
	 
	 System.out.println("sum2 is equal to dimension of matrix b:" + (sum2 == b.length)); //verification that sum2 is equal to the dimension of matrix b
	 
	 stats = matStats(c); //calling method matStats and storing it into the variable stats
	 System.out.println("The min is " +stats[0]); //printing the min
	 System.out.println("The max is " +stats[1]); //printing the max
	 System.out.println("The mean is " +stats[2]); //printing the mean
	
 }
}
