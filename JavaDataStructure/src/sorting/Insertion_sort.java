package sorting;

class InsetionSort{
	//function for Insertion sort
	void Sort(int[] arr) {
		int totalLength=arr.length;
		
		for(int i=1;i<totalLength;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
 
			arr[j+1]=key;
		}
	}
	
	//display the array
	void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

public class Insertion_sort {

	public static void main(String[] args) {
		
		//object of sort class
		InsetionSort sort=new InsetionSort();
				
		//defining array
		int arr[]= {22,53,36,76,12,58,34};
						
		//array printing before sorting
		System.out.println("Array before sort: ");
		sort.display(arr);
						
		//sorting
		sort.Sort(arr);
						
		//array after sorting
		System.out.println("\nArray after sort: ");
		sort.display(arr);

	}

}
