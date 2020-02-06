package calculator;
import java.util.Scanner;
public class calculator  {
         public static void main(String args[]){
        	 calculation c=new calculation();
        	 Scanner scan=new Scanner(System.in);
        	while(true){
        	 System.out.println("enter first number");
        	 double num1=scan.nextInt();
        	 System.out.println("enter second number");
        	 double num2=scan.nextInt();
        	 System.out.println("enter the operation to be performed");
             char op = scan.next().charAt(0);

        	 c.calci(num1,num2,op);
        	System.out.println("enter 1 to exit or 0 to continue");
        	 int value=scan.nextInt();
        	 if(value==1)
        	  break;
        	 }
        	 System.out.println("computed successfully");
         }
}
