//sum of even and odd number
	import java.util.Scanner;
	public class SumOddNum{
	  public static void main(String[] args)
	  {
	    int number, i, evenSum = 0, oddSum = 0;
	   Scanner sc = new Scanner(System.in);
	    
	    System.out.print(" Please Enter any Number : ");
	    number = sc.nextInt();  
	    
	    i = 1;
	    
	    while(i <= number)
	    {
	      if(i % 2 == 0)
	      {
	        evenSum = evenSum + i; 
	      }
	      else
	      {
	        oddSum = oddSum + i;
	      }
	      i++;
	    }
	    System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
	    System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	  }
	}