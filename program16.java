import java.util.*;
import java.io.*;


class Date{
	int month;
	int day;
	int year;

	public Date(){
	month=0;
	day=0;
	year=0;
	
}
void setMonth(int month){
	this.month=month;
}
void setDay(int day){
	this.day=day;
}
void setYear(int year){
	this.year=year;
}
	
void getAns(int month,int day, int year){
	System.out.println(month+"/"+day+"/"+year);
}
}

public class program16{

	public static void main(String args[]){
	
	Date d1=new Date();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter month as number ");
	int month=sc.nextInt();
	System.out.println("Enter day as number ");
	int day=sc.nextInt();
	System.out.println("Enter year as number ");
	int year=sc.nextInt();
	
	d1.setMonth(month);
	d1.setDay(day);
	d1.setYear(year);
	System.out.println("The date is ");d1.getAns(month,day,year);


}

}