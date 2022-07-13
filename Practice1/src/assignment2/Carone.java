package assignment2;

public class Carone {
	
	String color;
	String brand;
	String model;
	String mfgyear;
	String insurance;
	String RC;
	
	//Parameterized constructor of Car
	Carone(String color, String brand){
		this.brand=brand;
		this.color=color;
		System.out.println("Color of the car is: "+ color);
		System.out.println("Brand of the car is: "+brand);
		
	}
	//constructor overloading
	Carone(String model){
		this.model=model;
		System.out.println("Model of the car is: "+ model);
		
	}
	
	Carone(String mfgyear, String insurance, String RC){
		this.mfgyear=mfgyear;
		this.insurance=insurance;
		this.RC=RC;
		System.out.println("Manufacturing Year of the car is: "+ mfgyear);
		System.out.println("Car has insurance : "+ insurance);
		System.out.println("Car has RC : "+ RC);
	}

	public static void main(String[] args) {
		new Carone("Grey", "Tata");
		new Carone("Tiago");
		new Carone("2020","Yes","Yes");
	}

}
