package nadoJava;

import java.util.Iterator;

public class NadoFor {

	public static void main(String[] args) {
//		for(int i=0;i<10;i++) {
//			System.out.println("Hello Coding "+i);
//			

		
		//for (초기화, 반복조건, 반복실행) {실행문}
//		for (int i = 5; i <= 20; i = i + 2) {
//			System.out.println("one " + i);
//			System.out.println("Thank you!");
////		
		// 반복문으로 배열 꺼내기
		String [] group_name = {"동구","밖","과수원","길"};
//		for (int i=0;i<group_name.length;i++) {
//			String place = group_name[i];
//			System.out.println( place + "에서 놀자!");
//			
//		}
		
		for (String e : group_name) {
			System.out.println(e + "에서 놀자!");
		}
		
		
		
		
	}
}

