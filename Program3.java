//Program to check eligibility of voting
package Saiem;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not Eligible");
		}		
	}
}
//Program to print Greatest of 3 nos
/* package Saiem;
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


*/


/*//Even or odd
package Saiem;
import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
		

	}

}

*/
