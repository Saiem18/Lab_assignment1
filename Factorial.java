package Saiem;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int fact=1;
	while(num>=1) {
		fact=fact*num;
		num--;
	
	}	
	System.out.println("The factorial is: "+fact);

	}

}
