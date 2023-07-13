package Saiem;
import java.util.*;
public class Greatestof_3num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a=sc.nextInt();
		System.out.println("Enter Second number: ");
		int b=sc.nextInt();
		System.out.println("Enter Third number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("First num is the greatest "+a);
			
		}
		else if(b>a && b>c) {
			System.out.println("Second Number is greatest"+b);
		}
		else {
			System.out.println("Third number is greatest "+c);
		}

	}

}
