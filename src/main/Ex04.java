package main;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형에는 4가지 종류가 있고, 양수/음수/0 값을 저장 할 수 있다
		short s = 10;
		byte b = 10;
		int i = 10;
		long l = 10; // 식별자 생략가능
		l = 12345678900l; //int형 범위를 넘어갈 때는 반드시 식별자를 명시해야한다
		//long형은 식별자 l만 가능(이름은 상관x)
		
		
		System.out.println( s + b ); //서로 다른 자료형으로 더하기 연산을 할 수 있다
		
		
		b = -128; //값을 교체할때 선언된 것을 다시 선언할 필요없이 값만 수정하면 됨
		
		
		b = 127;
		
		
			

	}

}
