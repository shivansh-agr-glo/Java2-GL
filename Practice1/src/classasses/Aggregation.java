package classasses;

class Address {
	int housenum;
	int streetnum;
	String areaname;
	String landmark;
	String city;
	String state;
	int pincode;
	
	Address(int housenum, int streetnum, String areaname, String landmark, String city, String state, int pin){
		this.housenum=housenum;
		this.streetnum=streetnum;
		this.areaname=areaname;
		this.landmark=landmark;
		this.city=city;
		this.state=state;
		this.pincode=pin;
	}
}

public class Aggregation {
	int roll;
	String name;
	Address address;
	
	Aggregation(int roll, Address address, String name){
		this.roll=roll;
		this.name=name;
		this.address=address;
	}

	public static void main(String[] args) {
		Address addr = new Address(239, 15, "Shyam colony", "Near session court", "Shahpura", "Rajasthan", 2525045);
		
		Aggregation object=new Aggregation(123, addr, "Shivansh");
		System.out.println(object.roll);
		System.out.println(object.name);
		System.out.println(object.address.streetnum);
		System.out.println(object.address.housenum);
		System.out.println(object.address.areaname);
		System.out.println(object.address.landmark);
		System.out.println(object.address.city);
		System.out.println(object.address.state);
		System.out.println(object.address.pincode);

	}

}
