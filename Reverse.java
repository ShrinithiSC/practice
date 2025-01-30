import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		int a[][]=new int[10][10];
		int i,j;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				a[i][j]=sc.nextInt();
		}
		}
		for (i = 1; i >=0; i--)
		{
		    for (j = 1; j >=0; j--)
		    {
		         System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		
		sc.close();

}
}