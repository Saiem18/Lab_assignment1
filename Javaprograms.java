//WAP a program to accept R from the user and calculate AC and CC

package Saiem;
import java.util.*;
public class Javaprograms {

	public static void main(String[] args) {
		System.out.println("Enter the value of radius: ");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		//Area calculation
		float area=(22/7)*(r*r);
		System.out.println("Area of circle is: "+area);
		//Circumference of Circle
		float Circumference=2*(22/7)*r;
		System.out.println("Circumference of circle is: "+Circumference);
	

	}

}
