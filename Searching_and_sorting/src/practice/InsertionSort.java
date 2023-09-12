package practice;
public class InsertionSort {
	
	private static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int temp=arr[i];
			int j;
			for(j=i-1; j>=0; j--) {
				if(arr[j]>temp) {
					arr[j+1]=arr[j];
				}
				if(arr[j]<=temp) {
					break;
				}
			}
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,5,3,0,0,8,9,10,7,6};

		insertionSort(arr);

		for(int element: arr) {
			System.out.print(element+" ");
		}

	}

}
