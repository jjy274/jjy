import java.util.Scanner;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c,d;
		
		System.out.print("�Ƶ� ��:");
		int a = sc.nextInt();
		System.out.print("���� ��:");
		int b = sc.nextInt();
		
		c= a+b;
		System.out.println("�Ѽ��� :"+c);
		
		d=a*6000 + b*8000;
		System.out.println("�ݾ� :" + d);
	}

}