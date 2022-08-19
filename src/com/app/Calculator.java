/*package com.app;
import java.lang.Math;
import java.util.Scanner;*/

public class Calculator {
private static int X,Y;
Scanner s= new Scanner(System.in);
private double R;
public void init(int X,int Y){
	this.X=X;
	this.Y=Y;
}
public void add()
{
	System.out.println("Add");
	R=X+Y;
}
public void multiply()
{
	System.out.println("Multiplication");
	R=X*Y;
}
public void power()
{
	int f=1;
	System.out.println("Power");
	//R=Math.pow(X,Y);
	for(int i=1;i<=Y;i++)
	{
		f*=X;
	}
	R=f;
}
public void percentage() {
	int arr[],sum=0,x;
	float perc;
	arr=new int[5];
	System.out.println("enter the marks for the 5 subjects");
	for(int i=0;i<arr.length-1;i++) {
		x= s.nextInt();
		arr[i]=x;
	}
	System.out.println("The sum is :");
	for(int i=0;i<arr.length-1;i++) {
		sum=sum+arr[i];
	}
	System.out.println(sum);
	perc=(sum*100)/500;
	System.out.println("Percentage is: "+perc);
}
public void display()
{
	//System.out.println("Power");
	System.out.println("The value is :"+R);
}
public static void main(String[] args)
{
	char choice;
	Scanner s= new Scanner(System.in);
	Calculator m= new Calculator();
	System.out.println("Enter your choice\nA: Addition\nB: Multiplication\nC: Power\n Any number to Exit");
	choice=s.next().charAt(0);
	switch(choice){
	
		case 'A':
		{
			System.out.println("Enter the 2 numbers");
			X=s.nextInt();
			Y=s.nextInt();
			m.init(X, Y);
			m.add();
			m.display();
			break;
		}
		case 'B':
		{
			System.out.println("Enter the 2 numbers");
			X=s.nextInt();
			Y=s.nextInt();
			m.init(X, Y);
			m.multiply();
			m.display();
			break;
		}
		case 'C':
		{
			System.out.println("Enter the 2 numbers");
			X=s.nextInt();
			Y=s.nextInt();
			m.init(X, Y);
			m.power();
			m.display();
			break;
		}
		case 'D':
		{
			m.percentage();
			break;
		}
		default: 
			break;
	}
}
}

