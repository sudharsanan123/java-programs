import java.util.*;
import java.io.*;

public class program8{
	public static void main(String args[]){

	Scanner sc= new Scanner (System.in);
	System.out.println("Enter num1");
	float num1=sc.nextFloat();
	System.out.println("Enter num2");
	float num2=sc.nextFloat();
	float ans=num1*num1;
	if (ans==num2){
		System.out.println(ans);
	}
	else{
		System.out.println("Not a multiple odf num1");
	}
}
}