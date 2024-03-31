
public class VariableEX {

	  public static void main(String[] args) {
		/* int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000; //변수 age 값에 2000을 더해서 변수 year에 저장
		age = age + 1; //변수 age에 저장된 값을 1증가시킨다.
		
		System.out.println(year);
		System.out.println(age); 
		  
	
	int x = 10;
	int y = 20;
	int tmp = 0;
	
	System.out.println("x:"+ x + "y:" + y);
	
	tmp = x;
	x = y;
	y = tmp;

	System.out.println("x:"+ x + "y:" + y ); 
	*///----------- 변수의 선언과 초기화
	
	/* int octNum = 010; // 8진수 10, 10진수로는 8
	int hexNum = 0x10; // 16진수 10, 10진수로는 16
	int binNum = 0b10; // 2진수 10, 10진수로는 2
	
	long big = 100_000_000_000L; // long big = 100000000000L;
	long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long hex = FFFFFFFFFFFFFFFFFL;
	
	float pi = 3.14f; 
	double rate = 1.618d; 
	
	String name = "ja" + "va";
	String str = name + 8.0;
	
	System.out.println(name);
	System.out.println(str);
	System.out.println(7 + " ");    // 빈 문자열을 더해서 숫자를 문자열로 변환한다.
	System.out.println(" " + 7);
	System.out.println(7 + "");
	System.out.println("" + 7);
	System.out.println(""+"");
	System.out.println(7 + 7 + "");
	System.out.println("" + 7 + 7); */ 
		  //--------------------- 상수와 리터럴 
	
	byte b = 1;
	byte s = 2;
	byte c = 'A';
	
	int finger = 10;
	long big = 100_000_000_000L;
	long hex = 0xFFFF_FFFF_FFFF_FFFFL ; // long hex = 0xFFFFFFFFFFFFFFFFL;
	
	int octNum = 010; //8진수 10, 10진수로는 8
	int hexNum = 0x10; //16진수 10, 10진수로는 10
	int binNum = 0b10; //2진수 10, 10진수로는 2
	
	System.out.printf("b=%d%n",b);
	System.out.printf("s=%d%n",s);
	System.out.printf("c=%c, %d %n",c, (int)c);
	System.out.printf("finger=[%5d]%n", finger);
	System.out.printf("finger=[%-5d]%n", finger);
	System.out.printf("big=%d%n", big);
	System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
	System.out.printf("octNum=%o, %d%n", octNum, octNum);
	System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
	System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	
	} // main

} // class
