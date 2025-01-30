/*Write a program to find the largest 2 numbers and the
 smallest 2 numbers in the given array. */ 
import java.util.Scanner;
public class Largesmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref=new Scanner(System.in);
int[] a=new int[6];
System.out.println("enter size");
int n=ref.nextInt();
System.out.println("enter elemnts");
for(int i=0;i<n;i++)
{
	a[i]=ref.nextInt();
}
int s1,s2,l1,l2;
if(a[0]<a[1])
{
	s1=a[0];
	s2=a[1];
	l1=a[1];
	l2=a[0];
}
else
{
	s1=a[1];
	s2=a[0];
	l1=a[0];
	l2=a[1];
}
for(int i=2;i<n;i++)
{
	int num=a[i];
	if(num<s1)
	{
		s2=s1;
		s1=num;
	}
	else if(num<s2)
	{
		s2=num;
	}
	if(num>l1)
	{
		l2=l1;
		l1=num;
	}
	else if(num>l2)
	{
		l2=num;
	}
}
System.out.println("2 smallest numbers"+s1+","+s2);
System.out.println("2 largest numbers"+l2+","+l1);
	}
}
