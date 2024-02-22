package collection.service;


import java.util.ArrayList;
import java.util.Scanner;

import collection.dao.ExDAO01;
import collection.dto.ExDTO01;
//import collection.service.ExServiceImpl01;

public class ExServiceImpl01 implements ExService01{
	ExDAO01 dao;
	public ExServiceImpl01(){
		dao = new ExDAO01();
	}
	public void register() {
		System.out.println("회원가입 기능입니다");
		String name, addr;
		Scanner input = new Scanner(System.in);
		ExDTO01 dto = new ExDTO01();
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("주소 입력");
		addr = input.next();
		dao.register(dto);
	}
	public void view() {
		System.out.println("목록보는 기능입니다");
		ArrayList<ExDTO01> arr= dao.getData();
		for(ExDTO01 m : arr) {
			System.out.println("이름 : "+m.getName());
			System.out.println("주소 : "+m.getAddr());
			System.out.println("------------------");
		}
	}
	public void search() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("검색할 이름 입력");
		name = input.next();
		ExDTO01 m = new ExDTO01();
		if( m == null) {
			System.out.println(name+"사용자는 없는 이름입니다");
		}else {
			System.out.println("이름 : "+m.getName());
			System.out.println("주소 : "+m.getAddr());
		}
	}
	public void display() {
		Scanner input= new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 회원저장");
			System.out.println("2. 목록보기");
			System.out.println("3. 회원검색");
			System.out.println("4. 종료");
			num = input.nextInt();
			switch(num) {
			case 1: 
				register();
				break;
			case 2:
				view();
				break;
			case 3:
				search();
				break;
			case 4:
				return;
			}
		}
	}

}

