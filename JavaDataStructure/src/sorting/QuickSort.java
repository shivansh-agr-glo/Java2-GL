package sorting;

class Quicksort{
	
	//swap function
	void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	//partition-takes last element as pivot. Places pivot element at it's correct position,
	//and places all smaller elements to left of it and greater element to right of it
	int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		
		int i=(low-1);
		
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	
	//function for Quick sort
	void Sort(int[] arr, int low, int high) {
		if(low<high) {
			//partition function
			int pi=partition(arr, low,high);
			
			//partition after partition
			Sort(arr,low,pi-1);
			Sort(arr,pi+1,high);
		}
	}
	
	//display the array
	void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

public class QuickSort {

	public static void main(String[] args) {

		//object of sort class
		Quicksort sort=new Quicksort();
						
		//defining array
		int arr[]= {22,53,36,76,12,58,34};
								
		//array printing before sorting
		System.out.println("Array before sort: ");
		sort.display(arr);
		
		//length of array
		int totallength=arr.length;
		//sorting
		sort.Sort(arr,0, totallength-1);
								
		//array after sorting
		System.out.println("\nArray after sort: ");
		sort.display(arr);

	}

}
