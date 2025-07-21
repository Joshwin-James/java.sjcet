
class Calculator{
	public void add(int a,int b) {
	    int add=a+b;
		System.out.println("The sum of 2 integers is :"+add);
		
	}
	public void add(int a,int b,int c) {
		 int add=a+b;
		System.out.println("The sum of 3 integers is :"+add);
		
	}
	public void add(double a,double b) {
		 double add=a+b;
		System.out.println("The sum of 2 Double is :"+add);
	}
	public void add(String a,int b) {
		System.out.println("The sum string and interger is:"+a+b);
}
}
public class Poly {
	public static void main(String[]args) {
	Calculator Calc=new Calculator();
	Calc.add(10,20);
	Calc.add(10,20,30);
	Calc.add(10.34,20.66);
	Calc.add("Obama", 911);
	

}
}

