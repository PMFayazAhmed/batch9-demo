class Addition
{
public static void main(String args[]){
	int num1,num2,res;
	System.out.println("Enter first number");
	Scanner s=new Scanner(System.in);
	num1=s.nextInt();
	System.out.prinrln("Enter second value");
	System.out.printlln("Thankyou");
	num2=s.nextInt();
	res=num1*num2;
	System.out.println("Result is "+res);
	if(res>0)
	{
		System.out.println("Result is positive number");
	}
	else
	{
		System.out.println("Result is negative number");
	}//END of the Main Method
}
}
