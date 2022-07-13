package classasses;

import java.util.Scanner;

public class Person {
	String name;
	String address;
	Person father;
	Person son;
	
	Person(String name, String address){
		this.name=name;
		this.address=address;
		this.father=null;
		this.son=null;
	}
	
	public String topMostAncestor() {
		if(this.father==null) {
			return this.name;
		}
		else {
			Person temp=this;
			while(temp.father!=null) {
				temp=temp.father;			
				}
		return temp.name;
		}
		
	}
	
	public String youngestPredecessor() {
		if(this.son==null) {
			return this.name;
		}
		else {
			Person temp=this;
			while(temp.son!=null) {
				temp=temp.son;			
				}
		return temp.name;
		}
	}

	public static void main(String[] args) {
		Person []Ar= new Person[10];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Enter tha name of person "+ i +" :" );
			String name = input.next();
			System.out.println("Enter tha address of person "+ i +" :" );
			String address = input.next();
			Ar[i] = new Person(name, address);
		}
		Ar[0].son=Ar[1];
		Ar[1].father=Ar[0];
		Ar[4].father=Ar[1];
		Ar[1].son=Ar[4];
		System.out.println("Ancestor = "+Ar[4].topMostAncestor());
		System.out.println("Predecessor = "+Ar[0].youngestPredecessor());
		input.close();
		

	}

}