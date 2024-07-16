import java.util.*;
import java.io.*;

public class program5{
   public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("enter num1");
	Float A=sc.nextFloat();
	System.out.println("enter num2");
	Float B=sc.nextFloat();
	Float sum=A+B;
	System.out.println("Sum ="+ sum);
	System.out.println("product ="+A*B);
	System.out.println("Quotient ="+A/B);	
}

}