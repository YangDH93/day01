package day01;

public class Ex02 {
	public static void main(String[] args) {
		
		System.out.println(100 + 100); // 실수
		System.out.println(100.123 + 100); // 정수
		System.out.println("100"); // 문자
		
		System.out.println("백"+100);
		System.out.println("100"+"100");
		System.out.println("백"+100+100);
		// 백 + 100 하면 연산된 문자가 된 상태에서 + 100 이 되기 때문에 
		// 결과가 백100100 이 된다 	
	}
}
