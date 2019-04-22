import java.util.Scanner;
class Lab3Task1
{ 
int e,p,c;
 public static void main(String args[]){
  Scanner a= new Scanner(System.in);
  int x=300;
    System.out.println("---==============M-A-R-K-S-H-E-E-T==============----");
    System.out.println("             ................               ");
	System.out.println("Student name: ALi");
	System.out.println("Total Marks : "+x);
	System.out.println("Enter Marks in English:  ");
	int e= a.nextInt();
	System.out.println("Enter Marks in Physics:  ");
	int p= a.nextInt();
	System.out.println("Enter Marks in Chemistry:");
	int c= a.nextInt();
        int obt;
	int per;
	obt=e+p+c;
        per=obt*100/x;
	System.out.println(">>Obtained marks:  "+obt);
	System.out.println(">>percantage:   "+per+"%");
	if(per>90)
	System.out.println("Grade:  A");
        if(per<90 & per>80) 
	System.out.println("Grade:  B");
	if(per<79 & per>70)
	System.out.println("Grade: C");
	if(per<69 & per>60)
	System.out.println("Grade: D");
	if(per<60)
	System.out.println("FAIL!!!");
	  }  
     }
