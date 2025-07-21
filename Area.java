class Shape{
	public void area(double r) {
	    double ar=3.14*r*r;
		System.out.println("The Area of Circle is :"+ar);
		
	}
	public void area(double l,double b) {
		 double ar=l*b;
		System.out.println("The Area of rectangle is :"+ar);
		
	}
	public void area(double b,float h) {
		 double ar=0.5*b*h;
		System.out.println("The Area of triangle is :"+ar);
	}
	public void area(int s) {
		int ar=s*s;
		System.out.println("The Area of Square is:"+ar);
}
	}

public class Area {
		public static void main(String[]args) {
		Shape Shape=new Shape();
		Shape.area(2.76);
		Shape.area(5.55,4.67);
		Shape.area(1.56,8f);
		Shape.area(6);

}
	}
