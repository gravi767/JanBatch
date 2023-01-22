package pkg_1;

public class Arithmatic 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}
	public int sub(int d,int e)
	{
		int f=d-e;
		System.out.println("sub result is"+f);
		return f;
	}
public void multi(int s1,int s2)
{
	int s3;
	s3= s1*s2;
	System.out.println("final result is"+s3);
	}
public static void main(String[] args)
{
	Arithmatic ref= new Arithmatic();
	int sumresult=ref.sum(12,2);
	int subresult=ref.sub(10,2);
	ref.multi(sumresult,subresult);
	
}
}
