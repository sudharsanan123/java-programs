import java.util.*;
import java.io.*;

public class program11{
	public static void main(String args[]){

	Scanner sc=new Scanner (System.in);
	int [] arr=new int[20];
	for(int i=0; i<10;i++){
	arr[i]=0;

}
	for(int i=10; i<20;i++){
	arr[i]=(i-10)+20;
}
	for(int i=0;i<15;i++){
	arr[i]+=1;
}
	Arrays.sort(arr);
	for(int i=0 ;i<5;i++){
	System.out.println(arr[i]+" ");
}	
		
}


}