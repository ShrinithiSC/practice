import java.util.Scanner;
class Employee{
	String empID;
	String empName;
	Address address;
	
	void setEmp(String empID,String empName,Address address) {
		this.empID= empID;
		this.empName= empName;
		this.address=address;
		
	}
	void getEmp() {
		System.out.println("empID: "+empID+"\nempName: "+ empName+"\naddress: " +address.getAdd());
	}
}
	class Address{
		String addr1;
		String addr2;
		String city;
		int pin;
	
	
	void setAdd(String addr1,String addr2,String city,int pin) {
		this.addr1= addr1;
		this.addr2= addr2;
		this.city=city;
		this.pin=pin;
		
	}
	String getAdd() {
		return "\nAddr1: "+addr1+"\naddr2: "+ addr2+"\ncity: "+city+"\npin: "+pin;
	}	
	
}
public class EmployeeDemo {
	
	public static void main(String[] args) {
        Employee em = new Employee();
        Address address = new Address();
        storeData(em, address);
        showData(em);
    }
 
    static void storeData(Employee em, Address address) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter Employee ID:");
        String empID = sc.nextLine();
 
        System.out.println("Enter Employee Name:");
        String empName = sc.nextLine();
 
        System.out.println("Enter Address Line 1:");
        String addr1 = sc.nextLine();
 
        System.out.println("Enter Address Line 2:");
        String addr2 = sc.nextLine();
 
        System.out.println("Enter City:");
        String city = sc.nextLine();
 
        System.out.println("Enter Pin:");
        int pin = sc.nextInt();
 
        address.setAdd(addr1, addr2, city, pin);
        em.setEmp(empID, empName, address);
    }
 
    static void showData(Employee em) {
        em.getEmp();
    } 
}
 
