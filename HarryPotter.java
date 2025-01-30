class Detail{
	String name;
	String house;
	String Role;
	String status;
	String dies;
	
	Detail(String name,String house,String Role,String status,String dies ){
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
		Detail[] obj=new Detail[30];
		obj[0]=new Detail("HarryPotter","Gryffindor","Student","Self","No");
		obj[1]=new Detail("Ginny Weasley","Gryffindor","Student","Friend","No");
		obj[2]=new Detail("Ron Weasley","Gryffindor","Student","Friend","No");
		obj[3]=new Detail("Hermione Granger ","Gryffindor","Student","Friend","No");
		obj[4]=new Detail("Neville Longbottom ","Gryffindor","Student","Friend","No");
		obj[5]=new Detail("Oliver Wood","Gryffindor","Student","Friend","No");
		obj[6]=new Detail("Luna Lovegood","Ravenclaw","Student","Friend","No");
		obj[7]=new Detail("Cho Chang","Ravenclaw","Student","Friend","No");
		obj[8]=new Detail("Cedric Diggory","Hufflepuff","Student","Friend","Yes");
		obj[9]=new Detail("Hannah Abbot","Hufflepuff","Student","Friend","No");
		obj[10]=new Detail("Draco Malfoy","Slytherin","Student","Enemy","No");
		obj[11]=new Detail("Vincent Crabbe","Slytherin","Student","Enemy","Yes");
		obj[12]=new Detail("Gregory Goyle","Slytherin","Student","Enemy","No");
		obj[13]=new Detail("Penelope Clearwater","Slytherin","Student","Enemy","No");
		obj[14]=new Detail("Albus Dumbledore","Gryffindor","Faculty","Friend","Yes");
		obj[15]=new Detail("Severus Snape","Slytherin","Faculty","Enemy","Yes");
		obj[16]=new Detail("Remus Lupin","Gryffindor","Faculty","Friend","Yes");
		obj[17]=new Detail("Horace Slughorn","Slytherin","Faculty","Friend","No");
		obj[18]=new Detail("Rubeus Hagrid","Gryffindor","Faculty","Friend","No");
		obj[19]=new Detail("Minerva McGonagall","Gryffindor","Faculty","Friend","No");
		obj[20]=new Detail("James Potter","Gryffindor","Student","Family","Yes");
		obj[21]=new Detail("Sirius Black","Gryffindor","Student","Friend","Yes");
		obj[22]=new Detail("Lily Potter","Gryffindor","Student","Family","Yes");
		obj[23]=new Detail("Peter Pettigrew","Gryffindor","Student","Enemy","Yes");
		obj[24]=new Detail("Tom Marvolo Riddle","Slytherin","Student","Enemy","Yes");
		
		printDetail(obj);	
		}

	private static void printDetail(Detail[] obj) {
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
