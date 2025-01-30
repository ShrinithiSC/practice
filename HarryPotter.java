class Details1{
	String name;
	String house;
	String Role;
	String status;
	String dies;
	
	Details1(String name,String house,String Role,String status,String dies ){
		this.name=name;
		this.house=house;
		this.Role=Role;
		this.status=status;
		this.dies=dies;
	}
	public String toString() {
		return " "+name+ " "+house +" "+Role+" "+status+" "+dies;
	}
	

}
public class HarryPotter {

	public static void main(String[] args) {
		Details1[] obj=new Details1[30];
		obj[0]=new Details1("HarryPotter","Gryffindor","Student","Self","No");
		obj[1]=new Details1("Ginny Weasley","Gryffindor","Student","Friend","No");
		obj[2]=new Details1("Ron Weasley","Gryffindor","Student","Friend","No");
		obj[3]=new Details1("Hermione Granger ","Gryffindor","Student","Friend","No");
		obj[4]=new Details1("Neville Longbottom ","Gryffindor","Student","Friend","No");
		obj[5]=new Details1("Oliver Wood","Gryffindor","Student","Friend","No");
		obj[6]=new Details1("Luna Lovegood","Ravenclaw","Student","Friend","No");
		obj[7]=new Details1("Cho Chang","Ravenclaw","Student","Friend","No");
		obj[8]=new Details1("Cedric Diggory","Hufflepuff","Student","Friend","Yes");
		obj[9]=new Details1("Hannah Abbot","Hufflepuff","Student","Friend","No");
		obj[10]=new Details1("Draco Malfoy","Slytherin","Student","Enemy","No");
		obj[11]=new Details1("Vincent Crabbe","Slytherin","Student","Enemy","Yes");
		obj[12]=new Details1("Gregory Goyle","Slytherin","Student","Enemy","No");
		obj[13]=new Details1("Penelope Clearwater","Slytherin","Student","Enemy","No");
		obj[14]=new Details1("Albus Dumbledore","Gryffindor","Faculty","Friend","Yes");
		obj[15]=new Details1("Severus Snape","Slytherin","Faculty","Enemy","Yes");
		obj[16]=new Details1("Remus Lupin","Gryffindor","Faculty","Friend","Yes");
		obj[17]=new Details1("Horace Slughorn","Slytherin","Faculty","Friend","No");
		obj[18]=new Details1("Rubeus Hagrid","Gryffindor","Faculty","Friend","No");
		obj[19]=new Details1("Minerva McGonagall","Gryffindor","Faculty","Friend","No");
		obj[20]=new Details1("James Potter","Gryffindor","Student","Family","Yes");
		obj[21]=new Details1("Sirius Black","Gryffindor","Student","Friend","Yes");
		obj[22]=new Details1("Lily Potter","Gryffindor","Student","Family","Yes");
		obj[23]=new Details1("Peter Pettigrew","Gryffindor","Student","Enemy","Yes");
		obj[24]=new Details1("Tom Marvolo Riddle","Slytherin","Student","Enemy","Yes");
		
		printDetails1(obj);	
		}

	private static void printDetails1(Details1[] obj) {
		System.out.println("Names of characters belonged to Gryffindor house:");
		for(int i=0;i<25;i++) {
			if(obj[i].house=="Gryffindor")
				System.out.println(obj[i].name);
		}
		System.out.println("Characters that are alive:");
		for(int i=0;i<25;i++)
		{
			if(obj[i].dies=="No")
				System.out.println(obj[i].name);
		}
		System.out.println("Family members of Harry Potter:");
		for(int i=0;i<25;i++)
		{
			if(obj[i].status=="Family")
				System.out.println(obj[i].name);
		}
	}

	
}
