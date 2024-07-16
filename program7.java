import java.util.*;
import java.io.*;

public class program7{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num1");
	float num1=sc.nextFloat();
	System.out.println("Enter num2");
	float num2=sc.nextFloat();
	System.out.println("Enter num3");
	float num3=sc.nextFloat();
	float sum=num1+num2+num3;
	float aver=(num1+num2+num3)/3;
	float prod=(num1*num2*num3);
	float max=0;
	float min=0;
	if (num1>num2 & num1>num3){
		 max=num1;
		
}	
	else if(num2>num3 & num2 >num1){
		max=num2;
		
}
	else{
		max=num3;	
		
	}
	if (num1<num2 & num1<num3){
		min = num1;
}
	else if (num2<num1 & num2<num3){
		min = num2;
}
	else{
		min=num3;
}

	System.out.println("max number is "+ max);
	System.out.println("sum is "+ sum);
	System.out.println("average num "+aver);
	System.out.println("product number "+ prod);
	System.out.println("Min number is "+ min);
}
}