package sorting;

class sort{
	//function for bubble sort
	void bubbleSort(int[] arr) {
		int totalLength=arr.length;
		int temp=0;
		
		for(int i=0;i<totalLength;i++) {
			for(int j=i+1;j<totalLength;j++) {
				if(arr[j]<arr[i]) {
					
					//swap
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	//display the array
	void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

public class Bubble_sort {

	public static void main(String[] args) {
		//object of sort class
		sort sorting=new sort();
		//defining array
		int arr[]= {22,53,36,76,12,58,34};
		
		//array printing before sorting
		System.out.println("Array before sort: ");
		sorting.display(arr);
		
		//sorting
		sorting.bubbleSort(arr);
		
		//array after sorting
		System.out.println("\nArray after sort: ");
		sorting.display(arr);
		
		

	}

}
