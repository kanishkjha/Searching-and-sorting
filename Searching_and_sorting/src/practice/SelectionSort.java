package practice;
import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int min=arr[i];
			int minIndex=i;
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
			
			if(i!=minIndex) {
				int temp=arr[i];
				arr[i]=min;
				arr[minIndex]=temp;
				}
		    }
	}

	public static void main(String[] args) {
		
		int[] arr= {1,4,2,5,3,0,0,8,9,10,7,6};
		
		selectionSort(arr);
		
		for(int element: arr) {
			System.out.print(element+" ");
		}
	}

}
