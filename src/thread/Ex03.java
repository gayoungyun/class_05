package thread;

import java.util.Scanner;
class A03 extends Thread{
	public void run() {
		for( ; ; ) {
			System.out.println("문자가 날라왔습니다!!");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String str;
		A03 a = new A03();
		a.setDaemon(true);//현재 스래드 종료시키는 시점(같이 종료)
		a.start();
		
		while(true) {
			System.out.println("문자열 입력 : ");
			str = input.next();
			System.out.println("입력한 값 : "+str);
			if(str.equals("end")) {
				System.out.println("종료합니다");
				break;
			}
		}
		System.out.println("main이 종료됩니다");
	}

}
