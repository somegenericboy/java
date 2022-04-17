import java.util.Scanner; //jave폴더 안의 util 폴더 안의 scanner 호출 

public class 소스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    int num1 = 10;
//	    int num2 = 20;
//        
//	    int sum = 0;
//	    int sum1 = 0;
//	    sum = num1 + num2;
//	    sum1 = num1 * num2;
//	    
//	    System.out.println(sum);
//	    System.out.println(sum1);
//	    
//	    
		
		
/*		int i = 97; //정수의 기본형은 int
		double f = 3.15f; //실수의 기본형은 double(8바이트) --->값에 붙은 f는 float(4바이트) --->변수는 double로, 값은 double로 초기화
		
	    System.out.printf("%d\n", i);
	    System.out.printf("%5d\n", i);
	    System.out.printf("%05d\n", i);
	    System.out.printf("%.f\n", f);
	
*/
		
		
		
		Scanner in = new Scanner(System.in); // Scanner 객체 생성(객체이름: in)
		
		System.out.print("첫번째 정수 입력>>");
		int x = in.nextInt(); // nextInt --> 문자를 정수로 변환
		System.out.print("두번째 정수 입력>>");
		int y = in.nextInt(); // nextInt --> 문자를 정수로 변환
		System.out.printf("%d * %d = %d 입니다.", x, y, x*y);
	}
}


