package collection.service;

import java.util.ArrayList;
import java.util.Scanner;
import collection.dao.ExDAO02;
import collection.dto.ExDTO02;

public class ExServiceImpl02 implements ExService02{
	ExDAO02 dao;
	public ExServiceImpl02(){
		dao = new ExDAO02();
	}
	
	public void register() {
		System.out.println("회원가입 기능입니다!!");
		String name, addr;
		ExDTO02 dto = new ExDTO02();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		dto.setName(sc.next());
		System.out.println("주소 입력");
		dto.setAddr(sc.next());
		dao.register(dto);
		
	}
	public void MemberViews() {
		System.out.println("목록보는 기능입니다");
		ArrayList<ExDTO02> arr = dao.getData();
		for(ExDTO02 m : arr) {
			System.out.println("이름 : "+m.getName());
			System.out.println("주소 : "+m.getAddr());
			System.out.println("------------------");
		}
 	}
	public void search() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("검색할 이름 입력");
		name = sc.next();
		ExDTO02 m = dao.search(name);
		if(m == null) {
			System.out.println(name+"사용자는 없습니다");
		}else {
			System.out.println("이름 : "+m.getName());
			System.out.println("주소 : "+m.getAddr());
		}
	}
	public void display() {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 저장");
			System.out.println("2. 목록확인");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
			System.out.println(">>> : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				register();
				break;
			case 2 :
				MemberViews();
				break;
			case 3 :
				search();
				break;
			case 4:
				return;
			}
		}
	}

}






