package practice;

public class BinarySearch {
	
	// Iterative approach
	private static int binarySearch(int[] arr, int num) {
		
		int start=0;   // Start
		int end=arr.length-1;    // End
		int mid=(start+end)/2;
		
		while(start<=end) {
			
			if(arr[mid]==num) {
				return mid;
			}
			else if(num>arr[mid]) {
				start=mid+1;
				mid=(start+end)/2;
			}
			else {
				end=mid-1;
				mid=(start+end)/2;
			}
		}
		
		return -1;
	}
	
	// Recursive approach
	
	public static int binarySearchRecursive(int arr[], int num) {
		
		return binarySearchRecursive(arr, num, 0, arr.length-1);
	}

	private static int binarySearchRecursive(int[] arr, int num, int i, int j) {
		
		if(i>j) {
			return -1;
		}
		
		int mid=(i+j)/2;
		
		if(arr[mid]==num) {
			return mid;
		}
		else if(num>arr[mid]) {
			return binarySearchRecursive(arr, num, mid+1, j);
		}
		else {
			return binarySearchRecursive(arr, num, i, mid-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,8,9,11,100,110};
		
		System.out.println(binarySearch(arr, 29));
		System.out.println(binarySearchRecursive(arr, 29));
	}

}
