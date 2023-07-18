package Saiem;
import java.util.Scanner;

public class Program2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,choices;
		Scanner sc=new Scanner(System.in);
		System.out.println("1 = Arthmetic operator\n"
				+ "2 = Assigment operator\n"
				+ "3 = Relational operator\n"
				+ "4 = Logical operator");
		System.out.println("Select Operator Number");
		choice1=sc.nextInt();
		switch(choices) {
		case 1:
			System.out.println("enter value of a");
			a=sc.nextInt();
			System.out.println("enter value of b");
			b=sc.nextInt();
			System.out.println("a+b="+(a+b));
			System.out.println("a-b="+(a-b));
			System.out.println("a*b="+(a*b));
			System.out.println("a/b="+(a/b));
			System.out.println("a%b="+(a%b));
			break;
			
		case 2:
			System.out.println("enter value of a");
			a=sc.nextInt();
			System.out.println("enter value of b");
			b=sc.nextInt();
			System.out.println("a=b="+(a=b));
			System.out.println("a+=b="+(a+=b));
			System.out.println("a-+b="+(a-=b));
			System.out.println("a*=b="+(a*=b));
			System.out.println("a/=b="+(a/=b));
			System.out.println("a%=b="+(a%=b));
			break;
			
		case 3:
			System.out.println("enter value of a");
			a=sc.nextInt();
			System.out.println("enter value of b");
			b=sc.nextInt();
			System.out.println("a=b="+(a==b));
			System.out.println("a+=b="+(a!=b));
			System.out.println("a-+b="+(a>b));
			System.out.println("a*=b="+(a<b));
			System.out.println("a/=b="+(a>=b));
			System.out.println("a%=b="+(a<=b));
			break;
			
		case 4:
			System.out.println("enter value of a");
			a=sc.nextInt();
			System.out.println("enter value of b");
			b=sc.nextInt();
			System.out.println("Logical && (a<b&&a>b)="+((a<b)&&(a>b)));
			System.out.println("Logical || (a!=b||a>=)="+(a!=b || a>=b));
			System.out.println("Logical ! !(a>b&&a<=b)="+(!(a>b&&a<=b)));
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
			
			
		}
		

	}

}
