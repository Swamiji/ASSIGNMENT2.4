import java.util.Scanner;
public class GRADE {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int a=scan.nextInt();
		int marks=a;
			
		switch(marks/10)
		   {
		       case 9 :
		       case 8 :
		       case 7 :
		    	   /*Marks More than 70*/
		           System.out.println(" Grade : A");
		           System.out.println("Student Age is <15");
		           break;
		       case 6 :
		       case 5 :
		       case 4 :    /* Marks between 45-60 */
		           System.out.println(" Grade : B\n" );
		           System.out.println("Student Age is <15");
		           break;
		       case 3 :
		       case 2 :    /* Marks less than 45 */
		       case 1 :    System.out.println(" Grade : C\n" );
		       System.out.println("Student Age is <15");
		           break;
		       
		   }
	}

}

	
