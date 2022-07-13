package dataStructure_Arrays;

public class dataStructure_Arraysimpl {

	public static void main(String[] args) {
		int arr[]= new int [5];
		
		//array works on index places
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int display:arr) {
			System.out.println(display);
		}
		
		//We can declare,instantiation and initialization of java array
		
		int data[]= {1,2,3,4,5,6,7};
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		//return an array
		int areturn[]=getArray();
		System.out.println("Array was returned from a method");
		for(int i=0;i<areturn.length;i++) {
			System.out.println(areturn[i]);
		}
	}

	private static int[] getArray() {
		return new int[] {7,65,4,3,2,1};
	}

}
