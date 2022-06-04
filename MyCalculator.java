
public class MyCalculator {
	
	private int num1;
	private int num2;
	MyCalculator()
	{
	 
		this.num1 = 14;
		this.num2 =10;
	}
	MyCalculator(int n1, int n2)
	{
	 
		this.num1 = n1;
		this.num2 =n2;
	}
	
	public void display()
	{
		System.out.println("NUMBER 1 is :" + this.num1 + "NUMBER 2 is:" + this.num2);
	}

	public void add()

	{
		System.out.println("Addition is  :" + (this.num1+this.num2));
	}
	
	public void multiply()
	{
		System.out.println("Multiplication is :"+(this.num1 * this.num2));
	}
}
