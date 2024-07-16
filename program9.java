import java.util.*;
import java.io.*;

public class program9{
	public static void main(String args[]){

	Scanner sc=new Scanner (System.in);
	int largest =0;
	int counter=10;
	System.out.println("Enter the number ");
	int arr[]=new int[counter];
	System.out.println(" enter array" );
	for (int i=1;i<=counter;i++){

	System.out.println("counter :" +i);
	if (i==10){
		System.out.println("Last enter details");
}
	arr[i-1]=sc.nextInt();
	System.out.println(" The number entered "+ arr[i-1]);
	if(largest>arr[i-1]){
		System.out.println("The largest number so far "+ largest);
	continue;
}
	else{
		largest=arr[i-1];	
}
	System.out.println("The largest number so far"+largest);
}

}
	
}