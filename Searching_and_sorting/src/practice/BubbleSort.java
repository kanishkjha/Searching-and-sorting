package practice;
public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr= {1,4,2,5,3,0,0,8,9,10,7,6};

		bubbleSort(arr);

		for(int element: arr) {
			System.out.print(element+" ");
		}
	}
}
