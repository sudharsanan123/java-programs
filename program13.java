import java.util.*;
import java.io.*;

public class program13{
	
	static double withdraw(float balance,float tran){
	double amount=0;
	if (tran<=balance){
	amount = balance-tran;
	}
	else{
	System.out.println("Insuffient balance");	
}
	
	
	return amount;
}

	public static void main(String args[]){
	Scanner sc= new Scanner (System.in);
	float balance=10000;
	int tran=sc.nextInt();
	System.out.println(withdraw(balance,tran));
		
}

}