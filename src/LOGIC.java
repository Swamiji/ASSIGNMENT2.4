import java.util.Scanner;
public class LOGIC {

	
	public static void main(String[] args) {
		
		       int i;
		    	   System.out.println("Enter the Number:");
		    	   Scanner r=new Scanner(System.in);
		    	   i=r.nextInt();
		    	   if(i==0)
		    	   {
		    		   System.out.print("You Have Enter Zero");
		    	   }
		    	   else if(i>0)
		    	   {
		    		   System.out.print("You Have Enter Positive Number");
		    	   }
		    	   else if(i<0)
		    	   {
		    		   System.out.print("You Have Enter Negative Number");
		    	   }
		       else 
		       {
		    	   System.out.print("The Number is Not Valid"); 
		       }
			

		}

	}


