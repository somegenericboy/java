import java.util.Scanner; //입력 함수 scanner를 사용하기 위해 반드시 입력
public class SampleJavaTest {

	/*
	 * // static : 정적초기화(자바에서 0순위, 프로그램이 실행될때 한번만 초기화 ---> 몇번 호출해도) static void
	 * turnOn(int num) { //메서드는 누군가가 호출해야만 실행, SampleJavaTest 라는 클래스 내의 turnOn 이라는 메서드를 선언이 아니라 정의하는 부분 {
	 * System.out.printf("현재 온도 %d도, 에어컨을 가동합니다.", num); }else {
	 * System.out.printf("현재 온도 %d도, 에어컨 가동불가.", num); }
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * turnOn(20); //메서드 선언 int num = (); //turnOff(19); }
	 * 
	 * 
	 * void turnOn(int num) { if(num > 25) {
	 * System.out.println("현재 온도 %d도, 에어컨을 가동합니다.", num); }
	 * 
	 * }
	 */
//
//       static void printGrade(int score) { //SampleJavaTest 라는 클래스 내의 printGrade 라는 메서드를 정의
//    	   String grade = ""; //문자열은 ""로 초기화 ("" = null)
//    	   if(score>=90) {
//    		   grade="A";
//    	   }else if(score>=80) {
//    		   grade="B";
//    	   }else if(score>=70) {
//               grade="c";
//    	   }else {
//    		   grade="D";
//    	   }
//           System.out.printf("%d점 - 학점 %s\n", score, grade);
//       }
//       
//       public static void main(String[] args) {
//    	   printGrade(85);
//    	   printGrade(75);
//    	   printGrade(55);
//    	   printGrade(95);
//    	   
//       }
	
 
	
	
	
	
	
//	static void printGrade(int score) {//학점 메서드를 switch~case 로 
//    int std=score/10;
//    switch(std){
//    
//    case 10 :
//    	System.out.println("%d점 - A학점");
//    case 9 :
//    	System.out.println("%d점 - A학점");
//    case 8 :
//    	System.out.println("%d점 - B학점");
//    case 7 :
//    	System.out.println("%d점 - C학점");
//    default:
//    	System.out.println("%d점 - D학점");
//    
//    
//    
//    
//    
//    
//    
//    
//    }
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  
	
//       static void light(String color) {
//    	   switch(color) { //메서드의 매개변수 color가 기준값이 됨
//    	   case "RED":  //상태
//    		   System.out.println("빨간불이 켜집니다");
//    		   break; //swtich-case 구문은 break가 없으면 멈추지 않고 모든 case의 실행문을 수행한다. --->break와 main 함수에 주석을 걸어서 실험해보자.
//    	   case "YELLOW":  //상태
//    		   System.out.println("노란불이 켜집니다");
//    		   break;
//    	   case "GREEN":  //상태
//    		   System.out.println("초록불이 켜집니다");
//    		  // break;
//    	   default:
//    		   System.out.printf("잘못된 색 입력 :  %s\n", color); //default: case 이외의 경우
//    	   }
//       }
//       public static void main(String[] args) {
//    	   light("RED");
//    	   light("YELLOW");
//    	   light("GREEN");
//    	   light("BLUE");
//       }
	
	
	
	
	
	
	
	
	
	
	
    /* public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in); //암기
    	 int num;
    	 
    	 System.out.printf("1~4 중에서 하나를 선택 >>");
    	 num = in.nextInt(); //입력받은 데이터를 정수로 변환
    	 switch(num) {
    	 case 1:
    		 System.out.println("1을 선택");
    		 break;
    	 case 2:
    		 System.out.println("2를 선택");
    		 break;
    	 case 3:
    		 System.out.println("3을 선택");
    		 break;
    	 case 4:
    		 System.out.println("4를 선택");
    		 break;
    	 default:
    		 System.out.println("잘못된 입력");
    		 break;
    	 }*/
       
   
	
	
	
	
	
/*public static void main(String[] args) {
	
//	int a = 11 ;
//	
//	
//	a++; // a에 1을 더해서 다시 a에 대입 --->변수 a는 기존의 메모리 공간에는 10을 남겨둔채 새로운 공간을 할당받아 11이란 값을 저장하게 된다.
//	System.out.printf("a++ ==> %d\n", a);
//	
//	a+=5;  
//	System.out.printf("a+=5 ==> %d\n", a);
//	
//	a/=5; //a를 5로 나눈 몫 
//	System.out.printf("a/=5 ==> %d\n", a);
//	
//	a%=5;  //a를 5로 나눈 나머지
//	System.out.printf("a %%= 5 ==> %d\n", a); //%를 형식문자가 아닌 문자로 사용하려면 %를 하나 더 
//	

	//<전열, 후열 증가연산자> 
	int a = 10, b;
	b = a++; //증가 연산자가 후열에 있으므로 대입 연산자가 먼저 실행된 후 증가 연산자가 실행 -->a의 값 10을 b에 먼저 대입하고 a에 1이 더해진다 ---> b에는 10이 저장된다.
	System.out.printf("b=%d\n", b); 
	b = ++a ; //증가 연산자가 전열에 있으므로 증가 연산자가 먼저 실행된 후 대입 연산자가 실행 -->a의 값이 11에서 1 증가해서 11이 되고 b에 대입 ---> b에는 12가 저장된다.
	System.out.printf("b=%d\n", b); 
	 
	

 }
	*/



//  public static void main(String[] args) {
//		
//		
//		/*int i;
//		for (i=0; i<5 ; i++) {
//			System.out.println("Hello World!");
//		}*/
//		
//		
//		int n;
//		for (n=5 ; n>0; n--) {
//			
//		    System.out.printf("%d : Hellow World!\n",n);	
//		}
//
//  
	
/*        int sum=0;
        int i;
        
        for (i =1 ; i <=10 ; i++) {
        	sum = sum + i;
        }
        System.out.printf("1부터 10 까지의 합은 %d", sum);
  }
*/
	  
  
/*       int sum=0;
       int i;
       for (i = 501; i <= 1000; i+=2) {
    	   sum = sum + i;
    	   
       }
       System.out.printf("500부터 1000까지 홀수의 합은 %d",sum);
  }
*/
	 
/*  System.out.printf("1부터 입력하신 자연수 까지의 합을 알려드립니다. 값을 입력하세요. >>>");
  Scanner in = new Scanner(System.in);
  int num;
  num = in.nextInt();
  
  if (num<1) {
	  System.out.println("1보다 큰 자연수를 입력하세요.");
	  
  }else {
	  int i;
	  int sum=0;
	  for (i=1; i<=num ; i++) {
		  sum = sum + i;
		  
	  }
	  System.out.printf ("1부터 %d 까지의 합은 %d", num,sum);
  }
 
  }
*/  
 public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int i; int dan;
		 * System.out.print("구구단의 단수를 입력 >>>"); dan = in.nextInt();
		 * 
		 * for (i=1; i<=9; i++) { System.out.printf("%d x %d = %d\n", dan, i, dan*i); }
		 * System.out.printf("i = %d", i);
		 * 
		 * 
		 * 
		 */	  
	 
	  int dan;
	  int n;
	  for (dan=2; dan<=9; dan++) {
		  for (n=1; n<=9; n++) {
			  System.out.printf("%dx%d=%d\n", dan, n, dan*n);
		  }
		  System.out.println("");
	  }
	 }
}
