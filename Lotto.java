package array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Scanner scn = new Scanner(System.in);
		
		System.out.println("돈 입력 : ");
		
		int money = scn.nextInt();
		for(int k=1; k<=money/1000; k++) {
		//난수발생
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45)+1; //1~45사이의 난수
			
			//중복체크
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { 
					i--; 
					break;
				}//if
			}//for j
			
		}//for i
		
		//정렬 - 오름차순
		Arrays.sort(lotto);
				
		//출력
		for(int data : lotto) {
			System.out.print(String.format("%5d",  data));
		}
		System.out.println();
	
		if(k%5==0) System.out.println();
		}//for k
	}	
}

/*
[문제] 로또 프로그램
- 1 ~ 45 사이의 난수를 6개 발생
- 중복된 숫자는 다시 발생한다.
- 숫자가 오름차순 정렬시켜야 한다.
*/
/*
[문제] 로또 프로그램
- 1~45 사이의 난수를 6개 발생
- 중복된 숫자는 다시 발생한다
- 숫자가 오름차순 정렬시켜야 한다.
*/