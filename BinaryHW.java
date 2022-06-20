package array_1;

import java.util.Scanner;

public class BinaryHW {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		int[] binary = new int[32];
		int dec;
		int i;
		while(true) {
			System.out.println("10 진수 입력 : ");
			dec = scn.nextInt();
			if(dec ==0) break; //while문 바깥으로 벗어나기
			if(dec <0) continue;
			for(i=0; dec!=0; i++) {
			binary[i] = dec%2;
			dec = dec/2;
			} 
			
			for (int j = i-1; j>=0; j--) {
				System.out.print(binary[j]);
				if(j%4==0) System.out.print(" ");
			}
			System.out.println("\n");
		}
		System.out.println("프로그램을 종료합니다.");
	}	
}


//[내 답]		
//		Scanner scn = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("10진수를 입력하시오 : ");
//			int []arg = new int[10];
//			int num = scn.nextInt();
//			int i = 0;
//			
//			if (num < 0) continue;
//			if (num ==0) break;
//			
//			while(num!=0) {
//				arg[i] = num%2;
//				num = num/2;
//				i++;
//			}
//			for (int j=arg.length-1; j>=0 ; j--) {
//				System.out.print(args[j]); // 4자리수씩 띄는거 모르겠음.
//		    } 
//			System.out.println("\n");		
//			
//		} System.out.println("프로그램을 종료합니다");
//
//	}	 
//
//}


/*
10진수를 입력하여 2진수로 변환하시오
- 0이 입력되면 프로그램을 종료하시오
- 음수가 입력되면 재입력하시오
- 4개씩 끊어서 보여주기
- Integer.toBinaryString() 사용 X

10진수 입력 : -5

10진수 입력 : 12
1100

10진수 입력 : 250
1111 1010

10진수 입력 : -8

10진수 입력 : 0
프로그램을 종료합니다

*/