package assignment2;

public class Car {
	
	String color;
	String brand;
	String model;
	String mfgyear;
	
	//Parameterized constructor of Car
	Car(String color, String brand, String model, String mfgyear){
		this.brand=brand;
		this.color=color;
		this.model=model;
		this.mfgyear=mfgyear;
		
	}

	public static void main(String[] args) {
		Car object = new Car("Grey", "Tata", "Tiago", "2020");
		System.out.println("Color of the car is: "+ object.color);
		System.out.println("Brand of the car is: "+ object.brand);
		System.out.println("Model of the car is: "+ object.model);
		System.out.println("Manufacturing year of the car is: " + object.mfgyear);
		

	}

}
