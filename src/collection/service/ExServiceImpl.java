package collection.service;

import java.util.ArrayList;
import java.util.Scanner;

import collection.dao.ExDAO;
import collection.dto.ExDTO;

public class ExServiceImpl implements ExService{
	ExDAO dao;
	public ExServiceImpl() {
		dao= new ExDAO();
	}
	public void register() {
		System.out.println("회원가입 기능");
		String name, addr;
		ExDTO dto = new ExDTO();// 반복되는것이 나올때 위치확인
		Scanner input = new Scanner(System.in);
		System.out.println("이름입력");
		name = input.next();
		System.out.println("주소입력");
		dto.setAddr(input.next());
		dto.setName(name);
		dao.register(dto); //register dao에 저장한다?

	}
	public void display() {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 저장");
			System.out.println("2. 목록확인");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 종료");
			System.out.println(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 :
				register();
				break;
			case 2 :
				view();
				break;
			case 3 :
				search();
				break;
			case 4 :
				modify();
				break;
			case 5 :
				return;

			}
		}
	}
	public void view() {
		System.out.println("목록보는 기능");
		ArrayList<ExDTO> arr =  dao.getData();
		for(ExDTO m : arr) {
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
		ExDTO m = dao.search(name);
		if( m == null) {
			System.out.println(name+"사용자는 없습니다");
		}else {
			System.out.println("이름 : "+m.getName());
			System.out.println("주소 : "+m.getAddr());
		}
	}
	public void modify() {
		//ArrayList<ExDTO> arr =  dao.getData();
		Scanner input = new Scanner(System.in);
		String name; 
		String addr;
		ExDTO dto = new ExDTO();
		System.out.println("1.이름 수정");
		System.out.println("2.주소 수정");
		System.out.println(">>> ");
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println("이름변경");
			dto.setName(input.next());
		}if(choice ==2) {
			System.out.println("주소변경");
			dto.setAddr(input.next());
			//dto.setName(name);
			dao.modify(dto);
		}
		System.out.println("이름 : "+dto.getName());
		System.out.println("주소 : "+dto.getAddr());
	}

}






