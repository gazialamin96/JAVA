public class SwitchCase{
	public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  } 

	public static void main(String[] args) {
		/*//Months with Switch
		int month=4;    
	    String monthString="";  
	    //Switch statement  
	    switch(month){    
	    //case statements within the switch block  
	    case 1: monthString="1 - January";  
	    break;    
	    case 2: monthString="2 - February";  
	    break;    
	    case 3: monthString="3 - March";  
	    break;    
	    case 4: monthString="4 - April";  
	    break;    
	    case 5: monthString="5 - May";  
	    break;    
	    case 6: monthString="6 - June";  
	    break;    
	    case 7: monthString="7 - July";  
	    break;    
	    case 8: monthString="8 - August";  
	    break;    
	    case 9: monthString="9 - September";  
	    break;    
	    case 10: monthString="10 - October";  
	    break;    
	    case 11: monthString="11 - November";  
	    break;    
	    case 12: monthString="12 - December";  
	    break;    
	    default:System.out.println("Invalid Month!");    
	    }    
	    //Printing month of the given number  
	    System.out.println(monthString);*/  

	    //Switch with Enam Keyword
	     
	    Day[] DayNow = Day.values(); 

	    for (Day VariableForDay : DayNow){
	    	switch (VariableForDay)    
                {    
                    case Sun:    
                        System.out.println("Sunday");    
                        break;    
                    case Mon:    
                        System.out.println("Monday");    
                        break;    
                    case Tue:    
                        System.out.println("Tuesday");    
                        break;         
                    case Wed:    
                        System.out.println("Wednesday");    
                        break;    
                    case Thu:    
                        System.out.println("Thursday");    
                        break;    
                    case Fri:    
                        System.out.println("Friday");    
                        break;    
                    case Sat:    
                        System.out.println("Saturday");    
                        break;    
                }    

	    }
	}    
}