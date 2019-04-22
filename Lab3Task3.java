import java.util.Scanner;
class Lab3Task3
{
  public static void main(String args[])
  {  
    Scanner ob= new Scanner(System.in);
    System.out.println("Enter any  Alphabet character:");
    char ch=ob.next().charAt(0);
   switch (ch)
	{
		 case 'a':
         case 'A':	
         case 'e':
		 case 'E':
		 case 'i':
		 case 'I':
		 case 'o':
		 case 'O':
		 case 'u':
		 case 'U':
         System.out.println("Entered Character "+" is vowel");
         break;
         default:
         System.out.println("Entered Character is Consonent");		 
	     
	
	}
  }
}