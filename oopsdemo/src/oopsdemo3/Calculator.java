package oopsdemo3;
//program to understand the concept of interface	
import java.util.Scanner;

public class Calculator implements IMath{
     Scanner kb;
	@Override
	public void add() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("SUbtraction of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Mul of "+a+" and "+b+" is "+s);
		
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Div of "+a+" and "+b+" is "+s);

		
	}

	void display()
    {
        System.out.println("My Calculator - Designed by Kal");
    }

}
	