import java.util.concurrent.ThreadLocalRandom;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int partition(int [] arr, int start, int end) {
		int pivot = arr[ThreadLocalRandom.current().nextInt(start, end)];
		
		for(int i=start; i<=end; i++) {
			if(arr[start]>pivot)
				swap
		}
		
		return piv_pos;
	}
	
	public void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
	}

}
