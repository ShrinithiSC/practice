/*Majority of an element means if an element is present in an array
for more than n/2 times, where n is the length of the Array. 
Ex: Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4 
Create a Java Code to achieve the above requirement. */

import java.util.Scanner;
public class Majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=s.nextInt();
		int [] a=new int[10];
		System.out.println("enter elements of array:");
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
int majority=a[0];
for(int i=0;i<n;i++)
{
	if(majority==a[i])
		count++;
	else if(count==0)
		{
		count++;
		majority=a[i];
		}
		else
		count--;
}
System.out.println("majority="+majority);
}// end of main

}//end of class    3, 4, 2, 4, 4, 2, 4, 4
