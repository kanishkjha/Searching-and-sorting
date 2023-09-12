package practice;
public class MergeSort {

	public static void mergeSort(int arr[]) {

		mergeSort(arr, 0, arr.length-1);
	}

	private static void mergeSort(int[] arr, int start, int end) {

		if(start>end) {
			return;
		}

		if(start==end) {
			return;
		}

		int mid=(start+end)/2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);

		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {

		int p=start;
		int q=mid+1;
		int mergedArray[]= new int[end-start+1];
		int k=0;

		while(p<=mid && q<=end) {

			if(arr[p]<=arr[q]) {
				mergedArray[k]=arr[p];
				p++;
				k++;
			}
			else {
				mergedArray[k]=arr[q];
				q++;
				k++;
			}
		}

		while (p <= mid) {
			mergedArray[k] = arr[p];
			p++;
			k++;
		}
		while (q <= end) {
			mergedArray[k] = arr[q];
			q++;
			k++;
		}

		for (int i = 0; i < mergedArray.length; i++) {
	        arr[start + i] = mergedArray[i];
	    }
	}

	public static void main(String[] args) {

		int[] arr= {1,4,2,5,3,0,0,8,9,10,7,6};

		mergeSort(arr);

		for(int element: arr) {
			System.out.print(element+" ");
		}
	}

}
