class Rectangle{
	double length;
	double breadth;
	
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double area() {
		double area;
		area=length*breadth;
		return area;
	}
	
}
public class Area {

	public static void main(String[] args) {
		Rectangle rect =new Rectangle(2.4,3.2);
		System.out.println(rect.area());
		
	}

}
