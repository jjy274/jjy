import java.util.Scanner;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c,d;
		
		System.out.print("아동 수:");
		int a = sc.nextInt();
		System.out.print("성인 수:");
		int b = sc.nextInt();
		
		c= a+b;
		System.out.println("총수량 :"+c);
		
		d=a*6000 + b*8000;
		System.out.println("금액 :" + d);
	}

}