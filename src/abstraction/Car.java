package abstraction;

public class Car extends Vechile {
	private String color;
	public Car(String color) {
		this.color=color;
	}
	public void printDetails() {
		System.out.println("This is car Details ");
		System.out.println("Car Color: "+this.color);
	}
public static void main(String[] args) {
	Car c1=new Car("Pink");
	Car c2=new Car("Yellow");
	Car c3=new Car("Black");
	c1.printDetails();
	c1.startEngine();
	c1.Speed();
	c1.Stop();
	System.out.println("=======================");
	c2.printDetails();
	c3.printDetails();
	
	
}
}
