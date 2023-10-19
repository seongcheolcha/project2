package main;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수형의 강제 형변환
		int i = 1000; // byte형은 100을 표현할 수 없으므로 값이 손실된다.
		byte b = (byte) i;// 강제형변환이 발생할때는 (byte)처럼 자료형을 정확히 명시해주어야한다.
		System.out.println(b);  //-24
		
		//	실수형의 강제 형변환
		double d = 1.2;
		float f = (float) d; //강제형변환이 발생할때는 (float) 같은 자료형을 정확히 명시해주어야한다.
		
		//	정수형과 실수형의 강제형변환
		int i2 = (int) f;  //int와 float형은 크기는 같지만 float형이 더 정밀한 자료형이다.
		System.out.println(i2);  //1
		//소수점 아래를 잃었기 때문에 1.2에서 1이 됨 (강제형변환의 특징)
		
		
		
		

	}

}
