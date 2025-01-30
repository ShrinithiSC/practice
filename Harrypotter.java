import java.util.Scanner;
class Details
{
	String name;
	String role;
	String house;
	String status;
	String alive;
	public Details(String name,String role,String house,String status,String alive)
	{
		this.name=name;
		this.role=role;
		this.house=house;
		this.status=status;
		this.alive=alive;
		
	}
	public String toString()
	{
		return "name  "+name+"role  "+role+"house  "+house+"status  "+status+"alive  "+alive;
	}
}// end of class
public class Harrypotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
Details obj[]=new Details[30];
	obj[0]=new Details( "harry potter","student","gryffindor","self","yes");
	obj[1]= new Details("Ginny Weasley ","student","gryffindor","Friend","yes");
	obj[2]= new Details("Ron Weasley  ","student","gryffindor","Friend","yes");
	obj[3]= new Details("Hermione Granger  ","student","gryffindor","Friend","yes");
	obj[4]= new Details("Neville Longbottom ","student","gryffindor","Friend","yes");
	obj[5]= new Details("Oliver Wood  ","student","gryffindor","Friend","yes");
	obj[6]= new Details("Luna Lovegood  ","student","Ravenclaw ","Friend","yes");
	obj[7]= new Details("Cho Chang  ","student","Ravenclaw","Friend","yes");
	obj[8]= new Details("Cedric Diggory  ","student","Hufflepuff ","Friend","no");
	obj[9]= new Details("Hannah Abbot ","student","Hufflepuff","Friend","yes");
	obj[10]= new Details("Draco Malfoy ","student","Slytherin","Enemy","yes");
	obj[11]= new Details("Vincent Crabbe  ","student","Slytherin","Enemy","no");
	obj[12]= new Details("Gregory Goyle ","student","Slytherin","Enemy","yes");
	obj[13]= new Details("Penelope Clearwater  ","student","Slytherin","Enemy","yes");
	obj[14]= new Details("Albus Dumbledore ","Faculty","gryffindor","Friend","no");
	obj[15]= new Details("Severus Snape ","Faculty","Slytherin","Enemy","no");
	obj[16]= new Details("Remus Lupin  ","Faculty","gryffindor","Friend","no");
	obj[17]= new Details("Horace Slughorn ","Faculty","slytherin","Friend","yes");
	obj[18]= new Details("Rubeus Hagrid ","Faculty","gryffindor","Friend","yes");
	obj[19]= new Details("Minerva McGonagall  ","Faculty","gryffindor","Friend","yes");
	obj[20]= new Details("James Potter  ","student","gryffindor","family","no");
	obj[21]= new Details("Sirius Black  ","student","gryffindor","Friend","no");
	obj[22]= new Details("Lily Potter  ","student","gryffindor","family","no");
	obj[123]= new Details("Peter Pettigrew ","student","gryffindor","enemy","no");
	obj[24]= new Details("Tom Marvolo Riddle ","student","Slytherin ","enemy","no");
getHouse(obj);
getRole(obj);
getAlive(obj);

	}//end of main
	static void getHouse(Details[] obj)
	{
		System.out.println("house gryffindor names");
		for(int i=0;i<2;i++)
		{
			if(obj[i].house=="gryffindor")
			System.out.println(" "+obj[i].name);
		}
	}
	static void getRole(Details[] obj)
	{
		System.out.println("status family names");
		for(int i=0;i<2;i++)
		{
			if(obj[i].status=="family")
			System.out.println(" "+obj[i].name);
		}
	}
	static void getAlive(Details[] obj)
	{
		System.out.println("alive yes names");
		for(int i=0;i<2;i++)
		{
			if(obj[i].alive=="yes")
			System.out.println(" "+obj[i].name);
		}
	}
}//end of main class
