import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args) {
			int loop;
			int prime = 1;
			Scanner input = new Scanner(System.in);
			System.out.print("Please Enter your Choosable  Number : ");
			int number = input.nextInt();

		   for(loop = 2; loop < number; loop++) {
		      if((number % loop) == 0) {
		         prime = 0;
		      }
		   }

		   if (prime == 1){
		      System.out.println( number +" is a prime number.");
		   }
		   else{
		      System.out.print( number +" is not a prime number.");
		   }
	}
}