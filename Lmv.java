import josh.Book;
import josh.Ebook;
import josh.Printedbook;

class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayinfo() {
		System.out.println("Brand of Vehicle :"+brand);
		System.out.println("Model of Vehicle :"+model);
			
	}
}
class Car extends Vehicle{
	String Fueltype;
	Car(String brand,String model,String Fueltype){
		super(brand,model);
		this.Fueltype=Fueltype;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Fueltype:"+Fueltype);
	}

}
class ElectricCar extends Car{
	double capacity;
	ElectricCar(String brand,String model,String Fueltype,double capacity){
		super(brand,model,Fueltype);
		this.capacity=capacity;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Battery Capacity:"+capacity);
	}
}

public class Lmv {
	public static void main(String[]args) {
		ElectricCar car1 =new ElectricCar("Mahindra","Be6","Electric",65.5);
		car1.displayinfo();
		
	}

}
