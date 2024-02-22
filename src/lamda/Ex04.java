package lamda;

import java.util.Scanner;

interface Test04{
	public void test();
}
class TestClass04{
	public void testClass(Test04 t) {
		System.out.println("기능 실행합니다");
		t.test();
	}

}
public class Ex04 {
	public static void main(String[] args) {
		TestClass04 t01 = new TestClass04();
		Test04 t04 = new Test04() {
			public void test() {
				System.out.println("test실행됩니다");
				
			}
		};
		t01.testClass(t04);

		t01.testClass(new Test04() {
			public void test() {
				System.out.println("test111실행됩니다");
			}
		}
	
	};
	//Scanner input = new Scanner(System.in);
	//String ss =input.next();
	Test04 t1 = ( )-> {
		System.out.println("t1실행");
	};
	t01.testClass(t1);		
	t01.testClass( ( )-> {
		System.out.println("t11111실행");
	});		
	
}


