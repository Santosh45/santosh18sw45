class Lab3Task4
{
  public static void main(String args[])
  {
    if(args.length==3)
    {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
	        int c=Integer.parseInt(args[2]);
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		float div=(float)a/b;
               System.out.println("Addition of "+args[0]+" and "+args[1]+" is : "+sum);   
               System.out.println("Subtraction of "+args[0]+" and "+args[1]+" is : "+sub);    
               System.out.println("Multiplication of "+args[0]+" and "+args[1]+" is : "+mul);
               System.out.println("Division of "+args[0]+" and "+args[1]+" is : "+div);
}	
	    	
    else
     System.out.println("Wrong Number of Arguments");		
  }
 }