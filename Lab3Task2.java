import java.util.Scanner;
class Lab3Task2
{
 public static void main(String args[])
 {
  int units;
  long bill;
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter number of units consumed :");
  units=ob.nextInt();
  if(units<=50)
   {
     bill=10*units;
     System.out.println("Your Bill is : "+bill); 
   }  
    else if(units>50&&units<=100){
	bill=(50*10)+(units-50)*15;
	System.out.println("Your Bill is : "+bill);
	}
	else if(units>101&&units<200){
	bill=(50*10)+(100-50)*15+(units-100)*20;
	System.out.println("Your Bill is : "+bill);
	}
	else if(units>201&&units<300){
	bill=(50*10)+(100-50)*15+(200-100)*20+(units-200)*25;
	System.out.println("Your Bill is : "+bill);	
	
	}
	else if(units>301){
	bill=(50*10)+(100-50)*15+(200-100)*20+(300-200)*25+(units-300)*30;
	System.out.println("Your Bill is : "+bill);
	}
  

 }
} 