package collection.main;

import java.util.Scanner;
import collection.service.ExService01;
import collection.service.ExServiceImpl01;

public class MainEx01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		ExService01 ms = new ExServiceImpl01();

		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인기능");
			num = input.nextInt();
			switch(num){
			case 1 :
				ms.display();
				break;
			case 2 :
				break;
				
			}
		}
	}
}
