package array_1;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean [] ar = new boolean[5];
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println("	1. 입차");
			System.out.println("	2. 출차");
			System.out.println("	3. 리스트");
			System.out.println("	4. 종료");
			System.out.println("************");
			System.out.println(" 메뉴 : " );
			num = scn.nextInt();
			if(num==4) break;
			
			if (num==1) {
				System.out.print("위치 입력 : ");
				int index = scn.nextInt();
				if(ar[index-1])
					System.out.println("이미 주차되어 있습니다.");
				else {
					System.out.println(index+"번 위치 입차");
					ar[index]=true;
				}	
			}
			else if (num==2) {
				int index = scn.nextInt();
				if(ar[index-1]) {
					System.out.println(index + "번 위치 출차");
					ar[index-1]=false;
				}
				else 
					System.out.println("주차되어 있지 않습니다");
			}
			else if (num==3) {
				for (int i=0; i<ar.length; i++) {
					System.out.println(i + "위치 : " + ar[i]);
		
				}	
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
/*
입차

위치입력 : 3
3번 위치 입차 / 이미 주차되어있습니다.



*/
