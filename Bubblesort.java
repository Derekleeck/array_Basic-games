package array_1;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {40, 78, 36, 55, 50};
		
		System.out.println("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		int temp;
		for (int i=0; i<ar.length-1; i++) {
			for (int j=0; j<ar.length-1-i; j++){
				if(ar[j] > ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1]; //
					ar[j+1] = temp; 
					
					//i=3 j=0; j<4; j++
					//i=
					//
					//
				}	
			}
		}	
		
		System.out.println("정렬 후 : ");
		for(int data : ar) {
			System.out.print(data + " ");
		}
	}

}
/*
출력
정렬 전 : 
40 78 36 55 50 
정렬 후 : 
36 40 50 55 78 


*/