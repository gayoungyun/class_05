package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Dto001{
	//private String kor, eng, math;
	private int kor , eng, math;
	private int sum= 0;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
public class quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kor, eng, math;
		ArrayList<Dto001> arr = new ArrayList<>();
		int sum;
		int cho;
		while(true) {
			System.out.println("1. 국어 영어 수학 점수");
			System.out.println("2. 모든 내용 확인");
			int num = sc.nextInt();
			Dto001 d = new Dto001();// 위치가 main아래있으면  앞에 저장된것이 사라짐
			switch(num) {
			case 1:
				System.out.println("국어 영어 수학 입력");
				kor= sc.next();
				d.setKor(num);
				eng= sc.next();
				d.setEng(num);
				math= sc.next();
				d.setMath(num);
				arr.add(d);
				d.setSum(kor+eng+math);
				System.out.println("저장되었습니다!");
				break;
			
			case 2 :
				System.out.println("--- 모든 내용 ---");
				for(Dto001 dd :arr) {
					dd.setSum(sum);
					
					System.out.println("국어점수 : "+dd.getKor());
					System.out.println("영어점수 : "+dd.getEng());
					System.out.println("수학점수 : "+dd.getMath());
					System.out.println("---------------");
					dd.setSum(sum);
					//sum = dd.getSum();
					//System.out.println("합계 : "+dd.getKor());
				}
				break;
			}
		}
	}

}












