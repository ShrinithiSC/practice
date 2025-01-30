public class sum{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,3,6,1,2,7,9};
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==6) {
				for(int j=i+1;j<a.length;j++) {
					if(a[j]==7) {
						i=j;
						break;
					}					
				}
				continue;
			}
			sum+=a[i];
		}
		System.out.println("Output: "+ sum);
 
	}
 
}