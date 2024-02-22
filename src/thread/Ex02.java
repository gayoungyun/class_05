package thread;
class MyThread{
	public void start() {
		run();
	}
	public void run() {
		System.out.println("부모 run");
	}
}
class A02 extends MyThread{
	public void run() {
		System.out.println("자식 run 실행");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		A02 a = new A02();
		//a.run();
		a.start();
	}

}
