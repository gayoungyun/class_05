package collection.main;

import java.util.Scanner;

import collection.service.MemberService;
import collection.service.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		MemberService ms = new MemberServiceImpl();
		while(true) {
			System.out.println("1.회원관리");
			System.out.println("2.로그인기능");
			System.out.println(">>> : ");
			num= input.nextInt();
			switch(num) {
			case 1 : 
				ms.display();
				//ms.register();
				break;
			case 2 : 
				//ms.memberViews();
				break;
			}
		}
	}

}
