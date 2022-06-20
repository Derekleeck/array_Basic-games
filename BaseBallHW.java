package array_1;

import java.io.IOException;

public class BaseBallHW {
	public static void main(String[] args) throws IOException{
		int[] com = new int[3];
		int[] user = new int[3];
		int yn;
		int strike, ball;
		int count=0;
		
		do {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			yn = System.in.read();
			System.in.read();
			System.in.read();
		}
		while(yn!='Y' && yn!='y' && yn!='N' && yn!='n');
		
		if(yn=='Y' || yn=='y') {
			System.out.println("\n 게임을 시작합니다");
			
			//난수 발생
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9)+1; //1~3사이의 난수
				
				//중복체크
				for(int j=0; j<i; j++) {
					if(com[i] == com[j]) { 
						i--; 
						break;
					}//if
				}//for j	
			}//for i
			System.out.println(com[0]+", "+com[1]+", "+com[2]);
			
			//발생한 숫자 맞추기
			while(true) {
				//사용자 입력
				System.out.print("숫자입력 : ");
				for(int i=0; i<user.length; i++) {
					user[i] = System.in.read()-'0'; //1개 문자 입력
				}
				System.in.read();
				System.in.read();
				//System.out.println(user[0]+", "+user[1]+", "+user[2]);
				
				//비교
				count++;
				strike = ball = 0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i] == user[j]) { //값이 같으냐??
							if(i == j) strike++; //위치가 같으냐??
							else ball++;
						}
					}
				}
				
				//마무리
				System.out.println(strike+" 스트라이크   "+ball+" 볼");
				if(strike==3) {
					System.out.println("\n 축하합니다...몇 "+count+"번 만에 맞추셨습니다.");
					break; //while를 벗어나라
				}
				
			}//while
		}else {
			System.out.println("프로그램을 종료합니다.");
		}
		
		
	}
}		


/*
야구 게임 - 숫자 맞추기 게임
- 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다    난수 집합 num[i]/
- 난수는 중복을 허용하지 않는다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : q
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

123 = user
312 = 3 볼
132 = 1 스트라이크

숫자입력 : 123 a[0]=1, a[1]=2, a[2]=3   
1스트라이크 0볼

숫자입력 : 182
0스트라이크 i

...

숫자입력 : 428
3스트라이크 0볼

축하합니다...몇x번만에 맞추셨습니다.

*/
			
			
//[내 답]			
//			Scanner scn = new Scanner(System.in);
//			 int[] com = new int[3];
////			 char[] user = new char[3];
//			 int st = 0;
//			 int bl = 0;
//			 int countgame = 0;
//			 
//			 while(true) {
//			 
//				 System.out.println("게임을 실행하시겠습니까 (Y/N)");
//				 String ans = scn.nextLine();
//				 if (ans.equals("Y")) break;
//				 if (ans.equals("N")) break;
//			     else continue;			 
//			 }
//			 
//			while(true) {
//				for (int i = 0; i<com.length; i++) {
//					com[i] = (int)(Math.random()*8+1);
//					
//					System.out.println(com[i]); //배열출력
//					
//					for(int j=0; j<i; j++) {
//						if(com[i] == com[j]) {
//							i--;
//			
//							System.out.println("게임을 시작합니다.\n");
//						}
//					}	
//				}	
//					 
//				for (int i = 0; i<com.length; i++) {	 
//
//					System.out.print("숫자 입력 : ");
//					String user = scn.nextLine();
//					
//					if ((int)(user.charAt(i)) == com[i]) st++; 
//					
//					else bl++; 
//					
//					System.out.println(st + "스트라이크 " + bl + "볼입니다.\n");
//					 
//					if (st==3) {						  
//						 System.out.println("축하합니다 : " + countgame+"번 만에 맞추셨습니다.");
//						 break;
//					}
//					if (bl==4) {
//						 System.out.println("아웃 입니다.");
//						 break;
//					}
//					 
//				 }break;	
//			} 
//		}
//
//}