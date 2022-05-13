package Operations;
import java.util.Scanner;


public class OctalToHexa

	{
	   public static void main(String[] args)
	   {
	      String octnum, hexnum;
	      int decnum;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Octal Number: ");
	      octnum = scan.nextLine();
	      
	      decnum = Integer.parseInt(octnum, 8);
	      hexnum = Integer.toHexString(decnum).toUpperCase();
	      
	      System.out.println("Hexadecimal Value = " +hexnum);
	   }
	}

