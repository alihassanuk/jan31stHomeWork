package jan31stHomework;

public class LdPatrolPractice0203 {

	public static void main(String[] args) {
	
	//...................if statement............
	
    int x=20;
	int y=30;
	if (x>y)
	{
	System.out.println("x is larger");
	}	
	else 
	{	
	System.out.println("y is larger");	
	}	
		
	//.................Nested if statement.......
    
	int day=8;
	if (day==1) System.out.println("Monday");
	else if (day==2) System.out.println("Tuesday");
	else if (day==3) System.out.println("Wednessday");
	else if (day==4) System.out.println("Thursday");
	else if (day==5) System.out.println("Friday");
	else if (day==6) System.out.println("Saturday");
	else if (day==7) System.out.println("Sunday");
	else if (day>7)
	{
	System.out.println("Invalid day of the week");	
	
	
	//..................Switch statements.........
	
	int month=12;
	switch(month)
	{
	case 1:  System.out.println("Janury"); break;
	case 2:  System.out.println("February"); break;
	case 3:  System.out.println("March"); break;
	case 4:  System.out.println("April"); break;
	case 5:  System.out.println("May"); break;
	case 6:  System.out.println("June"); break;
	case 7:  System.out.println("July"); break;
	case 8:  System.out.println("August"); break;
	case 9:  System.out.println("September"); break;
	case 10: System.out.println("October"); break;
	case 11: System.out.println("November"); break;
	case 12: System.out.println("December"); break;
	case 13: System.out.println("Invalid Month Entered");	
	
	}	
	 }
	  }
	   }

