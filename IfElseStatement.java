class IfElseStatement{
	public static void main(String[] args) {
		/*//odd Even
		int number =30;
		
		if(number%2 == 0){
			System.out.println("Its a Even Number ");
		}else{
			System.out.println("It's a Odd Number ");
		}*/

		int mark=49;

		if(mark<50){
			System.out.println("Oops!...You are Failed!!");
		}
		else if(mark>=60 && mark<=70){
			System.out.println("Your Grade is C+");
		}
		else if(mark>=70 && mark<=80){
			System.out.println("Your Grade is B+");
		}
		else if(mark>=80 && mark<=90){
			System.out.println("You are Doing a Grate Job!");
			System.out.println("Your Grade is A+");
		}

	}
}