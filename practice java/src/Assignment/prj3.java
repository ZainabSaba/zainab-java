package Assignment;

interface Arithmetic
{
	public void arithmetic();
}
interface Logic
{
	public void operationLogic();
}
interface compare
{
	public void comparison();
}
interface Bitwise
{
	public void otheroperation();

}
interface Incredecre
{
	public void operation();
}

class Operators implements Arithmetic,Logic,compare,Bitwise,Incredecre
{
	public void arithmetic()
	{
		System.out.println("Addition operation: "+(2+3));
		System.out.println("subtraction operation: "+(30-12));
		System.out.println("Multiplication operation: "+(4*3));
		System.out.println("Divison operation: "+(2/3));
	}
	
	public void operationLogic()
	{
		System.out.println((5<6) && (8<5));
		System.out.println((5>6) || (8<5));
		System.out.println(!(2==1));
		
	}
	public void comparison()
	{
		System.out.println((12>4));
	}
	public void otheroperation()
	{
		
		System.out.println("x=4 | y=6 " + (4|6));
		System.out.println("m=8 ^ n=3 " + (8^3));
		
	}
	public void Incredecre()
	{
		int a=2;
		a++;
		System.out.println("Increment a= " +a);
		int b=3;
		b--;
		System.out.println("decrement b= " +b);
		
	}

}

public class prj3 {
	public static void main(String args[])
	{
		Operators opr=new Operators();
		opr.arithmetic();
		opr.operationLogic();
		opr.comparison();
		opr.otheroperation();
		opr.Incredecre();
	}
}
		
	