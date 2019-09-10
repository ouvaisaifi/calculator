import java.util.*;
class calculator
{
public sttaic void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 to add , 2 to substract, 3 to multiply, 4 to divide");

while(True)
{
	int m=sc.nextInt();
	if(m==1)
	{
		System.out.println("Enter the 2 numbers for addition);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("sum="+sum);
	}
}
}
