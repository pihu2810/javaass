package Day6;

import java.util.Scanner;

public class FibonacciSericeUC1 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number upto which Fibonacci series to print =");
	 int N=sc.nextInt();
	 sc.close();
	 int num1=1,num2=1,num3;
	 System.out.println(num1);
	 System.out.println(num2);
	 for(int i=3;i<=N;i++)
	 {
	   num3=num1+num2;
	   System.out.println(num3);
	   num1=num2;
	   num2=num3;
	 
	 }
 }
}
