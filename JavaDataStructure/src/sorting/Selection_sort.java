package sorting;

class SelectionSort{
	//function for Selection sort
	void Sort(int[] arr) {
		int totalLength=arr.length;
		
		for(int i=0;i<totalLength;i++) {
			int min_index=i;
			for(int j=i+1;j<totalLength;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			
			//Swap
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
	}
	
	//display the array
	void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

public class Selection_sort {

	public static void main(String[] args) {
		//object of sort class
		SelectionSort sort=new SelectionSort();
		
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
