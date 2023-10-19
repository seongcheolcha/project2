package quiz;

public class quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double d =1.2;
		float f = 0.9f;
		
		
		int i = (int) d; // 1
		int i2 = (int) f; // 0
		int i3 = (int) d + (int) f; // 1
		int i4 = (int) (d + f); // 2, f->d로 형변환되어 d+d -> (1.2+0.9)
		
		System.out.println(i);  //int형은 소수점 표기x, 소수점 아래를 잃어서 1
		System.out.println(i2); //int형은 소수점 표기x, 소수점 아래를 잃어서 0
		System.out.println(i3); //두 실수가 각각 형변환되어 더해져서 1이 됨
		System.out.println(i4); //값을 더해서 2.1이지만 형변환되면서 소수점 아래를 잃어서 2

	}

}
