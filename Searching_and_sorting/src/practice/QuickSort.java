package practice;
public class QuickSort {
	
	public static void quickSort(int[] arr) {
		
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		
		if(start>=end) {
			return;
		}
		
		int pivotPosition=partition(arr, start, end);
		
		quickSort(arr, start, pivotPosition-1);
		quickSort(arr, pivotPosition+1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		
		
		int pivotElement=arr[start];
		int count=0;
		
		for(int i= start+1; i<=end; i++) {
			if(arr[i]<=pivotElement) {
				count++;
			}
		}
		
		int pivotPosition=start+count;
		
		int temp=arr[pivotPosition];
		arr[pivotPosition]=pivotElement;
		arr[start]=temp;
		
		int i=start;
		int j=end;
		
		while(i<pivotPosition && j>pivotPosition) {
			
			if(arr[i]>pivotElement && arr[j]<=pivotElement) {
				int temp1=arr[j];
				arr[j]=arr[i];
				arr[i]=temp1;
				i++;
				j--;
			}
			if(arr[i]<=pivotElement) {
				i++;
			}
			if(arr[j]>pivotElement) {
				j--;
			}
		}
		
		return pivotPosition;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,5,3,0,0,8,9,10,7,6,7};

		quickSort(arr);

		for(int element: arr) {
			System.out.print(element+" ");
		}
	}

}
