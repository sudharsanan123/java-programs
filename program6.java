import java.util.*;
import java.io.*;

public class program6{
	public static void main(String args[]){

	Scanner sc=new Scanner (System.in);
	System.out.println("Enter num1 ");
	float num1=sc.nextFloat();
	System.out.println("Enter num2");
	float num2=sc.nextFloat();
	if (num1>num2){
		System.out.println("Num1 is greater");
}
	else if (num2>num1){
		System.out.println("num2 is greater");
}
	else{
		System.out.println("both are equal ");
}
}
	
}