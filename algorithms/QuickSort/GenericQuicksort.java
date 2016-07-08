public class GenericQuicksort 
{
	private static int []arr;
	
	public static void main(String[] args) 
	{
		// Get an random generated array
		arr = getArray();
		
		// prints the given array
		printArray();
		
		// sort the array
		sort();
		
		//prints the sorted array
		printArray();
		
	}
	
	// This method sort an array internally it calls to quickSort 
	private static void sort()
	{
		int left = 0;
		int right = arr.length-1;
			
		quickSort(left, right);
	}
	
	// This method is used to sort the array using quicksort algorithm.
	// It takes left and the right end of the array as two cursors.
	private static void quickSort(int left,int right)
	{
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
		
		// For the simplicity, we took the right most item of the array as a pivot 
		int pivot = arr[right];
		int partition = partition(left, right, pivot);
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(0, partition-1);
		
		quickSort(partition+1, right);
	}
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index
	private static int partition(int left,int right,int pivot)
	{
		int leftCursor = left-1;
		int rightCursor = right;
		
		while(leftCursor < rightCursor)
		{
			while(arr[++leftCursor] < pivot);
			while(rightCursor > 0 && arr[--rightCursor] > pivot);
			if(leftCursor >= rightCursor)
			{
				break;
			}else{
				swap(leftCursor, rightCursor);
			}
		}
		swap(leftCursor, right);
		return leftCursor;
	}
	
	// This method is used to swap the values between the two given index
	private static void swap(int left,int right)
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	private static void printArray()
	{
		for(int i : arr){
			System.out.print(i+" ");
		}
	}
	
	//Return random number array
	private static int[] getArray()
	{
		int size=10;
		int []array = new int[size];
		int item = 0;
		for(int i=0;i<size;i++)
		{
			item = (int)(Math.random()*100); 
			array[i] = item;
		}
		return array;
	}

}
