class InterestCalculator{
	double principle;
	int time;
	double intRate;
	
	InterestCalculator(double principle,int time){
		this.principle=principle;
		this.time=time;

		if(time>=5) {
			intRate=10f;
		}
		else {
			intRate=12f;
		}
	
	}
	
	double getInterest() {
		double interest=(principle*time*intRate)/100;
		return interest;
	}
}
public class Interest {

	public static void main(String[] args) {
		InterestCalculator ic=new InterestCalculator(10000,3);
		double si=ic.getInterest();
		System.out.println("Interest : "+si);
		
		

	}

}
