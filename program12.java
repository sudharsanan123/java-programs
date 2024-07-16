import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class program12{
	static double aver(int array[],int count ){
	double ans=0;
	
	for (int i=0;i<count;i++){
		ans+=array[i];	
}	ans=ans/count;
	return ans;
}
	public static void main(String args[]){
				
	Scanner sc=new Scanner (System.in);
	int[] array=new int[20];
	int count=0;
	for(int i=0;i<20;i++){
		count++;
		array[i]=sc.nextInt();
		if(array[i]==-1){
			count--;
			break;
}
	
}
	DecimalFormat df= new DecimalFormat( "#.00" );
	System.out.println(df.format(aver(array,count)));
}
}