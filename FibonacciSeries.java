//concept: Next number is the summantion of  privious two numbers like:0 1 1 2 3 5 8 13 21 34 55 89
import java.util.Scanner;
public class FibonacciSeries{

	//with recursion
	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }  
	} 
	public static void main(String[] args) {

		/*  //Without recursion
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the number : ");
		int number = input.nextInt();

		int firstNumber = 0,secondNumber = 1,thirdNumber,i;

		System.out.print(firstNumber + " " + secondNumber);

		for (i=2;i<number ; ++i) {
			thirdNumber = (firstNumber + secondNumber);
			System.out.print(" "+thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;

		}*/

		//with Recursion 

			  int count=10;    
			  System.out.print(n1+" "+n2);//printing 0 and 1    
			  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	 }
}